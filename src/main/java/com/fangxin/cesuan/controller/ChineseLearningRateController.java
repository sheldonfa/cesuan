package com.fangxin.cesuan.controller;


import com.fangxin.cesuan.entity.Result;
import com.fangxin.cesuan.entity.StatusCode;
import com.fangxin.cesuan.pojo.ChineseLearningRate;
import com.fangxin.cesuan.service.ChineseLearningRateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * 国学打分表 前端控制器
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Slf4j
@RestController
@RequestMapping("/chineseLearningRate")
public class ChineseLearningRateController extends BaseController {
    @Autowired
    private ChineseLearningRateService chineseLearningRateService;

    @PostMapping("/test")
    public Result add(@RequestBody ChineseLearningRate chineseLearningRate){
        chineseLearningRateService.add(chineseLearningRate);
        return new Result(true, StatusCode.OK,"添加成功");
    }

}

