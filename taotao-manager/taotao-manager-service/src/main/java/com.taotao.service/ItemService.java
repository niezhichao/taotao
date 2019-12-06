package com.taotao.service;

import com.taotao.commom.pojo.EasyUIResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(Long id);

    EasyUIResult getItemList(Integer page,Integer rows);
}
