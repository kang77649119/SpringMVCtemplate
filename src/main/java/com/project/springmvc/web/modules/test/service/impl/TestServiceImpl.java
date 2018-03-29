package com.project.springmvc.web.modules.test.service.impl;

import com.project.springmvc.web.modules.test.dao.TestDao;
import com.project.springmvc.web.modules.test.entity.Test;
import com.project.springmvc.web.modules.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements ITestService {

    @Autowired
    public TestDao testDao;

    @Override
    public List<Test> findList() {
        return testDao.findList();
    }

}
