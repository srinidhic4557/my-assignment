package week1.day1;

public class Newname {
	
	public void sendsms() {
		System.out.println("Hello Testleaf");
	}
	protected void allowvoicecall()
	{
		System.out.println("voice call");
	}
		private void takevideo()
		{
			System.out.println("takevideo");
			
			
		}
		public static void main(String[] args)
		{
			Newname obj=new Newname();
			obj.sendsms();
			obj.allowvoicecall();
			obj.takevideo();
		}
	}
