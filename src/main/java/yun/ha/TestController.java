package yun.ha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("tt")
    public String tt(){
        return "积极克服你的三";
    }
}
