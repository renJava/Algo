package ru.hello1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
// Включил настройку у флага: Allow auto-make to start even if developed application is running.
public class Hello1Controller {

    @GetMapping
    public String helloPage() {
        return "Отправь имя через POST-запрос";
    }

    @PostMapping
    public String greetUser(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}

