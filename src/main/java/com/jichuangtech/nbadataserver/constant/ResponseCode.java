package com.jichuangtech.nbadataserver.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bingo on 2017/8/27.
 */
public class ResponseCode {

    public static final int SUCCESS_CODE = 200;
    public static final int ACCESS_TOKEN_NOT_FOUND_CODE = 201;
    public static final int TOKEN_INVALID_CODE = 202;

    //Team
    public static final int TEAM_NOT_FOUND_CODE = 300;

    //MatchResult
    public static final int MATCH_RESULT_NOT_FOUND_CODE = 401;


    //Article
    public static final int ARTICLE_NOT_FOUND_CODE = 501;

    //ArticleAttach
    public static final int ARTICLE_ATTACH_RESULT_NOT_FOUND_CODE = 601;

    //图片
    public static final int PIC_SAVE_ERROR_CODE = 500;
    public static final int PIC_DELETE_ERROR_CODE = 501;


    public static final Map<Integer, String> sCodeMsgMap = new HashMap();

    static {
        sCodeMsgMap.put(SUCCESS_CODE, " Success... ");
        sCodeMsgMap.put(ACCESS_TOKEN_NOT_FOUND_CODE, "  not found access token... ");
        sCodeMsgMap.put(TOKEN_INVALID_CODE, " Invalid token... ");

        //Team
        sCodeMsgMap.put(TEAM_NOT_FOUND_CODE, " Not found team ... ");

        //MatchResult
        sCodeMsgMap.put(MATCH_RESULT_NOT_FOUND_CODE, " Not found matchResult ... ");

        //Article
        sCodeMsgMap.put(ARTICLE_NOT_FOUND_CODE, " Not found Article ... ");

        //ArticleAttach
        sCodeMsgMap.put(ARTICLE_ATTACH_RESULT_NOT_FOUND_CODE, " Not found ArticleAttach ... ");

        //图片
        sCodeMsgMap.put(PIC_SAVE_ERROR_CODE, " Save picture error ... ");
        sCodeMsgMap.put(PIC_DELETE_ERROR_CODE, " Delete picture error ... ");
    }

    public static String getMsg(int code) {
        if (sCodeMsgMap.containsKey(code)) {
            return sCodeMsgMap.get(code);
        } else {
            return " Unknown ";
        }
    }


}
