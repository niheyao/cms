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
@TableName ("bs_log" )
public class BsLog  implements Serializable {

	private static final long serialVersionUID =  448989684389768843L;

	@TableField("id" )
	private Long id;

	/**
	 * 成功或者失败
	 */
	@TableField("type" )
	private String type;

	/**
	 * 日志内容
	 */
	@TableField("content" )
	private String content;

	/**
	 * 生成时间
	 */
	@TableField("createDate" )
	private Date createDate;

}
