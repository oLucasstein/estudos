package org.train.service;

import org.springframework.stereotype.Service;
import org.train.domain.Train;

import java.util.List;

@Service
public class TrainService {
    public List<Train> listAll(){
        return List.of(new Train(1L, "Lucas"), new Train(2L, "Stein"));
    }
}
