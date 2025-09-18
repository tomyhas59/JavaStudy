
package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		// 오늘 날짜와 시간 가져오기
		Date toDayOfDate = new Date();
		System.out.println("오늘 날짜:" + toDayOfDate);

		// 주로 사용하는 포맷으로 변경
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);

		System.out.println("변형된 날짜:" + toDayString);

	}

}
