package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanzixunView;


/**
 * 考研资讯
 *
 * @author 
 * @email 
 * @date 2020-11-30 11:35:09
 */
public interface KaoyanzixunService extends IService<KaoyanzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanzixunVO> selectListVO(Wrapper<KaoyanzixunEntity> wrapper);
   	
   	KaoyanzixunVO selectVO(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
   	
   	List<KaoyanzixunView> selectListView(Wrapper<KaoyanzixunEntity> wrapper);
   	
   	KaoyanzixunView selectView(@Param("ew") Wrapper<KaoyanzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanzixunEntity> wrapper);
   	
}

