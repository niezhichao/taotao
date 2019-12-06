package com.taotao.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.commom.pojo.EasyUIResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public EasyUIResult getItemList(Integer page, Integer rows) {
        TbItemExample itemExample=new TbItemExample();
        PageHelper.startPage(page,rows);
        List<TbItem>  itemList=tbItemMapper.selectByExample(itemExample);
        EasyUIResult result=new EasyUIResult();
        result.setRows(itemList);
        PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(itemList);
        result.setTatol((int)pageInfo.getTotal());
        return result;
    }
}
