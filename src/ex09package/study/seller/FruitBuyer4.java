package ex09package.study.seller;

import ex09package.study.buyer.FruitSeller4;

public class FruitBuyer4 {
	int myMoney;
	int numOfApple;

	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액:" + myMoney);
		System.out.println("[구매자]사과 개수:" + numOfApple);
	}
}
