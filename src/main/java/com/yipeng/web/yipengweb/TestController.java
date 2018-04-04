package com.yipeng.web.yipengweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yipeng.wjj
 * @date 2018-04-04
 */
@RestController
public class TestController {
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test() {
        return "Hello Test!";
    }
}
