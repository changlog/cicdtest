package test.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CICDController {

    @GetMapping("/")
    public String test(){
        System.out.println("젠킨스 테스트 1");
        return "test";
    }
}
