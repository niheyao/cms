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
@TableName ("bs_news" )
public class BsNews  implements Serializable {

	private static final long serialVersionUID =  9083017959565014840L;

	@TableField("id" )
	private Long id;

	/**
	 * 标题
	 */
	@TableField("title" )
	private String title;

	/**
	 * 引言
	 */
	@TableField("foreword" )
	private String foreword;

	/**
	 * 图片地址
	 */
	@TableField("imgPath" )
	private String imgPath;

	/**
	 * 文章来源
	 */
	@TableField("artSourceId" )
	private Long artSourceId;

	/**
	 * 发布时间
	 */
	@TableField("createDateTime" )
	private Date createDateTime;

	/**
	 * 内容
	 */
	@TableField("content" )
	private String content;

	/**
	 * 资讯类型
	 */
	@TableField("newsTypeId" )
	private Long newsTypeId;

}
