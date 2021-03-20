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
@TableName ("cb_paytype" )
public class CbPaytype  implements Serializable {

	private static final long serialVersionUID =  8716996639100004282L;

	@TableField("id" )
	private Long id;

	/**
	 * 付息方式
	 */
	@TableField("descripts" )
	private String descripts;

}
