package org.example.service;

import org.example.domain.Main;
import org.example.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MainService {
    public List<Main> listAll(){

        return List.of(new Main(1L, "Lucas"), new Main(2L, "Stein"));
    }
}
