package com.dao;

import com.entity.DiscussbaokaozhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaokaozhinanVO;
import com.entity.view.DiscussbaokaozhinanView;


/**
 * 报考指南评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface DiscussbaokaozhinanDao extends BaseMapper<DiscussbaokaozhinanEntity> {
	
	List<DiscussbaokaozhinanVO> selectListVO(@Param("ew") Wrapper<DiscussbaokaozhinanEntity> wrapper);
	
	DiscussbaokaozhinanVO selectVO(@Param("ew") Wrapper<DiscussbaokaozhinanEntity> wrapper);
	
	List<DiscussbaokaozhinanView> selectListView(@Param("ew") Wrapper<DiscussbaokaozhinanEntity> wrapper);

	List<DiscussbaokaozhinanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaokaozhinanEntity> wrapper);
	
	DiscussbaokaozhinanView selectView(@Param("ew") Wrapper<DiscussbaokaozhinanEntity> wrapper);
	
}
