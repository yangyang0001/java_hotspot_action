package com.deepblue.jvmdeep_inaction.chapter_02_memory;


/**
 * VM args: -Xss1K
 */
public class StackOOM {

	public int deep = 0;

	public void test() {
		deep ++;
		System.out.println("StackOOM deep is :" + deep);
		long count0,  count1, count2, count3, count4, count5, count6, count7, count8, count9,
			 count10, count11, count12, count13, count14, count15, count16, count17, count18, count19,
			 count20, count21, count22, count23, count24, count25, count26, count27, count28, count29,
		     count30, count31, count32, count33, count34, count35, count36, count37, count38, count39,
			 count40, count41, count42, count43, count44, count45, count46, count47, count48, count49,
			 count50, count51, count52, count53, count54, count55, count56, count57, count58, count59,
			 count60, count61, count62, count63, count64, count65, count66, count67, count68, count69,
			 count70, count71, count72, count73, count74, count75, count76, count77, count78, count79,
			 count80, count81, count82, count83, count84, count85, count86, count87, count88, count89,
			 count90, count91, count92, count93, count94, count95, count96, count97, count98, count99,
			 count100, count101, count102, count103, count104, count105, count106, count107, count108,
			 count109, count110, count111, count112, count113, count114, count115, count116, count117,
			 count118, count119, count120, count121, count122, count123, count124, count125, count126,
			 count127, count128, count129 = 100;
		test();
	}

	public static void main(String[] args) {
	    StackOOM oom = new StackOOM();
	    oom.test();
	}

}
