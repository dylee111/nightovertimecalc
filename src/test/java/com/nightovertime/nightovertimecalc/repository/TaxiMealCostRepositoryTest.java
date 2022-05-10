package com.nightovertime.nightovertimecalc.repository;

import com.nightovertime.nightovertimecalc.entity.Member;
import com.nightovertime.nightovertimecalc.entity.TaxiMealCost;
import com.nightovertime.nightovertimecalc.entity.info.Division;
import com.nightovertime.nightovertimecalc.entity.info.Position;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaxiMealCostRepositoryTest {

    @Autowired
    private TaxiMealCostRepository taxiMealCostRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void 택시비_석식비_저장() {

        Member member = Member.builder()
                .name("TESTER2")
                .employeeNo(78945613L)
                .password("123")
                .position(Position.CHIEF)
                .division(Division.HR)
                .build();

        memberRepository.save(member);

        Member findMember = memberRepository.findById(1L).orElseThrow();

        TaxiMealCost taxiMealCost = new TaxiMealCost(findMember, 10000, 20000);

        taxiMealCostRepository.save(taxiMealCost);

    }
}