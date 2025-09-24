package ex07String;

import java.util.Arrays;

public class E02StringMethod4 {

	public static void main(String[] args) {
		getGender("190419-3000000");
		getGender("190419-4000000");

		checkEmail("hong@daum.net");
		checkEmail("not@naver");

		getGenderByIndexOf("190419-3000000");
		getGenderByIndexOf("190419-4000000");

		splitExtension("my.file.image.jpg");

	}

	/*
	 * 퀴즈1] 주민등록번호를 이용하여 성별을 판단하는 프로그램을 charAt()을 이용해서 작성하시오. 190419-3000000 => 남자
	 * 190419-4000000 => 여자
	 */

	static void getGender(String juminNum) {

		char c = juminNum.charAt(7);

		switch (c) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못된 주민번호입니다");
		}

	}

	/*
	 * 퀴즈2] 해당 문자열이 이메일 형식인지 검사하는 프로그램을 contains()를 이용해서 작성하시오. hong@daum.net =>
	 * 이메일형식임 not@naver => 이메일형식이아님
	 */

	public static void checkEmail(String email) {

	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

	    if (email.matches(regex)) {
	        System.out.println("이메일형식임");
	    } else {
	        System.out.println("이메일형식이아님");
	    }
	}

	/*
	 * 퀴즈3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 이용해서 작성하시오.
	 */

	static void getGenderByIndexOf(String juminNum) {
		int hyphenIndex = juminNum.indexOf('-');
		;
		int genderCode = hyphenIndex + 1;

		char c = juminNum.charAt(genderCode);

		switch (c) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못된 주민번호입니다");
		}

	}

	/*
	 * 퀴즈4] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오. 파일명 : my.file.images.jpg
	 */

	static void splitExtension(String filename) {
		int lastIndex = filename.lastIndexOf(".");
		String fileExtension = filename.substring(lastIndex + 1);

		System.out.println(fileExtension);

		String[] strArr=filename.split("\\.");
		
		System.out.println(Arrays.toString(strArr));
		
	}

}
