package com.leeyaonan.demo.controller;

import com.leeyaonan.demo.service.ILoginService;
import com.leeyaonan.mvcframework.annotations.MyAutowired;
import com.leeyaonan.mvcframework.annotations.MyController;
import com.leeyaonan.mvcframework.annotations.MyRequestMapping;
import com.leeyaonan.mvcframework.annotations.Security;

/**
 * @Author leeyaonan
 * @Date 2020/5/5 22:11
 */
@MyController
@MyRequestMapping("/login")
public class LoginController {

    @Security({"tom"})
    public String tom() {
        return "tom";
    }

    @Security({"jerry"})
    public String jerry() {
        return "cat";
    }

}
