package com.entity.view;

import com.entity.ChongwuxihuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 在线学习
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwuxihu")
public class ChongwuxihuView extends ChongwuxihuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 视频类型的值
		*/
		private String chongwuxihuValue;



	public ChongwuxihuView() {

	}

	public ChongwuxihuView(ChongwuxihuEntity chongwuxihuEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuxihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 视频类型的值
			*/
			public String getChongwuxihuValue() {
				return chongwuxihuValue;
			}
			/**
			* 设置： 视频类型的值
			*/
			public void setChongwuxihuValue(String chongwuxihuValue) {
				this.chongwuxihuValue = chongwuxihuValue;
			}















}
