package com.entity.view;

import com.entity.DiscusskafeishangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咖啡商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
@TableName("discusskafeishangcheng")
public class DiscusskafeishangchengView  extends DiscusskafeishangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskafeishangchengView(){
	}
 
 	public DiscusskafeishangchengView(DiscusskafeishangchengEntity discusskafeishangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discusskafeishangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
