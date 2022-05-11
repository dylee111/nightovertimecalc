package com.nightovertime.nightovertimecalc.entity;

import com.nightovertime.nightovertimecalc.entity.baseentity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "CALENDAR")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Calendar extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CALENDAR_ID")
    private Long id;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "MONTH")
    private int month;

    @Column(name = "DAY")
    private int day;

    @Column(name = "TOTAL_COST")
    private int totalCost;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
}
