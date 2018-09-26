package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.MatchResultConstant;
import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.model.MatchResultEntity;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.MatchResultRespVo;
import com.jichuangtech.nbadataserver.repository.MatchResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MatchResultConstant.API_MATCH_RESULT)
public class MatchResultController extends BaseController {
    private static final String TAG = MatchResultController.class.getSimpleName();

    @Autowired
    private MatchResultRepository mMatchResultRepository;

    @Deprecated
    @RequestMapping(value = "/byDate", method = RequestMethod.GET)
    public Response<List<MatchResultRespVo>> listByDate(@RequestParam String date) {
        LOGGER.info(" listByDate date: " + date);
        Response<List<MatchResultRespVo>> response = new Response<>();
        
        response.data = mapList(mMatchResultRepository.findByGamedate(date), MatchResultRespVo.class);
        LOGGER.info(" match result vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.MATCH_RESULT_NOT_FOUND_CODE);
        }
        return response;
    }

    @Deprecated
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response<MatchResultRespVo> listById(@PathVariable int id) {
        LOGGER.info(" listById date: " + id);
        Response<MatchResultRespVo> response = new Response<>();

        response.data = mapSingle(mMatchResultRepository.findById(id), MatchResultRespVo.class);
        LOGGER.info(" match result vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.MATCH_RESULT_NOT_FOUND_CODE);
        }
        return response;
    }
}