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
 * 美食信息
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("meishi")
public class MeishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeishiEntity() {

	}

	public MeishiEntity(T t) {
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
        return "Meishi{" +
            "id=" + id +
            ", meishiName=" + meishiName +
            ", meishiMoney=" + meishiMoney +
            ", kouweiTypes=" + kouweiTypes +
            ", dianzhiTypes=" + dianzhiTypes +
            ", meishiPhoto=" + meishiPhoto +
            ", meishiJieyue=" + meishiJieyue +
            ", meishiContent=" + meishiContent +
            ", createTime=" + createTime +
        "}";
    }
}
