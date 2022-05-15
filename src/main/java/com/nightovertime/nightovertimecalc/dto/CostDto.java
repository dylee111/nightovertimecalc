package com.nightovertime.nightovertimecalc.dto;

import com.nightovertime.nightovertimecalc.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CostDto {

    private Member member;

    private int mealCost;

    private int taxiCost;

    private int totalCost;
}
