package com.zh.community.community.constant;

/**
 * created by ${host}
 */
public enum NotificationStatusEnum {
    READ(1,"已读"),
    UNREAD(0,"未读");
    private int status;
    private String name;

    NotificationStatusEnum(int status, String name) {
        this.status = status;
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
