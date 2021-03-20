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
@TableName ("cb_revenuerange" )
public class CbRevenuerange  implements Serializable {

	private static final long serialVersionUID =  2294309018721204792L;

	@TableField("id" )
	private Long id;

	/**
	 * 收益范围
	 */
	@TableField("descripts" )
	private String descripts;

}
