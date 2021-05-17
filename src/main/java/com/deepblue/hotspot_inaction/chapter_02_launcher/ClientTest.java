package com.deepblue.hotspot_inaction.chapter_02_launcher;

public class ClientTest {

    public static void main(String[] args) {
        ParentInterface pi = new ChildClass();
        pi.access();
    }
}
