package com.nightovertime.nightovertimecalc.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuplicateEmpNoException extends RuntimeException {

    private String msg = "";
    public DuplicateEmpNoException() {
        log.info(String.valueOf(this));
    }

    public DuplicateEmpNoException(String msg) {
        log.info(this + " / " + msg);
    }
}
