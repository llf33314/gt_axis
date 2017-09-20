package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.shop.*;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.ShopServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/shop")
@RestController
public class ShopController {

    @RequestMapping(value = "/getShopById")
    public String getShopById(){
        int shopId = 3;
        AxisResult<WsWxShopInfo> axisResult = ShopServer.getShopById(shopId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getShopPhotoByShopId")
    public String getShopPhotoByShopId(){
        int shopId = 3;
        AxisResult<List<WsShopPhoto>>  axisResult = ShopServer.getShopPhotoByShopId(shopId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/exists")
    public String exists(){
        List<Integer> shopIds = new ArrayList<>();
        shopIds.add(3);
        shopIds.add(4);
        AxisResult<List<Integer>>  axisResult = ShopServer.exists(shopIds);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/queryWxShopByBusId")
    public String queryWxShopByBusId(){
        int shopId = 33;
        AxisResult<List<WsWxShopInfoExtend>>  axisResult = ShopServer.queryWxShopByBusId(shopId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/addShopSubShop")
    public String addShopSubShop(){
        ShopSubsop ShopSubsop = new ShopSubsop();
        ShopSubsop.setShopId(3);
        ShopSubsop.setSubShop(2);
        ShopSubsop.setModel(1);
        ShopSubsop.setStatus(1);
        AxisResult<Integer>  axisResult = ShopServer.addShopSubShop(ShopSubsop);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/updateBySubShop")
    public String updateBySubShop(){
        ShopSubsop ShopSubsop = new ShopSubsop();
        ShopSubsop.setSubShop(2);
        ShopSubsop.setModel(1);
        AxisResult<Integer>  axisResult = ShopServer.updateBySubShop(ShopSubsop);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/queryWxShopByFanCha")
    public String queryWxShopByFanCha(){
        QueryWxShopByFanCha queryWxShopByFanCha = new QueryWxShopByFanCha();
        queryWxShopByFanCha.setBusId(33);
        List<Integer> shopIds = new ArrayList<>();
        shopIds.add(3);
        queryWxShopByFanCha.setIds(shopIds);
        AxisResult<List<WsWxShopInfoExtend>>  axisResult = ShopServer.queryWxShopByFanCha(queryWxShopByFanCha);
        return JSONObject.toJSONString(axisResult);
    }


}
