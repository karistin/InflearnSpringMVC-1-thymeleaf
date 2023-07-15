package com.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseView1() {
        ModelAndView data = new ModelAndView("response/hello")
            .addObject("data", "hello!");
        return data;
    }

    @RequestMapping("/response-view-v2")
    public String  responseView2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello";
    }


    // 권장하지는 않지만 이러한 방법도 있다.
    @RequestMapping("/response/hello")
    public void  responseView3(Model model) {
        model.addAttribute("data", "hello!!");
    }
}
