package com.wangqian.girl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private  String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
//    @Autowired
//    private GirlProperties girlProperties;
//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    //url中直接拼接参数值，不需要？id=100，直接拼100
//    @GetMapping(value = "/say/{id}")
//    public  String say(@PathVariable("id") Integer id) {
//        return "id" + id;
//    }
   // url中需要拼接？id=100
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id" ,required = false,defaultValue = "0") Integer myId){
//        return "index";
//        return girlProperties.getCupSize();
        return "id:"+myId;
    }
}
