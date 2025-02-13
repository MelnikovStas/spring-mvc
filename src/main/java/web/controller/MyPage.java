package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPage {

    @GetMapping(value = "/mypage")
    public String myPage() {
        return "mypage";
    }
}
