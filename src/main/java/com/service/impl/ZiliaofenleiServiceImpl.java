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


import com.dao.ZiliaofenleiDao;
import com.entity.ZiliaofenleiEntity;
import com.service.ZiliaofenleiService;
import com.entity.vo.ZiliaofenleiVO;
import com.entity.view.ZiliaofenleiView;

@Service("ziliaofenleiService")
public class ZiliaofenleiServiceImpl extends ServiceImpl<ZiliaofenleiDao, ZiliaofenleiEntity> implements ZiliaofenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaofenleiEntity> page = this.selectPage(
                new Query<ZiliaofenleiEntity>(params).getPage(),
                new EntityWrapper<ZiliaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaofenleiEntity> wrapper) {
		  Page<ZiliaofenleiView> page =new Query<ZiliaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaofenleiVO> selectListVO(Wrapper<ZiliaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaofenleiVO selectVO(Wrapper<ZiliaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaofenleiView> selectListView(Wrapper<ZiliaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaofenleiView selectView(Wrapper<ZiliaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
