package shuimentech.shop.app.commons.api.vip;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import shuimentech.shop.app.commons.module.vip.VipDescriptionEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sgbq
 * @version V1.0
 * @Description: 基于Swagger2生成的 Restful VIP服务接口API文档类
 * @date 2018-11-09
 */
@Api("VIP会员服务接口，主要提供的服务有：" +
        "1.权益介绍  包括权益详情、购物折扣、优惠券、VIP礼包、专享购物日、代购赚钱等" +
        "2.开通VIP  包括确认VIP订单并提供精选商品" +
        "3.VIP尊享商品  针对VIP用户提供的精选商品" +
        "4.VIP代购专区  针对VIP用户，精选高利润商品，促进用户转发购买")
@RestController
public class VipService {

    @ApiOperation(
            httpMethod = "GET",
            value      = "获取用户权益介绍说明",
            tags       = "VIP",
            notes      = "会员权益描述")
    @ApiImplicitParam(name = "描述实体", required = true)
    @GetMapping(
            value      = "/vip_description",
            produces   = MediaType.APPLICATION_JSON_UTF8_VALUE
            /*consumes   = MediaType.APPLICATION_JSON_UTF8_VALUE*/)
    Map<String, Object> vipRightsAndInterests(@RequestBody VipDescriptionEntity entity){return new HashMap<String, Object>(){{put("stat",entity.getId());}};}

}