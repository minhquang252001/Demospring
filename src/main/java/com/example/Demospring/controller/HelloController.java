package com.example.Demospring.controller;

import com.example.Demospring.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/** @Controller: Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *  @RestController:Là sự kết hợp của @Controller và @RestController => Viết API
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    Tham số truyền trên trình duyệt: @RequestParam
//    Tham số  truyền ngầm: @RequestParam
//    Tham số đóng vai trò như là 1 đường dẫn: @PathVarible
//    Tham số truyền ngầm là đối tượng: @RequestBody
    @GetMapping("")
    public String hello(@RequestParam String hoten,@RequestParam int tuoi){
        return "Hello Spring boot " + hoten + " - tuoi " + tuoi;
    }

    @PostMapping("/cybersoft")
    public String helloCybersoft(@RequestBody LoginRequest loginRequest){
        return "Hello Spring Cybersoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword();
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){

        return new ResponseEntity<>("Update" + id , HttpStatus.OK);
    }

}
