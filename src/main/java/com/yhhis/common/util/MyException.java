package com.yhhis.common.util;

import org.springframework.web.multipart.MultipartException;

@SuppressWarnings("serial")
public class MyException extends MultipartException {
    StackTraceElement[] UNASSIGNED_STACK = new StackTraceElement[0];

    public MyException(String msg) {
        super(msg);
        this.setStackTrace(UNASSIGNED_STACK);
    }

    public MyException(String msg, Throwable cause) {
        super(msg, cause);
        this.setStackTrace(UNASSIGNED_STACK);
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        // TODO Auto-generated method stub
        super.setStackTrace(stackTrace);
    }
}
