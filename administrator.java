public class Administrator extends User
{
	String[] permissions, roles;
	public Administrator(String n, String e, String u, String p)
	{
		super(n,e,u,p);
		permissions = new String[0];
		roles = new String[0];
	}
	public void addRole(String role)
	{
		String[] r = new String[roles.length+1];
		for(int x = 0; x < roles.length; x++)
		{
			r[x]=roles[x];
		}
		r[roles.length] = role;
		roles = r;
	}
	public void removeRole(String role)
	{
		int index = -1;
		String[] r = new String[roles.length-1];
		for(int x = 0; x < roles.length; x++)
		{
			if(roles[x].equals(role))
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
				r[x] = roles[x];
			}
			for(int x = index; x < roles.length-1; x++)
			{
				r[x] = roles[x+1];
			}
			roles = r;
		}
	}
	public void addPermission(String permission)
	{
		String[] p = new String[permissions.length+1];
		for(int x = 0; x < permissions.length; x++)
		{
			p[x]=permissions[x];
		}
		p[permissions.length] = permission;
		permissions = p;
	}
	public void removePermission(String permission)
	{
		int index = -1;
		String[] r = new String[permissions.length-1];
		for(int x = 0; x < permissions.length; x++)
		{
			if(permissions[x].equals(permission))
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
				r[x] = permissions[x];
			}
			for(int x = index; x < permissions.length-1; x++)
			{
				r[x] = permissions[x+1];
			}
			permissions = r;
		}
	}
}