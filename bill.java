public class Bill
{
	public long totalCost;
	int[]discounts;
	Order order;
	public Bill(int[] d, Order o)
	{
		discounts = d;
		order = o;
	}
	public void calculateTotalCost()
	{
		totalCost = 0;
		for(int x = 0; x < order.products.length; x++)
		{
			totalCost += order.products[x].price;
		}
		for(int x = 0; x < discounts.length; x++)
		{
			totalCost -= discounts[x];
		}
	}
}