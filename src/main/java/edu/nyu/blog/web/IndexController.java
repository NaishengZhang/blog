package edu.nyu.blog.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
