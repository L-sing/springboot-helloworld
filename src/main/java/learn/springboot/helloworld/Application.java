package learn.springboot.helloworld;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
/**
 * Created by mac on 2016/12/29.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello， this is the first web app ,and i'll make a conflict";
    }

    public static void main(String[] args) {
        System.out.println("hahhahha");
        SpringApplication.run(Application.class, args);
        System.out.println("hahhahha");
    }
}