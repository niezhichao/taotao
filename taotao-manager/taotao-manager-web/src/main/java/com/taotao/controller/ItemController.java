package com.taotao.controller;


import com.taotao.commom.pojo.EasyUIResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(Long itemId){
        return  itemService.getItemById(itemId);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EasyUIResult getItemList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "30") Integer rows){
        EasyUIResult easyUIResult=itemService.getItemList(page,rows);
        return  easyUIResult;
    }


}
