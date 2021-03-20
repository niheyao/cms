package com.cmsprogect.controller;

import com.cmsprogect.service.IssuersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssuersController {
    @Autowired
    IssuersService issuersService;
}
