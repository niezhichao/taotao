package com.taotao.service.impl;

import com.taotao.commom.pojo.EUTreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {


    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EUTreeNode> getItemCatList(long parentId) {
        TbItemCatExample example=new TbItemCatExample();
        TbItemCatExample.Criteria criteria=example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> itemCatList=itemCatMapper.selectByExample(example);
        List<EUTreeNode> treeNodes=new ArrayList<>();
        for(TbItemCat cat:itemCatList){
            EUTreeNode treeNode=new EUTreeNode();
            treeNode.setId(cat.getId());
            treeNode.setText(cat.getName());
            treeNode.setState(cat.getIsParent()?"closed":"open");
            treeNodes.add(treeNode);
        }
        return treeNodes;
    }
}
