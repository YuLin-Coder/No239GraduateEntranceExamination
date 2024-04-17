package com.dao;

import com.entity.BaokaozhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaokaozhinanVO;
import com.entity.view.BaokaozhinanView;


/**
 * 报考指南
 * 
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface BaokaozhinanDao extends BaseMapper<BaokaozhinanEntity> {
	
	List<BaokaozhinanVO> selectListVO(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
	
	BaokaozhinanVO selectVO(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
	
	List<BaokaozhinanView> selectListView(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);

	List<BaokaozhinanView> selectListView(Pagination page,@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
	
	BaokaozhinanView selectView(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
	
}
