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
 * 赛事信息
 *
 * @author 
 * @email
 */
@TableName("shaishi")
public class ShaishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShaishiEntity() {

	}

	public ShaishiEntity(T t) {
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
     * 赛事标题
     */
    @TableField(value = "shaishi_name")

    private String shaishiName;


    /**
     * 赛事图片
     */
    @TableField(value = "shaishi_photo")

    private String shaishiPhoto;


    /**
     * 赛事类型
     */
    @TableField(value = "shaishi_types")

    private Integer shaishiTypes;


    /**
     * 详情内容
     */
    @TableField(value = "shaishi_content")

    private String shaishiContent;


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
	 * 设置：赛事标题
	 */
    public String getShaishiName() {
        return shaishiName;
    }
    /**
	 * 获取：赛事标题
	 */

    public void setShaishiName(String shaishiName) {
        this.shaishiName = shaishiName;
    }
    /**
	 * 设置：赛事图片
	 */
    public String getShaishiPhoto() {
        return shaishiPhoto;
    }
    /**
	 * 获取：赛事图片
	 */

    public void setShaishiPhoto(String shaishiPhoto) {
        this.shaishiPhoto = shaishiPhoto;
    }
    /**
	 * 设置：赛事类型
	 */
    public Integer getShaishiTypes() {
        return shaishiTypes;
    }
    /**
	 * 获取：赛事类型
	 */

    public void setShaishiTypes(Integer shaishiTypes) {
        this.shaishiTypes = shaishiTypes;
    }
    /**
	 * 设置：详情内容
	 */
    public String getShaishiContent() {
        return shaishiContent;
    }
    /**
	 * 获取：详情内容
	 */

    public void setShaishiContent(String shaishiContent) {
        this.shaishiContent = shaishiContent;
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
        return "Shaishi{" +
            "id=" + id +
            ", shaishiName=" + shaishiName +
            ", shaishiPhoto=" + shaishiPhoto +
            ", shaishiTypes=" + shaishiTypes +
            ", shaishiContent=" + shaishiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
