package com.fangxin.cesuan.controller;

import com.fangxin.cesuan.entity.Result;
import com.fangxin.cesuan.entity.StatusCode;
import com.fangxin.cesuan.pojo.Init;
import com.fangxin.cesuan.service.InitService;
import com.fangxin.cesuan.utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 * 初始化信息表 前端控制器
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Slf4j
@RestController
@RequestMapping("/init")
public class InitController {
    @Autowired
    private InitService initService;

    @PostMapping("/test")
    public Result add(@RequestBody Init init , HttpServletRequest request, HttpServletResponse response){
        //获取请求ip
        String ip = request.getRemoteAddr();
        String address = IpUtil.getAddresses("ip= " + ip, "utf-8");
        init.setCustomerIp(ip);
        init.setCustomerAddress(address);
        initService.add(init);
        return new Result(true, StatusCode.OK,"添加成功");
    }
}
