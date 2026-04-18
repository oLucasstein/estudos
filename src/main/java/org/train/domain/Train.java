package org.train.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
@AllArgsConstructor
public class Train {
    private Long id;
    private String name;
}