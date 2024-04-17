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


import com.dao.BaokaozhinanDao;
import com.entity.BaokaozhinanEntity;
import com.service.BaokaozhinanService;
import com.entity.vo.BaokaozhinanVO;
import com.entity.view.BaokaozhinanView;

@Service("baokaozhinanService")
public class BaokaozhinanServiceImpl extends ServiceImpl<BaokaozhinanDao, BaokaozhinanEntity> implements BaokaozhinanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaokaozhinanEntity> page = this.selectPage(
                new Query<BaokaozhinanEntity>(params).getPage(),
                new EntityWrapper<BaokaozhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaokaozhinanEntity> wrapper) {
		  Page<BaokaozhinanView> page =new Query<BaokaozhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaokaozhinanVO> selectListVO(Wrapper<BaokaozhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaokaozhinanVO selectVO(Wrapper<BaokaozhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaokaozhinanView> selectListView(Wrapper<BaokaozhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaokaozhinanView selectView(Wrapper<BaokaozhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
