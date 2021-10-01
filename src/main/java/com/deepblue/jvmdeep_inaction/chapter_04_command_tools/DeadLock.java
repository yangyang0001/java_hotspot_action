package com.deepblue.jvmdeep_inaction.chapter_04_command_tools;

/**
 * 死锁校验
 */
public class DeadLock {

	public static final String LOCK_A = "A";
	public static final String LOCK_B = "B";

	public static void main(String[] args) {
		FirstThread threadA = new FirstThread();
		SeondThread threadB = new SeondThread();

		threadA.start();
		threadB.start();
	}

	public static class FirstThread extends Thread {
		@Override
		public void run() {
			synchronized (LOCK_A) {
				System.out.println("----------------------------------------------------------------------------------");
				for (int index = 0; index < 10; index++) {
					System.out.println("threadA lockA index = :" + index);
				}
				try {
					Thread.currentThread().sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (LOCK_B) {
					for (int index = 0; index < 10; index++) {
						System.out.println("threadA lockB index = :" + index);
					}
				}
			}
		}
	}

	public static class SeondThread extends Thread {
		@Override
		public void run() {
			synchronized (LOCK_B) {
				System.out.println("----------------------------------------------------------------------------------");
				for (int index = 0; index < 10; index++) {
					System.out.println("threadB lockB index = :" + index);
				}
				try {
					Thread.currentThread().sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (LOCK_A) {
					for (int index = 0; index < 10; index++) {
						System.out.println("threadB lockA index = :" + index);
					}
				}
			}
		}
	}
}
