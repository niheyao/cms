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
@TableName ("cb_servicestatus" )
public class CbServicestatus  implements Serializable {

	private static final long serialVersionUID =  8916583138149225296L;

	@TableField("id" )
	private Long id;

	/**
	 * 跟进情况
	 */
	@TableField("descripts" )
	private String descripts;

}
