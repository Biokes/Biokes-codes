public class CarApplication{
	public static void main(String[] args ){
	Car car1 = new Car("Toyota","2002",25000.0);
	Car car2 = new Car("Honda","2007", 35000.0);
        car1.setModel("Toyota");car1.setPrice(25000.0);
	car2.setModel("Honda");car2.setPrice(35000.0);
System.out.printf("The price for %s is $%.1f.%n",car1.getModel(),car1.getPrice());
System.out.printf("The price for %s is $%.1f.%n",car2.getModel(),car2.getPrice());
double discountPrice1 =car1.getPrice() - (car1.getPrice() * 7/100);
double discountPrice2 =car2.getPrice() - (car2.getPrice() * 5/100);
System.out.printf("The discount for %s is 7 percent so net price is $%.2f.%n",car1.getModel(),discountPrice1);
System.out.printf("The discount for %s is 5 percent so net price is $%.2f.",car2.getModel(),discountPrice2);
}
}


