package com.exrestapi.spbrest.controller;

import com.exrestapi.spbrest.DTO.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class GetMappingController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("data", "Hello <b>Spring</b>!");
        return "home";
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
