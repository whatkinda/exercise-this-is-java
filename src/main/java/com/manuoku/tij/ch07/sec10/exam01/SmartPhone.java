package com.manuoku.tij.ch07.sec10.exam01;

public class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷을 검색합니다.");
    }
}
