package com.fangxin.cesuan.controller;

import com.fangxin.cesuan.common.api.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * 订单记录表 前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2020-01-26
 */
@Slf4j
@RestController
@RequestMapping("/leaveInfo")
public class LeaveInfoController extends BaseController {

    @PostMapping("/test")
    public ApiResult<String> test(String aa) throws Exception {
        return ApiResult.ok("success");
    }

}

