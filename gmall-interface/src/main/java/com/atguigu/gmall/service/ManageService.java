package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
    List<BaseCatalog1> getCatalog1();
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    List<BaseAttrInfo> attrInfoList(String catalog3Id);
    //保存平台属性以及平台属性值
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    //获取平台属性
    BaseAttrInfo getAttrInfo(String attrId);

    //获取spu集合
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    // 查询基本销售属性表
    List<BaseSaleAttr> getBaseSaleAttrList();

    //保存销售属性
    void saveSpuInfo(SpuInfo spuInfo);
    //根据spuInfo.id 查询所有spuImg
    List<SpuImage> getSpuImageList(String spuId);
    //获取销售属性和平台属性值
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);
}
