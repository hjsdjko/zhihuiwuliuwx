package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.SijiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 司机
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("siji")
public class SijiView extends SijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 司机类型的值
	*/
	@ColumnInfo(comment="司机类型的字典表值",type="varchar(200)")
	private String sijiValue;




	public SijiView() {

	}

	public SijiView(SijiEntity sijiEntity) {
		try {
			BeanUtils.copyProperties(this, sijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 司机类型的值
	*/
	public String getSijiValue() {
		return sijiValue;
	}
	/**
	* 设置： 司机类型的值
	*/
	public void setSijiValue(String sijiValue) {
		this.sijiValue = sijiValue;
	}




	@Override
	public String toString() {
		return "SijiView{" +
			", sijiValue=" + sijiValue +
			"} " + super.toString();
	}
}
