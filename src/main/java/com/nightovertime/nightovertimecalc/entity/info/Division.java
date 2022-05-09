package com.nightovertime.nightovertimecalc.entity.info;

public enum Division {
    ACCOUNTING("회계"),
    HR("인사"),
    DEVELOPMENT_DEPT("개발"),
    SALES("영업");

    private final String divisionName;

    Division(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDivisionName() {
        return divisionName;
    }
}
