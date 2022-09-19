import java.util.Scanner;

class Car{
double price;
Car(){
	//this.price=price;
}
public double getSalePrice(){
	return price;
}
}
 class Sedan extends Car {
	 int length;
	 double price;
	double dprice;
	double d;
	/*
 double price;
 int length;

public Sedan () {
//super (price);
this.length = length;
}
*/
public double getSalePrice() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the price of the car");
	price = sc.nextInt();
	System.out.println("Enter the length of the car:");
	length = sc.nextInt();
if (length > 20) {
	dprice=(0.2 *price);
	double d = price-dprice;
}
else {
dprice= (0.1 *price);
d = price-dprice;
}
return d;
}

}
public class CarPrice{
	public static void main(String[] ar) {
		Car c = new Sedan();
		System.out.println(c.getSalePrice());
		//System.out.println()
	}
}