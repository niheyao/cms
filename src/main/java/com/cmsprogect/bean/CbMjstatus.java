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
@TableName ("cb_mjstatus" )
public class CbMjstatus  implements Serializable {

	private static final long serialVersionUID =  6038213003628186054L;

	@TableField("id" )
	private Long id;

	/**
	 * 募集状态
	 */
	@TableField("descripts" )
	private String descripts;

}
