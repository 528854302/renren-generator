package com.a528854302.gmall.provider.dao;

import com.a528854302.gmall.portal.vo.SkuItemSalesAttrVo;
import com.a528854302.gmall.provider.entity.SkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku销售属性&值
 * 
 * @author 528854302
 * @email 528854302@qq.com
 * @date 2020-07-18 19:52:13
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseMapper<SkuSaleAttrValueEntity> {

    List<SkuItemSalesAttrVo> selectSaleAttrVosBySpuId(@Param("spuId") Long spuId);
}
