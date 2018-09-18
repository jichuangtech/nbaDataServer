package com.jichuangtech.nbadataserver.controller;


import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.utils.DozerUtil;
import com.jichuangtech.nbadataserver.utils.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Transactional
public class BaseController {
    protected static final Logger LOGGER = LogFactory.newLogger();
    protected  <T> T mapSingle(Object source, Class<T> destinationClass) {
        return DozerUtil.map(source, destinationClass);
    }

    protected <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        return DozerUtil.mapList(sourceList, destinationClass);
    }

    protected <T> Response<T> getResponse(Class<T> destinationClass) {
        return new Response<T>();
    }

    protected <T> Response<List<T>> getResponseList(Class<T> destinationClass) {
        return new Response<List<T>>();
    }
}
