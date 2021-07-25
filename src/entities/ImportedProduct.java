package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public Double totalPrice() {
		return price + getCustomsFee();
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", getCustomsFee()) + ")");

		return sb.toString();
	}
}
