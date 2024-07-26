package com.entity.vo;

import com.entity.ShaishibaomingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 赛事报名信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shaishibaoming")
public class ShaishibaomingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
