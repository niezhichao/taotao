package com.taotao.controller;



import com.taotao.commom.pojo.EUTreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("item/cat")
@Controller
public class ItemCatController {

    @Autowired
    ItemCatService itemCatService;
    @RequestMapping("/list")
    @ResponseBody
    public List<EUTreeNode> getItemList(@RequestParam(value = "id" ,defaultValue = "0") Long parentId){
        List<EUTreeNode> list=itemCatService.getItemCatList(parentId);
        return  list;
    }
}
