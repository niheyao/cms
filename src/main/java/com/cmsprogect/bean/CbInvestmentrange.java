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
@TableName ("cb_investmentrange" )
public class CbInvestmentrange  implements Serializable {

	private static final long serialVersionUID =  5389763669776312393L;

	@TableField("id" )
	private Long id;

	/**
	 * 投资方向
	 */
	@TableField("descripts" )
	private String descripts;

}
