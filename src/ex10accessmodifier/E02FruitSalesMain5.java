package ex10accessmodifier;

class FruitSeller5 {

	int numOfApple;
	int myMoney;

	final int APPLE_PRICE;

	// 외부에서 인스턴스 생성을 위해 public으로 선언됨
	public FruitSeller5(int money, int appleNum, int price) {
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

class FruitBuyer5 {
	int myMoney;
	int numOfApple;

	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:" + myMoney);
		System.out.println("[구매자]사과 개수:" + numOfApple);
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);

		System.out.println("구매 행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

//		buyer.buyApple(seller1, 5000);
//		buyer.buyApple(seller2, 5000);

		seller1.myMoney += 1000;
		buyer.myMoney -= 1000;
		seller1.numOfApple -= 50;
		buyer.numOfApple += 50;
		// 코드에는 문제가 없으나 업무에서의 논리에는 오류 발생

		System.out.println("구매 행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

	}

}
