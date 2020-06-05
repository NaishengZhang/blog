package edu.nyu.blog.web;

import edu.nyu.blog.NotFoundExcepiton;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        int i = 9 / 0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundExcepiton("blog not exit");
//        }
        System.out.println("--------index--------");
        return "index";
    }
}
