package com.carry.seckill.controller;

import com.carry.seckill.common.Result;
import com.carry.seckill.component.LoginParam;
import com.carry.seckill.entity.User;
import com.carry.seckill.service.UserService;
import com.carry.seckill.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String loginPage() {
        return "/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result<User> doLogin(HttpServletResponse response, HttpSession session, @Valid LoginParam loginParam) {
        Result<User> login = userService.login(loginParam);
        System.out.println(login.getData());
        if (login.isSuccess()) {
            CookieUtil.writeLoginToken(response, session.getId());
        }
        return login;
    }

    @RequestMapping("/logout")
    public void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String token = CookieUtil.readLoginToken(request);
        CookieUtil.delLoginToken(request, response);
//        return "redirect:/user/index";
        response.sendRedirect("./index");
    }
}
