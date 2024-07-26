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
 * 赛事报名信息
 *
 * @author 
 * @email
 */
@TableName("shaishibaoming")
public class ShaishibaomingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShaishibaomingEntity() {

	}

	public ShaishibaomingEntity(T t) {
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
     * 赛事
     */
    @TableField(value = "shaishi_id")

    private Integer shaishiId;


    /**
     * 赛事
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名审核
     */
    @TableField(value = "shaishibaoming_yesno_types")

    private Integer shaishibaomingYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "shaishibaoming_yesno_text")

    private String shaishibaomingYesnoText;


    /**
     * 报名日期
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
	 * 设置：赛事
	 */
    public Integer getShaishiId() {
        return shaishiId;
    }
    /**
	 * 获取：赛事
	 */

    public void setShaishiId(Integer shaishiId) {
        this.shaishiId = shaishiId;
    }
    /**
	 * 设置：赛事
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：赛事
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名审核
	 */
    public Integer getShaishibaomingYesnoTypes() {
        return shaishibaomingYesnoTypes;
    }
    /**
	 * 获取：报名审核
	 */

    public void setShaishibaomingYesnoTypes(Integer shaishibaomingYesnoTypes) {
        this.shaishibaomingYesnoTypes = shaishibaomingYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getShaishibaomingYesnoText() {
        return shaishibaomingYesnoText;
    }
    /**
	 * 获取：审核结果
	 */

    public void setShaishibaomingYesnoText(String shaishibaomingYesnoText) {
        this.shaishibaomingYesnoText = shaishibaomingYesnoText;
    }
    /**
	 * 设置：报名日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：报名日期
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
        return "Shaishibaoming{" +
            "id=" + id +
            ", shaishiId=" + shaishiId +
            ", yonghuId=" + yonghuId +
            ", shaishibaomingYesnoTypes=" + shaishibaomingYesnoTypes +
            ", shaishibaomingYesnoText=" + shaishibaomingYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
