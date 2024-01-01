package com.example.taskm.dto;

import jakarta.validation.constraints.NotNull;

public class DeveloperDTO {

    @NotNull
    private String nickName;

    private int age;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
