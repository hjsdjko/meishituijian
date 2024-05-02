package com.entity.vo;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("meishi")
public class MeishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 美食名称
     */

    @TableField(value = "meishi_name")
    private String meishiName;


    /**
     * 美食价格
     */

    @TableField(value = "meishi_money")
    private Double meishiMoney;


    /**
     * 口味
     */

    @TableField(value = "kouwei_types")
    private Integer kouweiTypes;


    /**
     * 店址
     */

    @TableField(value = "dianzhi_types")
    private Integer dianzhiTypes;


    /**
     * 图片
     */

    @TableField(value = "meishi_photo")
    private String meishiPhoto;


    /**
     * 点击率
     */

    @TableField(value = "meishi_jieyue")
    private Integer meishiJieyue;


    /**
     * 详情信息
     */

    @TableField(value = "meishi_content")
    private String meishiContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 获取：美食名称
	 */

    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 设置：美食价格
	 */
    public Double getMeishiMoney() {
        return meishiMoney;
    }


    /**
	 * 获取：美食价格
	 */

    public void setMeishiMoney(Double meishiMoney) {
        this.meishiMoney = meishiMoney;
    }
    /**
	 * 设置：口味
	 */
    public Integer getKouweiTypes() {
        return kouweiTypes;
    }


    /**
	 * 获取：口味
	 */

    public void setKouweiTypes(Integer kouweiTypes) {
        this.kouweiTypes = kouweiTypes;
    }
    /**
	 * 设置：店址
	 */
    public Integer getDianzhiTypes() {
        return dianzhiTypes;
    }


    /**
	 * 获取：店址
	 */

    public void setDianzhiTypes(Integer dianzhiTypes) {
        this.dianzhiTypes = dianzhiTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 设置：点击率
	 */
    public Integer getMeishiJieyue() {
        return meishiJieyue;
    }


    /**
	 * 获取：点击率
	 */

    public void setMeishiJieyue(Integer meishiJieyue) {
        this.meishiJieyue = meishiJieyue;
    }
    /**
	 * 设置：详情信息
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
