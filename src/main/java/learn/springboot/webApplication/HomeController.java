package learn.springboot.webApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("*******\nroot endpoint called\n*******");
        return "index.jsp";
    }


    /*
     * Accepting request by servelet way reply
     * Please find the newer versions of project for
     * code of accepting results in spring way
     */

    @RequestMapping("result") 
    public String add(HttpServletRequest req, HttpSession session) {
        System.out.println("*******\nresult endpoint called\n*******");

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        session.setAttribute("sum", (num1+num2));

        return "result.jsp";
    }

}
