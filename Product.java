
public class Product {
	private String product;
	private int unitPrice;
	private int gst;
	private int quantity;
	private double price;
	private double gstAmount;

	public Product(String product, int unitPrice, int gst, int quantity) {
		this.product = product;
		this.unitPrice = unitPrice;
		this.gst = gst;
		this.quantity = quantity;
		applyGST();
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public double getGstAmount() {
		return gstAmount;
	}

	public void applyGST() {
		price = unitPrice * quantity;
		gstAmount = price * gst / 100;
		price += gstAmount;
		if (price >= 500) {
			price = price + (price * 0.05);
		}
	}

	@Override
	public String toString() {
		return "Product [product=" + product + ", unitPrice=" + unitPrice + ", gst=" + gst + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
