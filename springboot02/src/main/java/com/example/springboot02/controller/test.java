package com.example.springboot02.controller;


import com.example.springboot02.bean.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class test {

    @Autowired
    private Teacher teacher;

    @ResponseBody
    @RequestMapping("/bb")
    public List<String> test2(){
        System.out.println(teacher.toString());


        return teacher.getHobbys();
    }
}
