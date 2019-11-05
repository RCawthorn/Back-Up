public class Add {

    public static void main(String[] args) {
	int a = 70;
	int b = 100;
	int c = a + b;
	int d = a * c;
	
	int Quantity;
	Float price,amount;
	string product;
	product = "Coke";
	Quantity = 15;
	Price = 1.25F;
	
	amount = Quantity * Price;
	
	System.out.println("product" + product);
	System.out.println("Quantity" + Quantity);
	System.out.println("Unit price" + Price);
	System.out.println("Amount" + Amount);
	System.out.println("Vat" + (Amount *20/100));
	System.out.println("Net Amount is "+(Amount-(Amount*0.20)));
	
	

	/*System.out.println("Your answer is " + c);
	System.out.println("A * C is " + d);
	System.out.println("If you add C and D, the answer would be " + c+d); */
	
		
	}
}