package invoice;

public class App {
	
	public static void main (String[] args) {
		Invoice invoice1 = new Invoice("001", "pencil", 35, 1.20);
		
		invoice1.getInvoiceAmount();
		
		Invoice invoice2 = new Invoice("002","pen",-40, 2.15);
		
		invoice2.getInvoiceAmount();
		
		Invoice invoice3 = new Invoice("003", "eraser", 70, -0.70);
		
		invoice3.getInvoiceAmount();
	}
}
