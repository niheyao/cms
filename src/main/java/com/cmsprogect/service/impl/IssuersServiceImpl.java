package com.cmsprogect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cmsprogect.bean.BsIssuers;
import com.cmsprogect.mapper.IssuersMapper;
import com.cmsprogect.service.IssuersService;
import org.springframework.stereotype.Service;

@Service
public class IssuersServiceImpl extends ServiceImpl<IssuersMapper, BsIssuers> implements IssuersService {
}
