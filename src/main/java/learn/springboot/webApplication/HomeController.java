package learn.springboot.webApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("*******\nroot endpoint called\n*******");
        return "index.jsp";
    }

    @RequestMapping("result") 
    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession session) {
        System.out.println("*******\nresult endpoint called\n*******");

        int res = n1 + n2;

        session.setAttribute("sum", (res));

        return "result.jsp";
    }

}
