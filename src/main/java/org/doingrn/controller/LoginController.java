package org.doingrn.controller;


import org.doingrn.dto.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class LoginController{

    public String email = "lucasstein07@gmail.com";
    public String password = "1234";
    public String user = "lucasstein";

    @PostMapping(path = "login")
    public String login(@RequestBody LoginRequest request){
        if(this.email.equals(request.getEmail()) && this.password.equals(request.getPassword()) && this.user.equals(request.getUser())){
            return "Login Efetuado com sucesso";
        } else {
            return "Login Inválido";
        }
    }

}