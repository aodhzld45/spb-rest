package com.exrestapi.spbrest.controller.Member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MemberViewController {
    @GetMapping("/member/member_list")
    public String getMember(Model model) {
        model.addAttribute("data", "회원 리스트!");
        return "member/member_list";
    }

}
