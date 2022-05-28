package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.lagou.dao.PromotionAdMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
@Service
public class PromotionAdServiceImpl implements PromotionAdService {

    @Autowired
    private PromotionAdMapper AdMapper;
    @Override
    public PageInfo findAllAdByPage(PromotionAdVO AdVO) {


        PageHelper.startPage(AdVO.getCurrentPage(),AdVO.getPageSize());



        List<PromotionAd> allAdByPage = AdMapper.findAllPromotionAdByPage();

        PageInfo<PromotionAd> adPageInfo = new PageInfo<>(allAdByPage);


        return adPageInfo;
    }

    @Override
    public void updatePromotionAdStatus(int id, int status) {
        PromotionAd promotionAd = new PromotionAd();
        promotionAd.setId(id);
        promotionAd.setStatus(status);
        promotionAd.setUpdateTime(new Date());
        AdMapper.updatePromotionAdStatus(promotionAd);
    }
}
