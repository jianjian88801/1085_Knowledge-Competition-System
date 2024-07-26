package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 在线学习
 *
 * @author 
 * @email
 */
@TableName("chongwuxihu")
public class ChongwuxihuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuxihuEntity() {

	}

	public ChongwuxihuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "chongwuxihu_name")

    private String chongwuxihuName;


    /**
     * 封面
     */
    @TableField(value = "chongwuxihu_photo")

    private String chongwuxihuPhoto;


    /**
     * 学习视频
     */
    @TableField(value = "chongwuxihu_video")

    private String chongwuxihuVideo;


    /**
     * 视频类型
     */
    @TableField(value = "chongwuxihu_types")

    private Integer chongwuxihuTypes;


    /**
     * 详情内容
     */
    @TableField(value = "chongwuxihu_content")

    private String chongwuxihuContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getChongwuxihuName() {
        return chongwuxihuName;
    }
    /**
	 * 获取：标题
	 */

    public void setChongwuxihuName(String chongwuxihuName) {
        this.chongwuxihuName = chongwuxihuName;
    }
    /**
	 * 设置：封面
	 */
    public String getChongwuxihuPhoto() {
        return chongwuxihuPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setChongwuxihuPhoto(String chongwuxihuPhoto) {
        this.chongwuxihuPhoto = chongwuxihuPhoto;
    }
    /**
	 * 设置：学习视频
	 */
    public String getChongwuxihuVideo() {
        return chongwuxihuVideo;
    }
    /**
	 * 获取：学习视频
	 */

    public void setChongwuxihuVideo(String chongwuxihuVideo) {
        this.chongwuxihuVideo = chongwuxihuVideo;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getChongwuxihuTypes() {
        return chongwuxihuTypes;
    }
    /**
	 * 获取：视频类型
	 */

    public void setChongwuxihuTypes(Integer chongwuxihuTypes) {
        this.chongwuxihuTypes = chongwuxihuTypes;
    }
    /**
	 * 设置：详情内容
	 */
    public String getChongwuxihuContent() {
        return chongwuxihuContent;
    }
    /**
	 * 获取：详情内容
	 */

    public void setChongwuxihuContent(String chongwuxihuContent) {
        this.chongwuxihuContent = chongwuxihuContent;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwuxihu{" +
            "id=" + id +
            ", chongwuxihuName=" + chongwuxihuName +
            ", chongwuxihuPhoto=" + chongwuxihuPhoto +
            ", chongwuxihuVideo=" + chongwuxihuVideo +
            ", chongwuxihuTypes=" + chongwuxihuTypes +
            ", chongwuxihuContent=" + chongwuxihuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
