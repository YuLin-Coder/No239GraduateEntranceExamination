package com.entity.view;

import com.entity.BaokaozhinanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报考指南
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
@TableName("baokaozhinan")
public class BaokaozhinanView  extends BaokaozhinanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaokaozhinanView(){
	}
 
 	public BaokaozhinanView(BaokaozhinanEntity baokaozhinanEntity){
 	try {
			BeanUtils.copyProperties(this, baokaozhinanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
