package com.yueqian.epidemic.controller;

import com.yueqian.epidemic.beans.UserInfo;
import com.yueqian.epidemic.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    public static Logger loggeer=Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(UserInfo userInfo, Model model, HttpSession session){
        loggeer.debug("这是登录请求的....userInfo.account:" + userInfo.getAccount() + ",userInfo.password:" + userInfo.getPassword());
        UserInfo user = userService.findByAccount(userInfo.getAccount());
        if (user == null) {
            model.addAttribute("msg", "用户账号不存在！");
            return "login";
        }
        if (user.getPassword().equals(userInfo.getPassword())) {
            //登录成功了
            session.setAttribute("loginedUser",user);
            return "redirect:/main.jsp";
        }
        model.addAttribute("msg", "用户密码错误！");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清空session
        session.invalidate();
        return "redirect:/login.jsp";
    }
}
