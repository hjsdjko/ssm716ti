package com.entity.view;

import com.entity.DiscusslianxiwomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 联系我们评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
@TableName("discusslianxiwomen")
public class DiscusslianxiwomenView  extends DiscusslianxiwomenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslianxiwomenView(){
	}
 
 	public DiscusslianxiwomenView(DiscusslianxiwomenEntity discusslianxiwomenEntity){
 	try {
			BeanUtils.copyProperties(this, discusslianxiwomenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
