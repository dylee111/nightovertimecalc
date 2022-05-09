package com.nightovertime.nightovertimecalc.entity;

import com.nightovertime.nightovertimecalc.entity.baseentity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "EMP_NO", nullable = false, unique = true)
    private Long employeeNo;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "DIVISION")
    private String division;

    @Column(name = "POSITION")
    private String position;

}
