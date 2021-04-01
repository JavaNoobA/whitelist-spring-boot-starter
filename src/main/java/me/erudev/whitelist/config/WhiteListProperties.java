package me.erudev.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pengfei.zhao
 * @date 2021/4/1 13:57
 */
@ConfigurationProperties(value = "erudev.whitelist")
public class WhiteListProperties {
    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
