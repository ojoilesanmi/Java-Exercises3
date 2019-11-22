package Chapter5;
import java.util.Scanner;
public class Sales {
	private int productNumber;
	private double quantitySold;
	
	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public double getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(double quantitySold) {
		this.quantitySold = quantitySold;
	}

	private double product1 = 2.98;
	private double product2 = 4.50;
	private double product3 = 9.98;
	private double product4 = 4.49;
	private double product5 = 6.87;
	
	double totalSales = 0; double item1 = 0; double item2 = 0; double item3= 0; double item4 = 0; double item5 = 0;
	
	public void calculateSales() {
		System.out.println("Hey dear! Input the product number and the quantity of items sold. Kindly punch 0 to get the total sales. Thank you!");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product number here: ");
		productNumber = input.nextInt();
		
		while(productNumber != 0) {
			
			if(productNumber >= 1 && productNumber <=5){
				
				System.out.println("Enter the quantity of product sold: ");
				quantitySold = input.nextDouble();
			} else {
				break;
			}
			
			switch(productNumber) {
			
			
			case 1:
				item1+= product1 * getQuantitySold();
				System.out.printf("The retail price for the product is %.2f%n", item1);
				break;
			case 2:
				item2+= product2 * getQuantitySold();
				System.out.printf("The retail price for the product is %.2f%n", item2);
				break;
			case 3:
				item3+=product3 *getQuantitySold();
				System.out.printf("The retail price for the product is %.2f%n", item3);
				break;
			case 4:
				item4+=product4 * getQuantitySold();
				System.out.printf("The retail price for the product is %.2f%n", item4);
				break;
			case 5:
				item5+=product5 * getQuantitySold();
				System.out.printf("The retail price for the product is %.2f%n", item5);
				break;
				
				
				
			
			
			
			}
			
			System.out.println("Enter next product number or 0 to terminate: ");
			productNumber = input.nextInt();
			
		
			
		}
		totalSales = item1 +item2 +item3 +item4 + item5;
		System.out.printf("total retail value of all products sold is %.2f", totalSales);
		
		
	}
	
	
	

}
