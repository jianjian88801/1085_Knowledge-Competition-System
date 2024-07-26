package com.entity.vo;

import com.entity.ShaishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 赛事信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shaishi")
public class ShaishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
