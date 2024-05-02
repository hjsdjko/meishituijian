package com.entity.view;

import com.entity.MeishiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 美食订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("meishi_order")
public class MeishiOrderView extends MeishiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 meishi
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
				* 口味的值
				*/
				private String kouweiValue;
			/**
			* 店址
			*/
			private Integer dianzhiTypes;
				/**
				* 店址的值
				*/
				private String dianzhiValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;

	public MeishiOrderView() {

	}

	public MeishiOrderView(MeishiOrderEntity meishiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, meishiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set meishi
					/**
					* 获取： 美食名称
					*/
					public String getMeishiName() {
						return meishiName;
					}
					/**
					* 设置： 美食名称
					*/
					public void setMeishiName(String meishiName) {
						this.meishiName = meishiName;
					}
					/**
					* 获取： 美食价格
					*/
					public Double getMeishiMoney() {
						return meishiMoney;
					}
					/**
					* 设置： 美食价格
					*/
					public void setMeishiMoney(Double meishiMoney) {
						this.meishiMoney = meishiMoney;
					}
					/**
					* 获取： 图片
					*/
					public String getMeishiPhoto() {
						return meishiPhoto;
					}
					/**
					* 设置： 图片
					*/
					public void setMeishiPhoto(String meishiPhoto) {
						this.meishiPhoto = meishiPhoto;
					}
					/**
					* 获取： 点击率
					*/
					public Integer getMeishiJieyue() {
						return meishiJieyue;
					}
					/**
					* 设置： 点击率
					*/
					public void setMeishiJieyue(Integer meishiJieyue) {
						this.meishiJieyue = meishiJieyue;
					}
					/**
					* 获取： 详情信息
					*/
					public String getMeishiContent() {
						return meishiContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setMeishiContent(String meishiContent) {
						this.meishiContent = meishiContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 口味
					*/
					public Integer getKouweiTypes() {
						return kouweiTypes;
					}
					/**
					* 设置： 口味
					*/
					public void setKouweiTypes(Integer kouweiTypes) {
						this.kouweiTypes = kouweiTypes;
					}


						/**
						* 获取： 口味的值
						*/
						public String getKouweiValue() {
							return kouweiValue;
						}
						/**
						* 设置： 口味的值
						*/
						public void setKouweiValue(String kouweiValue) {
							this.kouweiValue = kouweiValue;
						}
					/**
					* 获取： 住址
					*/
					public Integer getDianzhiTypes() {
						return dianzhiTypes;
					}
					/**
					* 设置： 住址
					*/
					public void setDianzhiTypes(Integer dianzhiTypes) {
						this.dianzhiTypes = dianzhiTypes;
					}


						/**
						* 获取： 住址的值
						*/
						public String getDianzhiValue() {
							return dianzhiValue;
						}
						/**
						* 设置： 住址的值
						*/
						public void setDianzhiValue(String dianzhiValue) {
							this.dianzhiValue = dianzhiValue;
						}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
