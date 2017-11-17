package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by fuxi100 on 2017/10/19.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello22")
    public String hello(ModelMap map){
        map.addAttribute("hello","hello 123  fff");
        map.addAttribute("time",new Date());
        List list=new ArrayList();
        list.add("haha");
        list.add("maml");
        list.add("ppp");
        map.addAttribute("list",list);

        Map map1=new HashMap();
        map1.put("key","value1");
        map.addAttribute("map",map1);

        User u1=new User("123","张三",25);
        map.addAttribute("user",u1);


        return "hello";
    }

}
