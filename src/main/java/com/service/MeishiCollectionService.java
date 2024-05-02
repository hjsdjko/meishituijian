package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishiCollectionEntity;
import java.util.Map;

/**
 * 美食收藏 服务类
 * @author 
 * @since 2021-04-19
 */
public interface MeishiCollectionService extends IService<MeishiCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}