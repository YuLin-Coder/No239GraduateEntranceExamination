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


import com.dao.DiscussziliaoxinxiDao;
import com.entity.DiscussziliaoxinxiEntity;
import com.service.DiscussziliaoxinxiService;
import com.entity.vo.DiscussziliaoxinxiVO;
import com.entity.view.DiscussziliaoxinxiView;

@Service("discussziliaoxinxiService")
public class DiscussziliaoxinxiServiceImpl extends ServiceImpl<DiscussziliaoxinxiDao, DiscussziliaoxinxiEntity> implements DiscussziliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussziliaoxinxiEntity> page = this.selectPage(
                new Query<DiscussziliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussziliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussziliaoxinxiEntity> wrapper) {
		  Page<DiscussziliaoxinxiView> page =new Query<DiscussziliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussziliaoxinxiVO> selectListVO(Wrapper<DiscussziliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussziliaoxinxiVO selectVO(Wrapper<DiscussziliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussziliaoxinxiView> selectListView(Wrapper<DiscussziliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussziliaoxinxiView selectView(Wrapper<DiscussziliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
