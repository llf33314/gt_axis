package com.gt.axis.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.shop.WsWxShopInfo;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.ShopServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
