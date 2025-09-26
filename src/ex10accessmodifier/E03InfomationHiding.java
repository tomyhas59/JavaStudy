package ex10accessmodifier;

class FruitSeller {

	/*
	 * 멤버변수에 private 접그닞정자를 추가한다. 이렇게 하면 클래스 내부에서만 접근할 수 있고 외부에서의 접근은 원천적으로 차단할 수
	 * 있다.
	 */
	private int numOfApple;
	private int myMoney;

	private final int APPLE_PRICE;

	// 외부에서 인스턴스 생성을 위해 public으로 선언됨
	public FruitSeller(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}

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
	private int myMoney;
	private int numOfApple;

	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:" + myMoney);
		System.out.println("[구매자]사과 개수:" + numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {

		FruitSeller seller1 = new FruitSeller(0, 100, 1000);
		FruitSeller seller2 = new FruitSeller(0, 80, 500);
		FruitBuyer buyer = new FruitBuyer(10000, 0);

		System.out.println("구매 행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		/*
		멤버변수를 private로 선언하면 클래스 외부에서는 접근이 
		불가능하므로 아래 코드는 에러가 발생
		즉 멤버변수의 "정보은닉"을 통해 비정상적 접근을 차단하고
		멤버메서드를 통해서만 구매가 이뤄질 수 있도록 구현해야 한다.
		 */
		
		
//		seller1.myMoney += 1000;
//		buyer.myMoney -= 1000;
//		seller1.numOfApple -= 50;
//		buyer.numOfApple += 50;
		// 코드에는 문제가 없으나 업무에서의 논리에는 오류 발생

		System.out.println("구매 행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

	}

}
