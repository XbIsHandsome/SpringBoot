package cn.troubleme.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : 许兵
 * @time   : 2018-08-07 09:34:32
 * @E-mail : troubleme@aliyun.com
 * @Wechat ：玖弦与柒墨
 */

@RestController
public class TestController {

    @GetMapping("/helloworld")
    public ModelAndView helloWorld(){
        ModelAndView mav = new ModelAndView("index.jsp");
        return mav;
    }

}
