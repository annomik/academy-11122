package by.academy.deal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

	private User seller;
	private User buyer;
	private LocalDateTime buyTime = LocalDateTime.now();
	private Product[] basket;
	private LocalDate deadlineDate = LocalDate.now().plusDays(10);

	private int index = 0;

	public Deal() {
		super();
		this.basket = new Product[5];
	}

	public void grow() {
		int newLength = (int) (basket.length == 0 ? 1 : basket.length * 1.5);
		Product[] newBasket = new Product[newLength];
		System.arraycopy(basket, 0, newBasket, 0, basket.length);
		basket = newBasket;
	}

	public void addProduct(Product product) {
		if (index == basket.length) {
			grow();
		}
		basket[index++] = product;
		System.out.println("--- Продукт добавлен в корзину. ---");
	}

	public Product getProduct(int productIndex) {
		return basket[productIndex];
	}

	public void removeProduct(int index) {
		int newLenght = (int) (basket.length == 0 ? 1 : basket.length - 1);
		Product[] newBasket = new Product[newLenght];
		System.arraycopy(basket, 0, newBasket, 0, index);
		System.arraycopy(basket, index + 1, newBasket, index, basket.length - index - 1);
		basket = newBasket;
	}

	public void BillPrint(Deal deal) {
		System.out.println("-----------------------------");
		System.out.println("Покупатель: " + deal.buyer.getName() + ". Сумма в кошелке: " + deal.buyer.getMoney()
				+ "Тел.: " + deal.buyer.getPhone() + ". Email: " + deal.buyer.getEmail());

		if (seller.getMoney() < calcFullPrice(basket)) {
			System.out.println("У Вас недостаточно средств для покупки");
			return;
		} else {
			System.out.println("------------ Чек -----------");
			for (int i = 0; i < deal.basket.length; i++) {
				if (deal.basket[i] != null) {
					System.out.println((i + 1) + "." + deal.basket[i].getName() + " -- стоимость: "
							+ deal.basket[i].calcFinalPrice(basket[i]) + " руб.");
				}
			}
			System.out.println("-----------------------------");
			System.out.println("Итого: " + calcFullPrice(deal.basket) + " руб.");
			System.out.println("Время покупки: " + buyTime);
			System.out.println("Deadline: " + deal.deadlineDate);
			System.out.println("---- Спасибо за покупку! ----");
		}

		deal.seller.setMoney(deal.seller.getMoney() + calcFullPrice(basket));
		deal.buyer.setMoney(deal.buyer.getMoney() - calcFullPrice(basket));
		System.out.println("У вас осталось: " + deal.buyer.getMoney() + " руб.");
	}

	public void printBasket(Deal deal) {
		if (calcFullPrice(deal.basket) == 0) {
			System.out.println(" Ваша корзина пуста");
		} else {
			System.out.println("------------Ваша корзина покупок -----------");
			for (int i = 0; i < deal.basket.length; i++) {
				if (deal.basket[i] != null) {
					System.out.println((i + 1) + "." + deal.basket[i].getName() + " -- стоимость: "
							+ deal.basket[i].calcFinalPrice(basket[i]) + " руб.");
				}
			}
			System.out.println("-----------------------------");
			System.out.println("Итого: " + calcFullPrice(deal.basket) + " руб.");
			System.out.println("-----------------------------");
		}
	}

	public double calcFullPrice(Product[] basket) {
		double fullPrice = 0;
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] != null) {
				fullPrice += basket[i].calcFinalPrice(basket[i]);
			}
		}
		return fullPrice;
	}

	public Deal(User seller, User buyer, LocalDateTime buyTime, Product[] basket, int index) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.buyTime = buyTime;
		this.basket = basket;
		this.index = index;
	}

	public Deal(User seller, User buyer, Product[] basket) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.basket = basket;

	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public LocalDateTime getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(LocalDateTime buyTime) {
		this.buyTime = buyTime;
	}

	public Product[] getBasket() {
		return basket;
	}

	public void setBasket(Product[] basket) {
		this.basket = basket;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "Deal [seller=" + seller + ", buyer=" + buyer + ", buyTime=" + buyTime + ", basket="
				+ Arrays.toString(basket) + ", deadlineDate=" + deadlineDate + ", index=" + index + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(basket);
		result = prime * result + Objects.hash(buyTime, buyer, deadlineDate, index, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Arrays.equals(basket, other.basket) && Objects.equals(buyTime, other.buyTime)
				&& Objects.equals(buyer, other.buyer) && Objects.equals(deadlineDate, other.deadlineDate)
				&& index == other.index && Objects.equals(seller, other.seller);
	}

}
