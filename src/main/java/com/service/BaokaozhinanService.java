package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaokaozhinanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaokaozhinanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaokaozhinanView;


/**
 * 报考指南
 *
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
public interface BaokaozhinanService extends IService<BaokaozhinanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaokaozhinanVO> selectListVO(Wrapper<BaokaozhinanEntity> wrapper);
   	
   	BaokaozhinanVO selectVO(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
   	
   	List<BaokaozhinanView> selectListView(Wrapper<BaokaozhinanEntity> wrapper);
   	
   	BaokaozhinanView selectView(@Param("ew") Wrapper<BaokaozhinanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaokaozhinanEntity> wrapper);
   	
}

