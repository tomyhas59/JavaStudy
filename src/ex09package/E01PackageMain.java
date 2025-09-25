package ex09package;

import java.util.Date;

import ex09package.study.util.CommonUtil;

public class E01PackageMain {

	public static void main(String[] args) {

		/*
		 * 하나의 클래스 안에 패키지는 다르나 같은 이름의 클래스를 사용해야 할 때 방법1: 클래스명 앞에 패키지의 풀경로를 명시 방법2: 하나의
		 * 클래스는 import하고 다른 하나는 패키지의 풀경로를 명시
		 */
		Date utilDate = new Date();
		System.out.println("utilDate=" + utilDate);

		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate=" + sqlDate);

		String strValue = "987654321";

		/*
		 * static으로 선언된 메서드는 new를 통해 인스턴스 생성 없이 클래스명으로 직접 메서드를 호출할 수 있다. Java에서 제공하는 클래스
		 * 중 대표적으로 Math를 예로 들 수 있는데 난수 생성을 위해 Math.random() 메서드를 인스턴스 생성 없이 호출할 수 있다.
		 */
		boolean isNum = CommonUtil.isNumber(strValue);
		if (isNum == true) {
			System.out.println("문자열은 숫자입니다");
		} else {
			System.out.println("숫자가 아닙니다");
		}
		System.out.println(ex09package.study.util.CommonUtil.isNumber("백20"));

	}

}
