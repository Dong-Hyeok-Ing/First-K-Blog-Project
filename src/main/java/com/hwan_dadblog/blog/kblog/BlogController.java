package com.hwan_dadblog.blog.kblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // 스프링이 com.hwan_dadblog.blog.kblog 요 패키지 아래를 스캔하는데 특정 어노테이션이 피료합니다.
@RestController
public class BlogController {

    @GetMapping("/kblog/hello")
    public  String hello(){
        return  "<h1>스프링 테스트 합니다. </h1>";
    }
}
