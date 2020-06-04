package edu.nyu.blog.web;

import edu.nyu.blog.NotFoundExcepiton;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        int i = 9 / 0;
        String blog = null;
//        if (blog == null) {
//            throw new NotFoundExcepiton("blog not exit");
//        }
        return "index";
    }
}
