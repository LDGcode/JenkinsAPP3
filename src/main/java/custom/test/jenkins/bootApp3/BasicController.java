package custom.test.jenkins.bootApp3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String hello() {
        return "Hello, I'am bootApp3";
    }
}

