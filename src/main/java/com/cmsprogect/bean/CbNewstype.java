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
@TableName ("cb_newstype" )
public class CbNewstype  implements Serializable {

	private static final long serialVersionUID =  2036036475437179240L;

	@TableField("id" )
	private Long id;

	/**
	 * 新闻资讯类型
	 */
	@TableField("descripts" )
	private String descripts;

}
