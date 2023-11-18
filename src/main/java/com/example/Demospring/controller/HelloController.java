package com.example.Demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @Controller: Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *  @RestController:Là sự kết hợp của @Controller và @RestController => Viết API
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Spring Cybersoft";
    }

}
