package com.dao;

import com.entity.ZiliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaoxinxiVO;
import com.entity.view.ZiliaoxinxiView;


/**
 * 资料信息
 * 
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface ZiliaoxinxiDao extends BaseMapper<ZiliaoxinxiEntity> {
	
	List<ZiliaoxinxiVO> selectListVO(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
	
	ZiliaoxinxiVO selectVO(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
	
	List<ZiliaoxinxiView> selectListView(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);

	List<ZiliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
	
	ZiliaoxinxiView selectView(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
	
}
