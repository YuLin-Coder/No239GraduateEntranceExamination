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


import com.dao.KaoyanzixunDao;
import com.entity.KaoyanzixunEntity;
import com.service.KaoyanzixunService;
import com.entity.vo.KaoyanzixunVO;
import com.entity.view.KaoyanzixunView;

@Service("kaoyanzixunService")
public class KaoyanzixunServiceImpl extends ServiceImpl<KaoyanzixunDao, KaoyanzixunEntity> implements KaoyanzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanzixunEntity> page = this.selectPage(
                new Query<KaoyanzixunEntity>(params).getPage(),
                new EntityWrapper<KaoyanzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanzixunEntity> wrapper) {
		  Page<KaoyanzixunView> page =new Query<KaoyanzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanzixunVO> selectListVO(Wrapper<KaoyanzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanzixunVO selectVO(Wrapper<KaoyanzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanzixunView> selectListView(Wrapper<KaoyanzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanzixunView selectView(Wrapper<KaoyanzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
