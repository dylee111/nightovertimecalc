package com.nightovertime.nightovertimecalc.service;

import com.nightovertime.nightovertimecalc.dto.MemberFormDto;

public interface MemberService {

    void joinMember(MemberFormDto memberFormDto) throws Exception;
}
