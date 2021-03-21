package com.cmsprogect.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmsprogect.bean.BsProduct;
import com.cmsprogect.bean.JsonObj;
import com.cmsprogect.service.ProductsService;
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
@Api(tags = "产品模块")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @PostMapping("/productList")
    @ApiOperation(value = "产品列表", notes = "")
    @ApiImplicitParam(name = "recommendFlag", value = "推荐标志", required = true, dataType = "String")
    public JsonObj getProductList(@RequestParam Map<String, Object> map)  {
        JsonObj result= new JsonObj();
        String recommendFlag = map.get("recommendFlag").toString();             ///推荐标志
        String descripts = map.get("descripts").toString();                     ///首页banner搜索

        String issuersId = map.get("issuersId").toString();                     ///信托公司
        String paytypeId = map.get("paytypeId").toString();                     ///付息方式
        String mjStatusId = map.get("mjStatusId").toString();                   ///募集状态
        String revenueRangeId = map.get("revenueRangeId").toString();           ///产品收益
        String periodsId = map.get("periodsId").toString();                     ///产品期限
        String investmentRangeId = map.get("investmentRangeId").toString();     ///投资方向
        QueryWrapper qw = new QueryWrapper();
        if (!"".equals(descripts)){
            qw.like("descripts",descripts);
        }
        if (!"".equals(issuersId)){
            qw.eq("issuersId",issuersId);
        }
        if (!"".equals(paytypeId)){
            qw.eq("paytypeId",paytypeId);
        }
        if (!"".equals(mjStatusId)){
            qw.eq("mjStatusId",mjStatusId);
        }
        if (!"".equals(revenueRangeId)){
            qw.eq("revenueRangeId",revenueRangeId);
        }
        if (!"".equals(periodsId)){
            qw.eq("periodsId",periodsId);
        }
        if (!"".equals(investmentRangeId)){
            qw.eq("investmentRangeId",investmentRangeId);
        }
        if (!"".equals(recommendFlag)){
            qw.eq("recommendFlag",recommendFlag);
        }else{
            qw.orderByDesc("recommendFlag");
        }
        List<BsProduct> products = productsService.list(qw);
        result.setRow(products);
        return result;
    }
    @PostMapping("/addOrUpdateProduct")
    @ApiOperation(value = "新增或修改产品", notes = "")
    @ApiImplicitParam(name = "descripts", value = "", required = true, dataType = "String")
    public JsonObj addOrUpdateProduct(BsProduct product){
        JsonObj result = new JsonObj();
        boolean rtn = true;
        if (product.getId()!=null){
            rtn = productsService.updateById(product);
        }else{
            rtn = productsService.save(product);
        }
        if (rtn){
            result.resultWithoutRow("0","保存成功");
        }else{
            result.resultWithoutRow("-1","保存失败");
        }
        return result;
    }
    @PostMapping("/delProduct")
    @ApiOperation(value = "删除产品", notes = "")
    @ApiImplicitParam(name = "id", value = "产品id", required = true, dataType = "String")
    public JsonObj delProduct(Integer id){
        JsonObj result = new JsonObj();
        boolean rtn = productsService.removeById(id);
        if (rtn){
            result.resultWithoutRow("0","删除成功");
        }else{
            result.resultWithoutRow("-1","删除失败");
        }
        return result;
    }
}
