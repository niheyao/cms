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
@TableName ("cb_attribute" )
public class CbAttribute  implements Serializable {

	private static final long serialVersionUID =  4315274074474250047L;

	@TableField("id" )
	private Long id;

	/**
	 * 公司属性
	 */
	@TableField("descripts" )
	private String descripts;

}
