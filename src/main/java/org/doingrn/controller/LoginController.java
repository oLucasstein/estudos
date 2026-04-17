package org.doingrn.controller;

import lombok.extern.log4j.Log4j2;
import org.doingrn.LoginApplication;
import org.doingrn.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("main")
public class LoginController {

    public String email = "lucasstein07@gmail.com";
    public String password = "1234";
    public String user = "lucasstein";

    @PostMapping(path = "login")
    public String login(@RequestBody LoginRequest request){
        if(this.email.equals(request.getEmail()) && this.password.equals(request.getPassword() ) && this.user.equals(request.getUser())) {
            return "Login realizado com sucesso";
        } else {
            return "Senha e/ou email nao coincidem";
        }
    }
}
