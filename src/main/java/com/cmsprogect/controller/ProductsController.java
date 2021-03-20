package com.cmsprogect.controller;

import com.cmsprogect.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {

    @Autowired
    ProductsService productsService;
}
