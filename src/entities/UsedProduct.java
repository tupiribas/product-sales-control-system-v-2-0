package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(getName() + " (used)" + " $ " + getPrice() + " (Manufacture date: " + SDF.format(getManufactureDate())
				+ ")");

		return sb.toString();
	}

}
