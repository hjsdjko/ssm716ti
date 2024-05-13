package com.entity.view;

import com.entity.KafeifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咖啡分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
@TableName("kafeifenlei")
public class KafeifenleiView  extends KafeifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KafeifenleiView(){
	}
 
 	public KafeifenleiView(KafeifenleiEntity kafeifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, kafeifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
