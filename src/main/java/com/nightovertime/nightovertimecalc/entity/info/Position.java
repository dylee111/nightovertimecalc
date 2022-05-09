package com.nightovertime.nightovertimecalc.entity.info;

public enum Position {

    EMPLOYEE("사원"),
    PREDECESSOR("선임"),
    CHIEF("책임"),
    TEAM_LEADER("팀장");

    private final String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
