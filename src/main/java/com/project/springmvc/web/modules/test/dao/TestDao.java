package com.project.springmvc.web.modules.test.dao;

import com.project.springmvc.common.annotation.MyBatisDao;
import com.project.springmvc.web.modules.test.entity.Test;

import java.util.List;

@MyBatisDao
public interface TestDao {

	List<Test> findList();

}

