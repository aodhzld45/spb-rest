package com.exrestapi.spbrest.controller;

import com.exrestapi.spbrest.DTO.MemberDTO;
import com.exrestapi.spbrest.ResponseEntity.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PostMappingController {

    @PostMapping("/member")
    public ResponseEntity postCompany(@RequestBody MemberDTO param) {
        log.info("param {}", param);

        ResponseEntity responseEntity = new ResponseEntity();

        try {
            responseEntity.setCode("SU");
            responseEntity.setMessage("SUCCESS");
        }catch (Exception e) {
            responseEntity.setCode("FA");
            responseEntity.setMessage("FAILURE");
        }

        return responseEntity;
    }
}
