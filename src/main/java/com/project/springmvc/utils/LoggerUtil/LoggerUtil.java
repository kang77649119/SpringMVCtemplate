package com.project.springmvc.utils.LoggerUtil;

import org.apache.log4j.Logger;

public class LoggerUtil {

    private static Logger logger;

    public LoggerUtil() {}

    static public LoggerUtil getLogger(Class clazz) {
        logger = logger.getLogger(clazz);
        return new LoggerUtil();
    }

    public void info(String ...params) {

        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < params.length; i++) {
            strBuf.append("########").append(params[i]);
        }
        logger.info(strBuf.toString());
    }



}
