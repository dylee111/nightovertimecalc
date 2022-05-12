package com.nightovertime.nightovertimecalc.dto;

import com.nightovertime.nightovertimecalc.entity.info.Division;
import com.nightovertime.nightovertimecalc.entity.info.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {

    private Long employeeNo;

    private String password;

    private String name;

    private Division division;

    private Position position;
}
