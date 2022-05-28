package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface PromotionSpaceMapper {

    /**
获取所有的广告位
*/
    List<PromotionSpace> findAllPromotionSpace();

    /**
添加广告位
*/
    void savePromotionSpace(PromotionSpace promotionSpace);

    /**
     * 根据id 查询广告位信息
     * */
    PromotionSpace findPromotionSpaceById(int id);
    /**
     * 修改广告位
     * */
    void updatePromotionSpace(PromotionSpace promotionSpace);






}
