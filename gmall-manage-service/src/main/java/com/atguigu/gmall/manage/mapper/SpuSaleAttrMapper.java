package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {
    //根据销售属性Id查询销售属性和销售属性值
    List<SpuSaleAttr> selectSpuSaleAttrList(Long spuId);
}
