package com.cc.net.common.exception.user;

import java.io.Serial;

/**
 * 黑名单IP异常类
 *
 * @author cc
 */
public class BlackListException extends UserException {
    @Serial
    private static final long serialVersionUID = 1L;

    public BlackListException() {
        super("login.blocked", null);
    }
}