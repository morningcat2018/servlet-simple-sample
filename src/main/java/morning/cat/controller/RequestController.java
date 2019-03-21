package morning.cat.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/20 10:13 PM
 */
@Controller
@Scope("request")
public class RequestController {

    /**
     * http://localhost:8080/request
     *
     * @return
     */
    @RequestMapping("/request")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}
