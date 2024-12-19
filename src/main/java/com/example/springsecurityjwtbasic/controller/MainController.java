package com.example.springsecurityjwtbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody   // 웹 페이지(뷰)를 리턴해 줄 것이 아니라 특정 데이터를 리턴할 것이기 때문에 @ResponseBody 어노테이션 작성
public class MainController {

    @GetMapping("/")
    public String mainP() {
        return "Main Controller";
    }

}
