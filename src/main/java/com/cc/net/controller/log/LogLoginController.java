package com.cc.net.controller.log;

import com.cc.net.entity.log.LogLogin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2023-42-08 14:10:202
 */
@RestController
@RequestMapping("/logLogin")
@Api(tags = "日志-登录")
public class LogLoginController {

    @PostMapping("/list")
    @ApiOperation(value = "日志列表")
    public ArrayList<LogLogin> getListPage() {
        return new ArrayList<LogLogin>();
    }
}
