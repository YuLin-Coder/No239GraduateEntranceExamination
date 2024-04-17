package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusskaoyanzixunDao;
import com.entity.DiscusskaoyanzixunEntity;
import com.service.DiscusskaoyanzixunService;
import com.entity.vo.DiscusskaoyanzixunVO;
import com.entity.view.DiscusskaoyanzixunView;

@Service("discusskaoyanzixunService")
public class DiscusskaoyanzixunServiceImpl extends ServiceImpl<DiscusskaoyanzixunDao, DiscusskaoyanzixunEntity> implements DiscusskaoyanzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskaoyanzixunEntity> page = this.selectPage(
                new Query<DiscusskaoyanzixunEntity>(params).getPage(),
                new EntityWrapper<DiscusskaoyanzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskaoyanzixunEntity> wrapper) {
		  Page<DiscusskaoyanzixunView> page =new Query<DiscusskaoyanzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskaoyanzixunVO> selectListVO(Wrapper<DiscusskaoyanzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskaoyanzixunVO selectVO(Wrapper<DiscusskaoyanzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskaoyanzixunView> selectListView(Wrapper<DiscusskaoyanzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskaoyanzixunView selectView(Wrapper<DiscusskaoyanzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
