package com.entity.view;

import com.entity.RemaishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热卖商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 18:05:33
 */
@TableName("remaishangpin")
public class RemaishangpinView  extends RemaishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemaishangpinView(){
	}
 
 	public RemaishangpinView(RemaishangpinEntity remaishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, remaishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
