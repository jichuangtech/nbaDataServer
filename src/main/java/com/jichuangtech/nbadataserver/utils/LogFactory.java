package com.jichuangtech.nbadataserver.utils;

import com.jichuangtech.nbadataserver.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFactory {
    public static Logger newLogger() {
        return LoggerFactory.getLogger(Constant.MODULE_NAME);
    }
}
