public class Order
{
	int orderId;
	Date creationDate;
	String dateShipped;
	String status;
	public Product[] products;
	Bill bill;
	public Order(int id, Date cd, String ds, String s, Product[] p, int[] d)
	{
		orderId = id;
		creationDate = cd;
		dateShipped = ds;
		status = s;
		products = p;
		bill = new Bill(d, this);
	}
}