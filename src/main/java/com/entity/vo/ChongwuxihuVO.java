package com.entity.vo;

import com.entity.ChongwuxihuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 在线学习
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwuxihu")
public class ChongwuxihuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
