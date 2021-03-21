package com.cmsprogect.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cmsprogect.bean.BsNews;
import com.cmsprogect.bean.JsonObj;
import com.cmsprogect.mapper.NewsMapper;
import com.cmsprogect.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "新闻资讯模块")
public class NewsController {

    @Autowired
    NewsService newsService;
    @Autowired
    NewsMapper newsMapper;

    @PostMapping("/newsList")
    @ApiOperation(value = "新闻资讯列表", notes = "")
    @ApiImplicitParam(name = "newsTypeId", value = "资讯类型id", required = true, dataType = "String")
    public JsonObj getNewsList(@RequestParam Map<String, String> map){
        JsonObj result= new JsonObj();
        String newsTypeId = map.get("newsTypeId");                     ///公司名称
        int page = Integer.parseInt(map.get("page")==null?"1":map.get("page").toString());                     ///页码
        int size = Integer.parseInt(map.get("size")==null?"10":map.get("size").toString());                     ///每页行数
        QueryWrapper qw = new QueryWrapper();
        if (!"".equals(newsTypeId)){
            qw.like("newsTypeId",newsTypeId);
        }
        qw.orderByDesc("createDateTime");
        Page<BsNews> mapPage = new Page<>(page , size, false);
        result.setRow(newsMapper.getNewsList(mapPage , qw));
        return result;
    }
}
