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
@TableName ("bs_consultation" )
public class BsConsultation  implements Serializable {

	private static final long serialVersionUID =  1295908446650854468L;

	@TableField("id" )
	private Long id;

	/**
	 * 客户姓名
	 */
	@TableField("name" )
	private String name;

	/**
	 * 手机号
	 */
	@TableField("mobile" )
	private String mobile;

	/**
	 * 咨询内容
	 */
	@TableField("content" )
	private String content;

	/**
	 * 跟进状态
	 */
	@TableField("status" )
	private Long status;

	/**
	 * 跟进人
	 */
	@TableField("servicePerson" )
	private String servicePerson;

	/**
	 * 跟进说明
	 */
	@TableField("serviceIntro" )
	private String serviceIntro;

	/**
	 * 留言时间
	 */
	@TableField("createDate" )
	private Date createDate;

}
