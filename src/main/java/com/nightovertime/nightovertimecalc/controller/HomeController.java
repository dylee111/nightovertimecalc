package com.nightovertime.nightovertimecalc.controller;

import com.nightovertime.nightovertimecalc.dto.MemberFormDto;
import com.nightovertime.nightovertimecalc.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;

    @GetMapping
    @ResponseBody
    public String index() {
        return "HOME";
    }

    @PostMapping(value = "/join")
    @ResponseBody
    public String joinMember(@RequestBody MemberFormDto memberFormDto) throws Exception {
        if (memberFormDto != null) {
            memberService.joinMember(memberFormDto);
            return "success";
        }
        return "fail";
    }
}
