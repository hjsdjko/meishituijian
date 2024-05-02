package com.entity.model;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class MeishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 美食名称
     */
    private String meishiName;


    /**
     * 美食价格
     */
    private Double meishiMoney;


    /**
     * 口味
     */
    private Integer kouweiTypes;


    /**
     * 店址
     */
    private Integer dianzhiTypes;


    /**
     * 图片
     */
    private String meishiPhoto;


    /**
     * 点击率
     */
    private Integer meishiJieyue;


    /**
     * 详情信息
     */
    private String meishiContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 设置：美食名称
	 */
    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 获取：美食价格
	 */
    public Double getMeishiMoney() {
        return meishiMoney;
    }


    /**
	 * 设置：美食价格
	 */
    public void setMeishiMoney(Double meishiMoney) {
        this.meishiMoney = meishiMoney;
    }
    /**
	 * 获取：口味
	 */
    public Integer getKouweiTypes() {
        return kouweiTypes;
    }


    /**
	 * 设置：口味
	 */
    public void setKouweiTypes(Integer kouweiTypes) {
        this.kouweiTypes = kouweiTypes;
    }
    /**
	 * 获取：店址
	 */
    public Integer getDianzhiTypes() {
        return dianzhiTypes;
    }


    /**
	 * 设置：店址
	 */
    public void setDianzhiTypes(Integer dianzhiTypes) {
        this.dianzhiTypes = dianzhiTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 获取：点击率
	 */
    public Integer getMeishiJieyue() {
        return meishiJieyue;
    }


    /**
	 * 设置：点击率
	 */
    public void setMeishiJieyue(Integer meishiJieyue) {
        this.meishiJieyue = meishiJieyue;
    }
    /**
	 * 获取：详情信息
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
