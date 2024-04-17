package com.entity.view;

import com.entity.DiscusskaoyanzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考研资讯评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-30 11:35:10
 */
@TableName("discusskaoyanzixun")
public class DiscusskaoyanzixunView  extends DiscusskaoyanzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskaoyanzixunView(){
	}
 
 	public DiscusskaoyanzixunView(DiscusskaoyanzixunEntity discusskaoyanzixunEntity){
 	try {
			BeanUtils.copyProperties(this, discusskaoyanzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
