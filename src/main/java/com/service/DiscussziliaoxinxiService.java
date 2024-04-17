package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussziliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussziliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussziliaoxinxiView;


/**
 * 资料信息评论表
 *
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface DiscussziliaoxinxiService extends IService<DiscussziliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussziliaoxinxiVO> selectListVO(Wrapper<DiscussziliaoxinxiEntity> wrapper);
   	
   	DiscussziliaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
   	
   	List<DiscussziliaoxinxiView> selectListView(Wrapper<DiscussziliaoxinxiEntity> wrapper);
   	
   	DiscussziliaoxinxiView selectView(@Param("ew") Wrapper<DiscussziliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussziliaoxinxiEntity> wrapper);
   	
}

