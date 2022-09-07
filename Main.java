import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Product> baskets = new ArrayList<>();
		baskets.add(new Product("Leather wallet", 1100, 18, 1));
		baskets.add(new Product("Umbrella", 900, 12, 2));
		baskets.add(new Product("Cigarette", 200, 28, 3));
		baskets.add(new Product("Honey", 100, 0, 4));

		Product maxGSTProduct = baskets.get(0);
		double totalPrice = 0.0;
		for (Product product : baskets) {
			totalPrice += product.getPrice();
			if (maxGSTProduct.getGstAmount() < product.getGstAmount()) {
				maxGSTProduct = product;
			}
		}

		System.out.println("Total Price : " + totalPrice);
		System.out.println("Maximum gst product is : " + maxGSTProduct);
	}
}
