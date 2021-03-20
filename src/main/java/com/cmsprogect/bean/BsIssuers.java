package com.cmsprogect.bean;


import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @Description  
 * @Author  HelloWorld
 * @Date 2021-03-20 
 */

@Data
@TableName ("bs_issuers" )
public class BsIssuers  implements Serializable {

	private static final long serialVersionUID =  3618944483994454768L;

	@TableField("id" )
	private Long id;

	/**
	 * 公司名称
	 */
	@TableField("descripts" )
	private String descripts;

	/**
	 * 公司全称
	 */
	@TableField("longDesc" )
	private String longDesc;

	/**
	 * 公司简称
	 */
	@TableField("shortDesc" )
	private String shortDesc;

	/**
	 * 英文名称
	 */
	@TableField("engDesc" )
	private String engDesc;

	/**
	 * 公司属性
	 */
	@TableField("attributeId" )
	private Long attributeId;

	/**
	 * 所在城市
	 */
	@TableField("address" )
	private String address;

	/**
	 * 注册资本
	 */
	@TableField("registCapital" )
	private String registCapital;

	/**
	 * 资产管理规模
	 */
	@TableField("aum" )
	private String aum;

	/**
	 * 成立日期
	 */
	@TableField("startDate" )
	private Date startDate;

	/**
	 * 董事长
	 */
	@TableField("chairman" )
	private String chairman;

	/**
	 * 总经理
	 */
	@TableField("generalManager" )
	private String generalManager;

	/**
	 * 法人代理
	 */
	@TableField("corporateAgency" )
	private String corporateAgency;

	/**
	 * 大股东
	 */
	@TableField("shareholder" )
	private String shareholder;

	/**
	 * 上市标志
	 */
	@TableField("listedFlag" )
	private String listedFlag;

	/**
	 * 公司介绍
	 */
	@TableField("introduction" )
	private String introduction;

}
