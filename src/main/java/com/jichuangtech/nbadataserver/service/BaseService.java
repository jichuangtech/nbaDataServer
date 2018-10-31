package com.jichuangtech.nbadataserver.service;

import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.controller.BaseController;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.TeamRespVo;
import com.jichuangtech.nbadataserver.repository.TeamRepository;
import com.jichuangtech.nbadataserver.utils.DozerUtil;
import com.jichuangtech.nbadataserver.utils.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;

@Service
public class BaseService {
    protected static final Logger LOGGER = LogFactory.newLogger();
    protected String TAG = BaseService.class.getSimpleName();

    protected void showLog(String msg) {
        LOGGER.info("[--" + TAG + "--] " + msg);
    }

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
