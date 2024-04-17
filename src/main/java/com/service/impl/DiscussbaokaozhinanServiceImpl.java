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


import com.dao.DiscussbaokaozhinanDao;
import com.entity.DiscussbaokaozhinanEntity;
import com.service.DiscussbaokaozhinanService;
import com.entity.vo.DiscussbaokaozhinanVO;
import com.entity.view.DiscussbaokaozhinanView;

@Service("discussbaokaozhinanService")
public class DiscussbaokaozhinanServiceImpl extends ServiceImpl<DiscussbaokaozhinanDao, DiscussbaokaozhinanEntity> implements DiscussbaokaozhinanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaokaozhinanEntity> page = this.selectPage(
                new Query<DiscussbaokaozhinanEntity>(params).getPage(),
                new EntityWrapper<DiscussbaokaozhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaokaozhinanEntity> wrapper) {
		  Page<DiscussbaokaozhinanView> page =new Query<DiscussbaokaozhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaokaozhinanVO> selectListVO(Wrapper<DiscussbaokaozhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaokaozhinanVO selectVO(Wrapper<DiscussbaokaozhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaokaozhinanView> selectListView(Wrapper<DiscussbaokaozhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaokaozhinanView selectView(Wrapper<DiscussbaokaozhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
