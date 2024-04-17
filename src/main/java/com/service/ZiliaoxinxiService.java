package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaoxinxiView;


/**
 * 资料信息
 *
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface ZiliaoxinxiService extends IService<ZiliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaoxinxiVO> selectListVO(Wrapper<ZiliaoxinxiEntity> wrapper);
   	
   	ZiliaoxinxiVO selectVO(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
   	
   	List<ZiliaoxinxiView> selectListView(Wrapper<ZiliaoxinxiEntity> wrapper);
   	
   	ZiliaoxinxiView selectView(@Param("ew") Wrapper<ZiliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaoxinxiEntity> wrapper);
   	
}

