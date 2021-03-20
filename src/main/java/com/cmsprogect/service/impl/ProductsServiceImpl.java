package com.cmsprogect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cmsprogect.bean.BsProduct;
import com.cmsprogect.mapper.ProductsMapper;
import com.cmsprogect.service.ProductsService;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, BsProduct> implements ProductsService {
}
