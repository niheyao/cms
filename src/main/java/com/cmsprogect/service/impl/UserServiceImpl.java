package com.cmsprogect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cmsprogect.bean.CbUser;
import com.cmsprogect.mapper.UserMapper;
import com.cmsprogect.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, CbUser> implements UserService {
}
