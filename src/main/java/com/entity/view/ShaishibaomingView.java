package com.entity.view;

import com.entity.ShaishibaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 赛事报名信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shaishibaoming")
public class ShaishibaomingView extends ShaishibaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 报名审核的值
		*/
		private String shaishibaomingYesnoValue;



		//级联表 shaishi
			/**
			* 赛事标题
			*/
			private String shaishiName;
			/**
			* 赛事图片
			*/
			private String shaishiPhoto;
			/**
			* 赛事类型
			*/
			private Integer shaishiTypes;
				/**
				* 赛事类型的值
				*/
				private String shaishiValue;
			/**
			* 详情内容
			*/
			private String shaishiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ShaishibaomingView() {

	}

	public ShaishibaomingView(ShaishibaomingEntity shaishibaomingEntity) {
		try {
			BeanUtils.copyProperties(this, shaishibaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 报名审核的值
			*/
			public String getShaishibaomingYesnoValue() {
				return shaishibaomingYesnoValue;
			}
			/**
			* 设置： 报名审核的值
			*/
			public void setShaishibaomingYesnoValue(String shaishibaomingYesnoValue) {
				this.shaishibaomingYesnoValue = shaishibaomingYesnoValue;
			}































				//级联表的get和set shaishi

					/**
					* 获取： 赛事标题
					*/
					public String getShaishiName() {
						return shaishiName;
					}
					/**
					* 设置： 赛事标题
					*/
					public void setShaishiName(String shaishiName) {
						this.shaishiName = shaishiName;
					}

					/**
					* 获取： 赛事图片
					*/
					public String getShaishiPhoto() {
						return shaishiPhoto;
					}
					/**
					* 设置： 赛事图片
					*/
					public void setShaishiPhoto(String shaishiPhoto) {
						this.shaishiPhoto = shaishiPhoto;
					}

					/**
					* 获取： 赛事类型
					*/
					public Integer getShaishiTypes() {
						return shaishiTypes;
					}
					/**
					* 设置： 赛事类型
					*/
					public void setShaishiTypes(Integer shaishiTypes) {
						this.shaishiTypes = shaishiTypes;
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

					/**
					* 获取： 详情内容
					*/
					public String getShaishiContent() {
						return shaishiContent;
					}
					/**
					* 设置： 详情内容
					*/
					public void setShaishiContent(String shaishiContent) {
						this.shaishiContent = shaishiContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
