package com.nightovertime.nightovertimecalc.repository;

import com.nightovertime.nightovertimecalc.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByEmployeeNo(Long employeeNo);
}
