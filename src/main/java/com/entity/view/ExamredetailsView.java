package com.entity.view;

import com.entity.ExamredetailsEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 答题详情表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("examredetails")
public class ExamredetailsView extends ExamredetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 examquestion
			/**
			* 试题名称
			*/
			private String examquestionName;
			/**
			* 选项，json字符串
			*/
			private String examquestionOptions;
			/**
			* 分值
			*/
			private Integer examquestionScore;
			/**
			* 正确答案
			*/
			private String examquestionAnswer;
			/**
			* 答案解析
			*/
			private String examquestionAnalysis;
			/**
			* 试题类型
			*/
			private Integer examquestionTypes;
				/**
				* 试题类型的值
				*/
				private String examquestionValue;
			/**
			* 试题排序，值越大排越前面
			*/
			private Integer examquestionSequence;

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

	public ExamredetailsView() {

	}

	public ExamredetailsView(ExamredetailsEntity examredetailsEntity) {
		try {
			BeanUtils.copyProperties(this, examredetailsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set examquestion


					/**
					* 获取： 试题名称
					*/
					public String getExamquestionName() {
						return examquestionName;
					}
					/**
					* 设置： 试题名称
					*/
					public void setExamquestionName(String examquestionName) {
						this.examquestionName = examquestionName;
					}

					/**
					* 获取： 选项，json字符串
					*/
					public String getExamquestionOptions() {
						return examquestionOptions;
					}
					/**
					* 设置： 选项，json字符串
					*/
					public void setExamquestionOptions(String examquestionOptions) {
						this.examquestionOptions = examquestionOptions;
					}

					/**
					* 获取： 分值
					*/
					public Integer getExamquestionScore() {
						return examquestionScore;
					}
					/**
					* 设置： 分值
					*/
					public void setExamquestionScore(Integer examquestionScore) {
						this.examquestionScore = examquestionScore;
					}

					/**
					* 获取： 正确答案
					*/
					public String getExamquestionAnswer() {
						return examquestionAnswer;
					}
					/**
					* 设置： 正确答案
					*/
					public void setExamquestionAnswer(String examquestionAnswer) {
						this.examquestionAnswer = examquestionAnswer;
					}

					/**
					* 获取： 答案解析
					*/
					public String getExamquestionAnalysis() {
						return examquestionAnalysis;
					}
					/**
					* 设置： 答案解析
					*/
					public void setExamquestionAnalysis(String examquestionAnalysis) {
						this.examquestionAnalysis = examquestionAnalysis;
					}

					/**
					* 获取： 试题类型
					*/
					public Integer getExamquestionTypes() {
						return examquestionTypes;
					}
					/**
					* 设置： 试题类型
					*/
					public void setExamquestionTypes(Integer examquestionTypes) {
						this.examquestionTypes = examquestionTypes;
					}


						/**
						* 获取： 试题类型的值
						*/
						public String getExamquestionValue() {
							return examquestionValue;
						}
						/**
						* 设置： 试题类型的值
						*/
						public void setExamquestionValue(String examquestionValue) {
							this.examquestionValue = examquestionValue;
						}

					/**
					* 获取： 试题排序，值越大排越前面
					*/
					public Integer getExamquestionSequence() {
						return examquestionSequence;
					}
					/**
					* 设置： 试题排序，值越大排越前面
					*/
					public void setExamquestionSequence(Integer examquestionSequence) {
						this.examquestionSequence = examquestionSequence;
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
