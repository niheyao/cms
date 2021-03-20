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
@TableName ("cb_user" )
public class CbUser  implements Serializable {

	private static final long serialVersionUID =  7816478342405803160L;

	@TableField("id" )
	private Long id;

	/**
	 * 工号
	 */
	@TableField("username" )
	private String username;

	/**
	 * 密码
	 */
	@TableField("password" )
	private String password;

	/**
	 * 生效时间
	 */
	@TableField("startDate" )
	private Date startDate;

	/**
	 * 失效日期
	 */
	@TableField("stopDate" )
	private Date stopDate;

}
