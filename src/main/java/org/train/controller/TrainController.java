package org.train.controller;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.train.domain.Train;
import org.train.service.TrainService;

import java.util.List;

@RestController
@RequestMapping("main")
@Log4j2
@AllArgsConstructor
public class TrainController {

    private final TrainService trainService;

    @GetMapping(path = "list")
    public List<Train> list(){
        return trainService.listAll();
    }

}