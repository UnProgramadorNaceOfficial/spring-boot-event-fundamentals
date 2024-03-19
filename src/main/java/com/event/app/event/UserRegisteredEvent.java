package com.event.app.event;

public class UserRegisteredEvent {

    private String username;
    private String password;
    private byte age;

    public UserRegisteredEvent(String username, String password, byte age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public UserRegisteredEvent() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserRegisteredEvent{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
