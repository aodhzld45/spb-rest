package com.exrestapi.spbrest.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

//공통 DTO
@Getter
@Setter
@ToString
public class BaseDTO {

    private String regDate;
    private String delDate;
    private String upDate;
    private String errMsg;

}
