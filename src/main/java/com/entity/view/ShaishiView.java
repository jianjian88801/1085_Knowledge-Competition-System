package com.entity.view;

import com.entity.ShaishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 赛事信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shaishi")
public class ShaishiView extends ShaishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 赛事类型的值
		*/
		private String shaishiValue;



	public ShaishiView() {

	}

	public ShaishiView(ShaishiEntity shaishiEntity) {
		try {
			BeanUtils.copyProperties(this, shaishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 赛事类型的值
			*/
			public String getShaishiValue() {
				return shaishiValue;
			}
			/**
			* 设置： 赛事类型的值
			*/
			public void setShaishiValue(String shaishiValue) {
				this.shaishiValue = shaishiValue;
			}















}
