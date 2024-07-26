package com.entity.model;

import com.entity.ShaishibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 赛事报名信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShaishibaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 赛事
     */
    private Integer shaishiId;


    /**
     * 赛事
     */
    private Integer yonghuId;


    /**
     * 报名审核
     */
    private Integer shaishibaomingYesnoTypes;


    /**
     * 审核结果
     */
    private String shaishibaomingYesnoText;


    /**
     * 报名日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：赛事
	 */
    public Integer getShaishiId() {
        return shaishiId;
    }


    /**
	 * 设置：赛事
	 */
    public void setShaishiId(Integer shaishiId) {
        this.shaishiId = shaishiId;
    }
    /**
	 * 获取：赛事
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：赛事
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名审核
	 */
    public Integer getShaishibaomingYesnoTypes() {
        return shaishibaomingYesnoTypes;
    }


    /**
	 * 设置：报名审核
	 */
    public void setShaishibaomingYesnoTypes(Integer shaishibaomingYesnoTypes) {
        this.shaishibaomingYesnoTypes = shaishibaomingYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getShaishibaomingYesnoText() {
        return shaishibaomingYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setShaishibaomingYesnoText(String shaishibaomingYesnoText) {
        this.shaishibaomingYesnoText = shaishibaomingYesnoText;
    }
    /**
	 * 获取：报名日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报名日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
