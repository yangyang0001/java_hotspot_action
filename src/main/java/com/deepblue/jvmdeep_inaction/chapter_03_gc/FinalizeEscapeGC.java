package com.deepblue.jvmdeep_inaction.chapter_03_gc;

/**
 * 验证 finalize 只会被 JVM 中的 Finalizer 线程执行一次!
 */
public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method invoked!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}

	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();

		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(1000);

		if(SAVE_HOOK == null) {
			System.out.println("SAVE_HOOK is NULL");
		} else {
			System.out.println("SAVE_HOOK is not NULL");
		}

		System.out.println("----------------------------------------------------------------");

		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(1000);

		if(SAVE_HOOK == null) {
			System.out.println("SAVE_HOOK is NULL");
		} else {
			System.out.println("SAVE_HOOK is not NULL");
		}








	}


}
