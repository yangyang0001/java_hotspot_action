import com.deepblue.hotspot_inaction.chapter_04_running_data.BASE64Util;

public class KlassTest {

	public static void main(String[] args) throws Exception{
		BASE64Util base64Util = new BASE64Util();
		long index = 0;
		while(true) {
			System.out.println("index = " + index + ", encodeBase64 is " + base64Util.encodeBase64(String.valueOf(index)));
			index++;
			Thread.currentThread().sleep(1000L);
		}
	}
}
