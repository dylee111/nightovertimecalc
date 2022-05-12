package com.nightovertime.nightovertimecalc.entity;

import com.nightovertime.nightovertimecalc.dto.CostDto;
import com.nightovertime.nightovertimecalc.entity.baseentity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TAXI_MEAL_COST")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TaxiMealCost extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COST_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    @ToString.Exclude
    private Member member;

    @Column(name = "TAXI_COST")
    private int taxiCost;

    @Column(name = "MEAL_COST")
    private int mealCost;

    public TaxiMealCost(Member member, int taxiCost, int mealCost) {
        this.member = member;
        this.taxiCost = taxiCost;
        this.mealCost = mealCost;
    }

    /*
    * Member 택시비, 석식비 저장
    * */
    public static TaxiMealCost costSave(CostDto costDto) {
        return new TaxiMealCost(costDto.getMember(), costDto.getTaxiCost(), costDto.getMealCost());
    }
}
