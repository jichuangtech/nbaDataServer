package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.MatchResultConstant;
import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.model.MatchResultEntity;
import com.jichuangtech.nbadataserver.model.Page;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.MatchResultRespVo;
import com.jichuangtech.nbadataserver.repository.MatchResultRepository;
import com.jichuangtech.nbadataserver.service.MatchResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MatchResultConstant.API_MATCH_RESULT)
public class MatchResultController extends BaseController {
    private static final String TAG = MatchResultController.class.getSimpleName();


    @Autowired
    private MatchResultService mMatchResultService;

    @Deprecated
    @RequestMapping(value = "/byDate", method = RequestMethod.GET)
    public Response<List<MatchResultRespVo>> listByDate(@RequestParam String date) {
        LOGGER.info(" listByDate date: " + date);
        Response<List<MatchResultRespVo>> response = new Response<>();
        
        response.data = mapList(mMatchResultService.findByGamedate(date), MatchResultRespVo.class);
        LOGGER.info(" match result vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.MATCH_RESULT_NOT_FOUND_CODE);
        }
        return response;
    }

    @RequestMapping(value = MatchResultConstant.PAGINATION, method = RequestMethod.GET)
    public Page paginate(@RequestParam int teamId, @RequestParam int pageSize, @RequestParam int pageIndex) {
        return mMatchResultService.paginate(teamId, pageSize, pageIndex);
    }

    @Deprecated
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response<MatchResultRespVo> listById(@PathVariable int id) {
        LOGGER.info(" listById date: " + id);
        Response<MatchResultRespVo> response = new Response<>();

        response.data = mapSingle(mMatchResultService.findById(id), MatchResultRespVo.class);
        LOGGER.info(" match result vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.MATCH_RESULT_NOT_FOUND_CODE);
        }
        return response;
    }
}
