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
@TableName ("bs_product" )
public class BsProduct  implements Serializable {

	private static final long serialVersionUID =  7304132525016569222L;

	@TableField("id" )
	private Long id;

	/**
	 * 产品名称
	 */
	@TableField("descripts" )
	private String descripts;

	/**
	 * 发行机构
	 */
	@TableField("issuersId" )
	private Long issuersId;

	/**
	 * 付息方式
	 */
	@TableField("paytypeId" )
	private Long paytypeId;

	/**
	 * 募集状态
	 */
	@TableField("mjStatusId" )
	private Long mjStatusId;

	/**
	 * 产品收益
	 */
	@TableField("revenueRangeId" )
	private Long revenueRangeId;

	/**
	 * 产品期限
	 */
	@TableField("periodsId" )
	private Long periodsId;

	/**
	 * 募集规模
	 */
	@TableField("mjAmt" )
	private String mjAmt;

	/**
	 * 认购起点
	 */
	@TableField("subStart" )
	private String subStart;

	/**
	 * 投资方向
	 */
	@TableField("investmentRangeId" )
	private Long investmentRangeId;

	/**
	 * 收益说明
	 */
	@TableField("profitDesc" )
	private String profitDesc;

	/**
	 * 产品介绍
	 */
	@TableField("introduction" )
	private String introduction;

	/**
	 * 推荐标志
	 */
	@TableField("recommendFlag" )
	private String recommendFlag;

	/**
	 * 推荐描述
	 */
	@TableField("recommendIntro" )
	private String recommendIntro;

}
