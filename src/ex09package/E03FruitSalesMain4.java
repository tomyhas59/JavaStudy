package ex09package;

import ex09package.study.buyer.FruitSeller4;
import ex09package.study.seller.FruitBuyer4;

public class E03FruitSalesMain4 {

	public static void main(String[] args) {

		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);

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
