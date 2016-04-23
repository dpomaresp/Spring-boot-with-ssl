package ie.decaresystems.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daniel on 23/04/2016.
 */

@Controller
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello, world";
    }
}
