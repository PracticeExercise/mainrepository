import java.util.*;
public class User
{
	String name;
	String email;
	String userName;
	String password;
	String loginStatus;
	public User(String n, String e, String u, String p)
	{
		name = n;
		email = e;
		userName = u;
		password = p;
	}
	boolean verifyLogin()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Input username:");
		String un = scn.nextLine();
		System.out.println("Input password:");
		String pw = scn.nextLine();
		return userName.equals(un) && password.equals(pw);
	}
}