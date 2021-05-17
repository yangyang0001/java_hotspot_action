package com.deepblue.hotspot_inaction.chapter_02_launcher;

abstract class StubParentClass implements ParentInterface {

    public void access() {
        step_first();
        step_second();
        step_third();
        step_fourth();
    }

    public void step_first() {
        System.out.println("StubParentClass invoked, step_first() invoked");
    }

    public void step_second() {
        System.out.println("StubParentClass invoked, step_second() invoked");
    }

    protected abstract void step_third();

    protected abstract void step_fourth();
}
