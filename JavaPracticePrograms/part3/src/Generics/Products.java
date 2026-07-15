package Generics;

public class Products <T,G>{	//generics
	T item;
	G price;
	public Products(T item, G price) {
		super();
		this.item = item;
		this.price = price;
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public G getPrice() {
		return price;
	}
	public void setPrice(G price) {
		this.price = price;
	}
	
	
}
