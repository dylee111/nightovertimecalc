package com.nightovertime.nightovertimecalc.entity;

import com.nightovertime.nightovertimecalc.entity.baseentity.BaseEntity;
import com.nightovertime.nightovertimecalc.entity.info.Division;
import com.nightovertime.nightovertimecalc.entity.info.Position;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.EnumType.*;

@Entity(name = "MEMBER")
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

    @Column(name = "NAME", nullable = false)
    private String name;

    @Enumerated(STRING)
    @Column(name = "DIVISION")
    private Division division;

    @Enumerated(STRING)
    @Column(name = "POSITION")
    private Position position;

    @Builder
    public Member(Long employeeNo, String password, String name, Division division, Position position) {
        this.employeeNo = employeeNo;
        this.password = password;
        this.name = name;
        this.division = division;
        this.position = position;
    }
}
