package ex08class;

//과일 판매자
class FruitSeller {
	//멤버변수
	int numOfApple = 100;
	int myMoney = 0;
	//멤버상수
	final int APPLE_PRICE = 1000;

	/*
	 멤버변수의 경우 초기값이 없는 상태로 정의한 후 인스턴스를 생성 후 
	 초기화할 수 있다.
	 하지만 멤버상수는 인스턴스 생성과 상관없이 정의하는 시점에 
	 반드시 초기화해야 한다. 즉 1000을 지우면 에러가 발생한다.
	 */
	
	//멤버메서드
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 개수 :" + numOfApple);
		System.out.println("[판매자]판매 수익 :" + myMoney);
	}
}

class FruitBuyer {
	int myMoney = 5000;
	int numOfApple = 0;
 
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:" + myMoney);
		System.out.println("[구매자]사과 개수:" + numOfApple);
	}
}

public class E06FruitSalesMain1 {

	public static void main(String[] args) {

		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();

		System.out.println("구매 행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();

		buyer.buyApple(seller, 5000);

		System.out.println("구매 행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
