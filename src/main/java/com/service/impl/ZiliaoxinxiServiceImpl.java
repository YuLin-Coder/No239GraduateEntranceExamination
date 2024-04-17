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


import com.dao.ZiliaoxinxiDao;
import com.entity.ZiliaoxinxiEntity;
import com.service.ZiliaoxinxiService;
import com.entity.vo.ZiliaoxinxiVO;
import com.entity.view.ZiliaoxinxiView;

@Service("ziliaoxinxiService")
public class ZiliaoxinxiServiceImpl extends ServiceImpl<ZiliaoxinxiDao, ZiliaoxinxiEntity> implements ZiliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaoxinxiEntity> page = this.selectPage(
                new Query<ZiliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ZiliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaoxinxiEntity> wrapper) {
		  Page<ZiliaoxinxiView> page =new Query<ZiliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaoxinxiVO> selectListVO(Wrapper<ZiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaoxinxiVO selectVO(Wrapper<ZiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaoxinxiView> selectListView(Wrapper<ZiliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaoxinxiView selectView(Wrapper<ZiliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
