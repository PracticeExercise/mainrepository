public class Customer extends User
{
	long creditCard;
	String[] interests;
	String postalAddress;
	Order[] orders;
	public Customer(String n, String e, String u, String p, long c, String a)
	{
		super(n,e,u,p);
		creditCard = c;
		postalAddress = a;
		interests = new String[0];
	}
	public void addInterest(String interest)
	{
		String[] r = new String[interests.length+1];
		for(int x = 0; x < interests.length; x++)
		{
			r[x]=interests[x];
		}
		r[interests.length] = interest;
		interests = r;
	}
	public void removeInterest(String interest)
	{
		int index = -1;
		String[] r = new String[interests.length-1];
		for(int x = 0; x < interests.length; x++)
		{
			if(interests[x].equals(interest))
				index=x;
		}
		if(index == -1)
		{
			return; //not found
		}
		else
		{
			for(int x = 0; x < index; x++)
			{
				r[x] = interests[x];
			}
			for(int x = index; x < interests.length-1; x++)
			{
				r[x] = interests[x+1];
			}
			interests = r;
		}
	}
}