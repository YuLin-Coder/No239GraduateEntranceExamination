package com.dao;

import com.entity.DiscusskaoyanzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskaoyanzixunVO;
import com.entity.view.DiscusskaoyanzixunView;


/**
 * 考研资讯评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface DiscusskaoyanzixunDao extends BaseMapper<DiscusskaoyanzixunEntity> {
	
	List<DiscusskaoyanzixunVO> selectListVO(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
	
	DiscusskaoyanzixunVO selectVO(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
	
	List<DiscusskaoyanzixunView> selectListView(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);

	List<DiscusskaoyanzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
	
	DiscusskaoyanzixunView selectView(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
	
}
