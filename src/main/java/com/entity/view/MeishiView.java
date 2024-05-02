package com.entity.view;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 美食信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("meishi")
public class MeishiView extends MeishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 口味的值
		*/
		private String kouweiValue;
		/**
		* 店址的值
		*/
		private String dianzhiValue;



	public MeishiView() {

	}

	public MeishiView(MeishiEntity meishiEntity) {
		try {
			BeanUtils.copyProperties(this, meishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			* 获取： 店址的值
			*/
			public String getDianzhiValue() {
				return dianzhiValue;
			}
			/**
			* 设置： 店址的值
			*/
			public void setDianzhiValue(String dianzhiValue) {
				this.dianzhiValue = dianzhiValue;
			}










}
