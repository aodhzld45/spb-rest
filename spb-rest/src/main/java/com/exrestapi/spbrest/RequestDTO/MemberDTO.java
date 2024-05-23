package com.exrestapi.spbrest.RequestDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Integer memNo;
    private String memName;
    private String memEmail;

}
