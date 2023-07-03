package com.bigdata.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class NotFoundExceptionController implements ErrorController {

    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = {"/error"})
    @ResponseBody
    public Result error(HttpServletRequest request) {
        return new Result(404,null,"请求资源未找到");
    }
}
