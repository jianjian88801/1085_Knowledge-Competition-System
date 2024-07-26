package com.entity.model;

import com.entity.ShaishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 赛事信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShaishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 详情内容
     */
    private String shaishiContent;


    /**
     * 发布日期
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
	 * 获取：赛事标题
	 */
    public String getShaishiName() {
        return shaishiName;
    }


    /**
	 * 设置：赛事标题
	 */
    public void setShaishiName(String shaishiName) {
        this.shaishiName = shaishiName;
    }
    /**
	 * 获取：赛事图片
	 */
    public String getShaishiPhoto() {
        return shaishiPhoto;
    }


    /**
	 * 设置：赛事图片
	 */
    public void setShaishiPhoto(String shaishiPhoto) {
        this.shaishiPhoto = shaishiPhoto;
    }
    /**
	 * 获取：赛事类型
	 */
    public Integer getShaishiTypes() {
        return shaishiTypes;
    }


    /**
	 * 设置：赛事类型
	 */
    public void setShaishiTypes(Integer shaishiTypes) {
        this.shaishiTypes = shaishiTypes;
    }
    /**
	 * 获取：详情内容
	 */
    public String getShaishiContent() {
        return shaishiContent;
    }


    /**
	 * 设置：详情内容
	 */
    public void setShaishiContent(String shaishiContent) {
        this.shaishiContent = shaishiContent;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
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
