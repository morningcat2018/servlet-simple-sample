package morning.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/20 10:13 PM
 */
@Controller
public class RequestController {

    @RequestMapping("/request")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}
