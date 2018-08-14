package com.yige.controller;/**
 * Created by vetech on 2018/8/14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author zoujiming
 * @since 2018/8/14
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello spring boo";
    }

    @RequestMapping(value = "/usercredit/{id}")
    public Integer getLevel(@PathVariable String id){

        return id.hashCode();
    }

}
