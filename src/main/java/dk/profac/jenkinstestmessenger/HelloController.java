package dk.profac.jenkinstestmessenger;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Hello, world!";
    }

}
