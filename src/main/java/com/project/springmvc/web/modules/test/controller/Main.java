package com.project.springmvc.web.modules.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.project.springmvc.web.modules.test.entity.Test;
import com.project.springmvc.web.modules.test.service.ITestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Main {

    Logger logger = Logger.getLogger(Main.class);

    @Autowired
    public ITestService testService;

    @Value("${jdbc.username}")
    public String uname;

    @RequestMapping("/main")
    public String main() {
        logger.info("uname-------------" + uname);

        List<Test> list = testService.findList();
        logger.info(JSONObject.toJSONString(list));

        return "index";
    }

}
