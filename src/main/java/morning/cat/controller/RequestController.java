package morning.cat.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

@Controller
//@Scope("request")
public class RequestController {

    /**
     * http://localhost:8080/request
     */
    @RequestMapping("/request")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}
