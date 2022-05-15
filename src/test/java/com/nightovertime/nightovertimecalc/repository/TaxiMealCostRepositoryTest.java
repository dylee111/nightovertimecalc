package com.nightovertime.nightovertimecalc.repository;

import com.nightovertime.nightovertimecalc.entity.Member;
import com.nightovertime.nightovertimecalc.entity.TaxiMealCost;
import com.nightovertime.nightovertimecalc.entity.info.Division;
import com.nightovertime.nightovertimecalc.entity.info.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.*;
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

        int taxiCost = 10000;
        int mealCost = 20000;
        int totalCost = taxiCost + mealCost;

        TaxiMealCost taxiMealCost = new TaxiMealCost(findMember, taxiCost, mealCost, totalCost);

        taxiMealCostRepository.save(taxiMealCost);

        TaxiMealCost findCost = taxiMealCostRepository.findById(1L).get();

        // LocalDateTime Format 변경
        String modifiedDate = findCost.getModifiedDate().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nowDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        System.out.println("modifiedDate = " + modifiedDate);

         assertThat(modifiedDate.substring(0, 6)).isEqualTo(nowDate.substring(0, 6));
    }
}