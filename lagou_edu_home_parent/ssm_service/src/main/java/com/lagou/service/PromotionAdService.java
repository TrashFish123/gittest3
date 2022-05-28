package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAdVO;

/**
 * @author 张岩
 * @version 1.0
 */
public interface PromotionAdService {
    /*
    分页获取所有的广告列表
    */
     PageInfo findAllAdByPage(PromotionAdVO promotionAdVO);

    /**
     * 上下线
     * @param id 传进来的id
     * @param status 0下线 1上线
     */

    void updatePromotionAdStatus(int id, int status);

}
