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
@TableName ("cb_periods" )
public class CbPeriods  implements Serializable {

	private static final long serialVersionUID =  4916903171646388677L;

	@TableField("id" )
	private Long id;

	/**
	 * 期限范围
	 */
	@TableField("descripts" )
	private String descripts;

}
