package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> lp = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int quant = sc.nextInt();

		int i = 1;
		while (i <= quant) {
			System.out.print("\nCommon, used or imported (C/U/I)? ");
			String type = sc.next().toUpperCase();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (type.equals("C")) {
				lp.add(new Product("Notebook", price));

			} else if ((type.equals("U"))) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date d = sdf.parse(sc.next());
				lp.add(new UsedProduct("Iphone", price, d));

			} else if (type.equals("I")) {
				System.out.print("Customs fee: ");
				double customsFeeI = sc.nextDouble();
				lp.add(new ImportedProduct("Tablet", price, customsFeeI));
			}

			i++;
		}

		System.out.println("PRICE TAGS: \n");
		for (Product p : lp) {
			System.out.println(p.priceTag());
		}

	}

}
