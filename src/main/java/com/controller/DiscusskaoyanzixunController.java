package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusskaoyanzixunEntity;
import com.entity.view.DiscusskaoyanzixunView;

import com.service.DiscusskaoyanzixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 考研资讯评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
@RestController
@RequestMapping("/discusskaoyanzixun")
public class DiscusskaoyanzixunController {
    @Autowired
    private DiscusskaoyanzixunService discusskaoyanzixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusskaoyanzixunEntity discusskaoyanzixun, HttpServletRequest request){
        EntityWrapper<DiscusskaoyanzixunEntity> ew = new EntityWrapper<DiscusskaoyanzixunEntity>();
		PageUtils page = discusskaoyanzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskaoyanzixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusskaoyanzixunEntity discusskaoyanzixun, HttpServletRequest request){
        EntityWrapper<DiscusskaoyanzixunEntity> ew = new EntityWrapper<DiscusskaoyanzixunEntity>();
		PageUtils page = discusskaoyanzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskaoyanzixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusskaoyanzixunEntity discusskaoyanzixun){
       	EntityWrapper<DiscusskaoyanzixunEntity> ew = new EntityWrapper<DiscusskaoyanzixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusskaoyanzixun, "discusskaoyanzixun")); 
        return R.ok().put("data", discusskaoyanzixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusskaoyanzixunEntity discusskaoyanzixun){
        EntityWrapper< DiscusskaoyanzixunEntity> ew = new EntityWrapper< DiscusskaoyanzixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusskaoyanzixun, "discusskaoyanzixun")); 
		DiscusskaoyanzixunView discusskaoyanzixunView =  discusskaoyanzixunService.selectView(ew);
		return R.ok("查询考研资讯评论表成功").put("data", discusskaoyanzixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusskaoyanzixunEntity discusskaoyanzixun = discusskaoyanzixunService.selectById(id);
        return R.ok().put("data", discusskaoyanzixun);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusskaoyanzixunEntity discusskaoyanzixun = discusskaoyanzixunService.selectById(id);
        return R.ok().put("data", discusskaoyanzixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusskaoyanzixunEntity discusskaoyanzixun, HttpServletRequest request){
    	discusskaoyanzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskaoyanzixun);
        discusskaoyanzixunService.insert(discusskaoyanzixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusskaoyanzixunEntity discusskaoyanzixun, HttpServletRequest request){
    	discusskaoyanzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskaoyanzixun);
        discusskaoyanzixunService.insert(discusskaoyanzixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusskaoyanzixunEntity discusskaoyanzixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusskaoyanzixun);
        discusskaoyanzixunService.updateById(discusskaoyanzixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusskaoyanzixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusskaoyanzixunEntity> wrapper = new EntityWrapper<DiscusskaoyanzixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusskaoyanzixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
