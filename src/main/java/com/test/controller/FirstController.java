/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FirstController
 * Author:   kcy
 * Date:     2018/2/24 11:29
 * Description: 第一个controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.controller;

import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈第一个controller〉
 *
 * @author kcy
 * @create 2018/2/24
 * @since 1.0.0
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/queryinfo", method = RequestMethod.POST)
    public Map queryInfo(@RequestParam("id") String id){
        System.out.println(id + "----------------");
        Map map = demoService.queryInfoById(id);
        System.out.println(map + "sssssssssssss");
        return map;
    }

    @RequestMapping(value = "/queryname", method = RequestMethod.POST)
    public String queryMyInfo(@RequestParam("uname") String name){
        System.out.println(name + "----------------");
        System.out.println("this is my job");
        return "your name is :" + name;
    }

    @RequestMapping(value = "/queryage", method = RequestMethod.GET)
    public String greeting(@RequestParam("age") String age) {
        System.out.println(age + "~~~~~~~~~~~");
        System.out.println("this is a new world");
        return "hello, " + age;
        
    }
}