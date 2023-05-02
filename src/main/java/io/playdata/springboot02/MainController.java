package io.playdata.springboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "index"; // (templates/)index(.html) -> 생략
    }

    @RequestMapping("/name")
    public String name(Model model) {
        // Model 타입의 객체를 통해 최종적으로
        // 전달받는 페이지에 데이터를 전달.
        model.addAttribute("name", "Sunghun"); // K,V
        // model을 통해 name이라는 이름의 Sunghun속성을 전달.
        return "index";
    }

    @RequestMapping("/fruits")
    public String getFruits(Model model) {
        // 과일 리스트 생성
        List<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");

        // 모델에 과일 리스트 추가
        model.addAttribute("fruits", fruits);

        return "index";
    }
}
