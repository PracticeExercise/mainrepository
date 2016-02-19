public class Product
{
	int productId;
	String category;
	String description;
	public long price;
	public Product(int id, String c, String d, long p)
	{
		productId = id;
		category = c;
		description = d;
		price= p;
	}
}