package com.cmsprogect.cms;

import com.cmsprogect.bean.CbUser;
import com.cmsprogect.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
@RestController
class CmsApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() throws SQLException {
        CbUser user = userMapper.selectById(1);
        System.out.println(user);

    }
}
