package com.cmsprogect.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmsprogect.bean.CbUser;
import org.apache.ibatis.annotations.Mapper;

/*
* BaseMapper 基础的增删改查 crud
* */
@Mapper
public interface UserMapper extends BaseMapper<CbUser> {


}
