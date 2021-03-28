package com.narc.baidu.service.baidu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.narc.baidu.service.baidu.service.BaiduService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Narcssus
 * @date : 2019/11/17 17:03
 */
@RestController
@RequestMapping("/ocr")
@Api(tags = "百度OCR相关接口")
@Slf4j
public class OcrController {


    @Autowired
    private BaiduService baiduService;

    @ApiOperation(value = "OCR识别", notes = "OCR识别")
    @GetMapping(value = "/doOCR")
    public JSONObject doOCR(String param) {
        log.info("OCR识别收到请求：{}", param);
        JSONObject paramObject = JSON.parseObject(param);
        return baiduService.doOCR(paramObject);
    }


}
