package com.fangxin.cesuan.controller;

import com.fangxin.cesuan.entity.Result;
import com.fangxin.cesuan.entity.StatusCode;
import com.fangxin.cesuan.pojo.BabyName;
import com.fangxin.cesuan.service.BabyNameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * 宝宝起名表 前端控制器
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Slf4j
@RestController
@RequestMapping("/babyName")
public class BabyNameController extends BaseController {
    @Autowired
    private BabyNameService babyNameService;

    @PostMapping("/test")
    public Result add(@RequestBody BabyName babyName){
        babyNameService.add(babyName);
        return new Result(true, StatusCode.OK,"添加成功");
    }
}
