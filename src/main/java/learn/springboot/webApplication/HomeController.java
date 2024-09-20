package learn.springboot.webApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("home() called :)");
        return "index.jsp";
    }

}
