package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.domain.Main;
import org.example.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("main")
@Log4j2
@AllArgsConstructor
public class MainController{
    private final DateUtil dateUtil;
    private final MainService mainService;


    @GetMapping(path = "list")

    public List<Main> list(){
        log.info(dateUtil.formatDateTimeToDatabaseStyle(LocalDateTime.now()));
        return mainService.listAll();
    }
}