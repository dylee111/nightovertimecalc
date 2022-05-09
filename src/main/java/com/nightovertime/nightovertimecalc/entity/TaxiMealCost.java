package com.nightovertime.nightovertimecalc.entity;

import com.nightovertime.nightovertimecalc.entity.baseentity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "TAXI_MEAL_COST")
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
    private Member member;

    @Column(name = "TAXI_COST")
    private int taxiCost;

    @Column(name = "MEAL_COST")
    private int mealCost;

}
