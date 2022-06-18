package com.nightovertime.nightovertimecalc.repository;

import com.nightovertime.nightovertimecalc.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 사번 중복 체크
    boolean existsByEmployeeNo(Long employeeNo);
}
