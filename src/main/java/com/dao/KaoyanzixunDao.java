package com.dao;

import com.entity.KaoyanzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanzixunVO;
import com.entity.view.KaoyanzixunView;


/**
 * 考研资讯
 * 
 * @author 
 * @email 
 * @date 2020-11-30 11:35:09
 */
public interface KaoyanzixunDao extends BaseMapper<KaoyanzixunEntity> {
	
	List<KaoyanzixunVO> selectListVO(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
	
	KaoyanzixunVO selectVO(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
	
	List<KaoyanzixunView> selectListView(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);

	List<KaoyanzixunView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
	
	KaoyanzixunView selectView(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
	
}
