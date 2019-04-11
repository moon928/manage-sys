package cn.team.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cn.team.bean.ResultBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sang on 2017/12/29.
 */
@RestController
public class RegLoginController {
	 // 登陆处理
    @RequestMapping("/doLogin")
    public ResultBean<String> login() {
        ResultBean resultBean = new ResultBean("尚未登录，请登录");
        resultBean.setCode(ResultBean.NO_LOGIN);
        return resultBean;
    }
	
   
    
//    @GetMapping("/user/hello")
//    public String hello() {
//        return "hello";
//    }    
//    @GetMapping("/employee/basic/hello")
//    public String basicHello() {
//        return "basicHello";
//    }
}
