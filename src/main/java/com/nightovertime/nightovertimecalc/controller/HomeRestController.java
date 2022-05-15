package com.nightovertime.nightovertimecalc.controller;

import com.nightovertime.nightovertimecalc.dto.MemberFormDto;
import com.nightovertime.nightovertimecalc.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HomeRestController {

    private final MemberService memberService;

    @GetMapping
    public String index() {
        return "HOME";
    }

    @PostMapping(value = "/join")
    public String joinMember(@RequestBody MemberFormDto memberFormDto) throws Exception {
        if (memberFormDto != null) {
            memberService.joinMember(memberFormDto);
            return "success";
        }
        return "fail";
    }
}
