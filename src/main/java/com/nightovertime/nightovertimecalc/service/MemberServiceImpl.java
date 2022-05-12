package com.nightovertime.nightovertimecalc.service;

import com.nightovertime.nightovertimecalc.dto.MemberFormDto;
import com.nightovertime.nightovertimecalc.entity.Member;
import com.nightovertime.nightovertimecalc.exception.DuplicateEmpNoException;
import com.nightovertime.nightovertimecalc.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public void joinMember(MemberFormDto memberFormDto) throws Exception {
        duplicateEmpNoCheck(memberFormDto.getEmployeeNo());
        memberRepository.save(Member.joinMember(memberFormDto));
    }

    private void duplicateEmpNoCheck(Long employeeNo) {
        if (memberRepository.existsByEmployeeNo(employeeNo)) {
            throw new DuplicateEmpNoException();
        }
    }

}
