package invoice;

public class Invoice {
	private String number;
	private String description; 
	private int quantity; 
	private double price; 
	
	
	public Invoice(String number, String description, int quantity, double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void getInvoiceAmount() {
		double invoiceAmount = 0.0; 
		int qty = getQuantity(); 
		double prc = getPrice(); 
		
		if(qty <0) { 
			qty = 0; 
			
		}if(prc <0) { 
			prc = 0.0; 
			
		}
		
		invoiceAmount = qty * prc;
		System.out.printf("%nInvoice amount: $%.2f", invoiceAmount);
	}
	
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
}
