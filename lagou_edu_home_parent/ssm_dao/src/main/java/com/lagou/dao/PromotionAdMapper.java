package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface PromotionAdMapper {
    /*
    分页获取所有的广告列表
    */
    List<PromotionAd> findAllPromotionAdByPage();

    void updatePromotionAdStatus(PromotionAd promotionAd);

}
