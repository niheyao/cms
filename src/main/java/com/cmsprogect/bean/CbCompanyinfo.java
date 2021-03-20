package com.cmsprogect.bean;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description  
 * @Author  HelloWorld
 * @Date 2021-03-20 
 */

@Data
@TableName ("cb_companyinfo" )
public class CbCompanyinfo  implements Serializable {

	private static final long serialVersionUID =  6029846567250445685L;

	@TableField("id" )
	private Long id;

	/**
	 * 公司简介
	 */
	@TableField("introduce" )
	private String introduce;

	/**
	 * 企业文化
	 */
	@TableField("culture" )
	private String culture;

	/**
	 * 发展历程
	 */
	@TableField("developmetHistory" )
	private String developmetHistory;

	/**
	 * 产品与服务
	 */
	@TableField("proAndService" )
	private String proAndService;

	/**
	 * 服务网点
	 */
	@TableField("serviceNetwork" )
	private String serviceNetwork;

	/**
	 * 联系方式
	 */
	@TableField("contact" )
	private String contact;

}
