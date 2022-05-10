package com.nightovertime.nightovertimecalc.repository;

import com.nightovertime.nightovertimecalc.entity.Member;
import com.nightovertime.nightovertimecalc.entity.info.Division;
import com.nightovertime.nightovertimecalc.entity.info.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Rollback
    public void 회원저장() {

        Member member = Member.builder()
                .name("TESTER")
                .password("123")
                .employeeNo(987654321L)
                .division(Division.DEVELOPMENT_DEPT)
                .position(Position.EMPLOYEE)
                .build();

        memberRepository.save(member);

        Member findMember = memberRepository.findById(1L).orElseThrow();

        assertThat(member.getId()).isEqualTo(findMember.getId());

    }

}