package ex08class;

//과일 판매자
class FruitSeller2 {
	// 멤버변수
	int numOfApple;
	int myMoney;
	int apple_price;

	/*
	 * 기존의 멤버상수를 변수로 변경하는 이유는 상수는 한번 초기화되면 다른 갑승로 변경할 수 업슨ㄴ 특성이 있으므로 초기화 메서드 내에서도
	 * 초기화할 수 없다. 따라서 이 클래스에서는 멤버상수를 사용할 수 없는 상태가 된다.
	 * 
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}

	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 개수 :" + numOfApple);
		System.out.println("[판매자]판매 수익 :" + myMoney);
	}
}

class FruitBuyer2 {
	int myMoney;
	int numOfApple;

	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:" + myMoney);
		System.out.println("[구매자]사과 개수:" + numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {

		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);

		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);

		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);

		System.out.println("구매 행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매 행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
