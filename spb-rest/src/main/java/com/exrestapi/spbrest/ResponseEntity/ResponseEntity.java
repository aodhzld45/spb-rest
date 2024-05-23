package com.exrestapi.spbrest.ResponseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
public class ResponseEntity {
    private String code;
    private String message;
}
