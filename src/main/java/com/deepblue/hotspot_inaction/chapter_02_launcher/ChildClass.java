package com.deepblue.hotspot_inaction.chapter_02_launcher;

public class ChildClass extends StubParentClass {

    @Override
    protected void step_third() {
        System.out.println("ChildClass invoked, step_third() invoked");
    }

    @Override
    protected void step_fourth() {
        System.out.println("ChildClass invoked, step_fourth() invoked");
    }
}
