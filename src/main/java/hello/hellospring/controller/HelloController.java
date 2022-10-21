package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {


    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data" + "hello");
        return "hello";//index.html 와 연결
    }

    @GetMapping("hello-mvc")
    public String hellloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }


    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //"hello spring"
    } ///html 그대로 내려줌

}
//    @GetMapping ("hello-api")
//    @ResponseBody
//    public Hello helloApi
//
//    public Hello getHelloApi() {
//        return helloApi;
//    }
//
//    public void setHelloApi(Hello helloApi) {
//        this.helloApi = helloApi;
//    }
//
//    {@RequestParam("name") String name) {
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//    }//json 방식을 쓰는것이 좋다
    // java bin표준 방식 getter setter방식


//    spring container
//            @response body http응답에바로 넣어야하는건가?
//    객체가 오면 json방식으로 만들어서 http응답에 반환을 한다
//    http message converter hello객체를 json으로 바꾸고 바꾼것을 웹브라우저에 보낸다
//    http의 body에 문자내용을 직접반환
//            기본문자는 stinghttpMessagesConverter
//            기본 개체 처리 mappungJackson2httpMssengeconberter
//  실무에서도 그대로씀


// 참고 클라이언트의HTTP Accept 헤더와 서버의 컨트롤러 반환 타입 정보등을 조합해서
//객체는 제이슨으로 반환이 된다.

//    //정적 컨텐츠 - 파일을 그대로 내려준다
//    템플렛 엔진 모델뷰 엔진으로 쪼개서 뷰를 템플릿엔진을 html으로 한글로 렌더링하여
//    렌더링이 된 html을 클라이언트에  전달해준다
//
//api - 객체를 반환한다.json으로 바꿔서 반환을 해준다
