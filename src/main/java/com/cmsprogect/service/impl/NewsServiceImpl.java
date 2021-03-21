package com.cmsprogect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cmsprogect.bean.BsNews;
import com.cmsprogect.mapper.NewsMapper;
import com.cmsprogect.service.NewsService;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, BsNews>  implements NewsService {
}
