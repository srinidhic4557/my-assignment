package week3.day1assignment;

public class Students {

	public void studentinfo( int id){
		System.out.println(id);
	}
	public void studentinfo(String id , String name) {
		System.out.println(id+name);
	}
	public void studentinfo(String email ,double  phonenumber) {
		System.out.println(email+phonenumber);
	}

	
	public static void main(String[] args) {
		Students obj=new Students();
		obj.studentinfo(23456);
		
		
		obj.studentinfo("23456", "adhi");
	
		obj.studentinfo("Srinidhic",9994577896L);
		
	}

		
		

	}

//syso(id +""+name)
