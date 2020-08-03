package com.qsf.currency.controller.captchacontroller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
   /* *//**
     * 请求到登陆界面
     * http://localhost:8092/home
     * @param request
     * @return
     *//*
    @ApiOperation(value="请求到登陆界面",notes="请求到登陆界面")
    @GetMapping("code")
    public String home(HttpServletRequest request, Model model) {

        //登录逻辑
        System.out.println("验证码.....");
        return "local/code";
    }

    @PostMapping("local/code")
    public ModelAndView home(String code, RedirectAttributes redirectAttributes, Model model, HttpServletRequest request) {
        ModelAndView view =new ModelAndView();
        String scode = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);

        System.out.println("code = " + code );
        System.out.println("scode = " + scode);


        if (!code.equals(scode)){
            //跳转到 get请求的登陆方法
            view.setViewName("error");
            return view;
        }
        //跳转到 get请求的登陆方法
        view.setViewName("local/code");
        return view;

    }*/
}
