package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskaoyanzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskaoyanzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskaoyanzixunView;


/**
 * 考研资讯评论表
 *
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface DiscusskaoyanzixunService extends IService<DiscusskaoyanzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskaoyanzixunVO> selectListVO(Wrapper<DiscusskaoyanzixunEntity> wrapper);
   	
   	DiscusskaoyanzixunVO selectVO(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
   	
   	List<DiscusskaoyanzixunView> selectListView(Wrapper<DiscusskaoyanzixunEntity> wrapper);
   	
   	DiscusskaoyanzixunView selectView(@Param("ew") Wrapper<DiscusskaoyanzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskaoyanzixunEntity> wrapper);
   	
}

