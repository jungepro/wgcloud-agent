package com.wgcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/common/error")
public class CommonCotroller {


    /**
     * 转向到404页面
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("404")
    public String to404(Model model, HttpServletRequest request) {
        return "error/404";
    }

    /**
     * 转向到500页面
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("500")
    public String to500(Model model, HttpServletRequest request) {
        return "error/500";
    }

}
