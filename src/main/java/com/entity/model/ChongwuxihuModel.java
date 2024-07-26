package com.entity.model;

import com.entity.ChongwuxihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 在线学习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuxihuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String chongwuxihuName;


    /**
     * 封面
     */
    private String chongwuxihuPhoto;


    /**
     * 学习视频
     */
    private String chongwuxihuVideo;


    /**
     * 视频类型
     */
    private Integer chongwuxihuTypes;


    /**
     * 详情内容
     */
    private String chongwuxihuContent;


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
	 * 获取：标题
	 */
    public String getChongwuxihuName() {
        return chongwuxihuName;
    }


    /**
	 * 设置：标题
	 */
    public void setChongwuxihuName(String chongwuxihuName) {
        this.chongwuxihuName = chongwuxihuName;
    }
    /**
	 * 获取：封面
	 */
    public String getChongwuxihuPhoto() {
        return chongwuxihuPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setChongwuxihuPhoto(String chongwuxihuPhoto) {
        this.chongwuxihuPhoto = chongwuxihuPhoto;
    }
    /**
	 * 获取：学习视频
	 */
    public String getChongwuxihuVideo() {
        return chongwuxihuVideo;
    }


    /**
	 * 设置：学习视频
	 */
    public void setChongwuxihuVideo(String chongwuxihuVideo) {
        this.chongwuxihuVideo = chongwuxihuVideo;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getChongwuxihuTypes() {
        return chongwuxihuTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setChongwuxihuTypes(Integer chongwuxihuTypes) {
        this.chongwuxihuTypes = chongwuxihuTypes;
    }
    /**
	 * 获取：详情内容
	 */
    public String getChongwuxihuContent() {
        return chongwuxihuContent;
    }


    /**
	 * 设置：详情内容
	 */
    public void setChongwuxihuContent(String chongwuxihuContent) {
        this.chongwuxihuContent = chongwuxihuContent;
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
