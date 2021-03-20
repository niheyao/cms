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
@TableName ("cb_artsource" )
public class CbArtsource  implements Serializable {

	private static final long serialVersionUID =  4396942536464333275L;

	@TableField("id" )
	private Long id;

	/**
	 * 文章来源
	 */
	@TableField("descripts" )
	private String descripts;

}
