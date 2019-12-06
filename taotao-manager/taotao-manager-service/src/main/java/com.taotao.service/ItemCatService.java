package com.taotao.service;

import com.taotao.commom.pojo.EUTreeNode;

import java.util.List;

public interface ItemCatService {
    List<EUTreeNode>  getItemCatList(long parentId);
}
