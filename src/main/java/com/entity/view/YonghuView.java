package com.entity.view;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 口味的值
		*/
		private String kouweiValue;
		/**
		* 住址的值
		*/
		private String dianzhiValue;



	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
