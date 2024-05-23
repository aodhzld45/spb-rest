package com.exrestapi.spbrest.controller;

import com.exrestapi.spbrest.RequestDTO.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "{home}";
    }

    @GetMapping("/home2")
    public String home2() {
        return "{home2}";
    }

    @GetMapping("/getMember")
    public String getMember(MemberDTO memberDTO) {

        //HashMap<String, Object> resultMap = new HashMap<String, Object>();
        log.info("queryParam : {}", memberDTO);

        //MemberDTO memberDTO = new MemberDTO();
        return "OK";
    }

    @GetMapping("/getCompony/{comNo}")
    public String getCompony(@PathVariable("comNo") Integer comNo) {
        log.info("comNo : {}", comNo);
        return "OK";
    }








}
