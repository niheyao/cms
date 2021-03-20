package com.cmsprogect.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmsprogect.bean.BsProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductsMapper extends BaseMapper<BsProduct> {
}
