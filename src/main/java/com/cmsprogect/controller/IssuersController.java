package com.cmsprogect.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmsprogect.bean.BsIssuers;
import com.cmsprogect.bean.JsonObj;
import com.cmsprogect.service.IssuersService;
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
@Api(tags = "信托公司")
public class IssuersController {
    @Autowired
    IssuersService issuersService;

    @PostMapping("/issuersList")
    @ApiOperation(value = "公司列表", notes = "")
    @ApiImplicitParam(name = "descripts", value = "公司名称", required = true, dataType = "String")
    public JsonObj getIssuersList(@RequestParam Map<String, Object> map)  {
        JsonObj result= new JsonObj();
        String descripts = map.get("descripts").toString();                     ///公司名称
        QueryWrapper qw = new QueryWrapper();
        if (!"".equals(descripts)){
            qw.like("descripts",descripts);
        }
        qw.orderByDesc("listedFlag");

        List<BsIssuers> issuers = issuersService.list(qw);
        result.setRow(issuers);
        return result;
    }
    @PostMapping("/addOrUpdateIssuers")
    @ApiOperation(value = "新增或修改信托公司", notes = "")
    @ApiImplicitParam(name = "descripts", value = "", required = true, dataType = "String")
    public JsonObj addOrUpdateProduct(BsIssuers issuers){
        JsonObj result = new JsonObj();
        boolean rtn = true;
        if (issuers.getId()!=null){
            rtn = issuersService.updateById(issuers);
        }else{
            rtn = issuersService.save(issuers);
        }
        if (rtn){
            result.resultWithoutRow("0","保存成功");
        }else{
            result.resultWithoutRow("-1","保存失败");
        }
        return result;
    }
    @PostMapping("/delIssuers")
    @ApiOperation(value = "删除信托公司", notes = "")
    @ApiImplicitParam(name = "id", value = "公司id", required = true, dataType = "String")
    public JsonObj delProduct(Integer id){
        JsonObj result = new JsonObj();
        boolean rtn = issuersService.removeById(id);
        if (rtn){
            result.resultWithoutRow("0","删除成功");
        }else{
            result.resultWithoutRow("-1","删除失败");
        }
        return result;
    }
}
