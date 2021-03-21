package com.cmsprogect.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cmsprogect.bean.BsNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper extends BaseMapper<BsNews> {
    @Select("SELECT title,foreword,imgPath FROM BS_News")
     List<BsNews> getNewsList (Page<BsNews> page, QueryWrapper qw);
}
