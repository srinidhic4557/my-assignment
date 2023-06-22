package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num=34343;
	 int temp=num;
	 int reverse=0;
	 
	for (num=34343;num>0;num=num/10) {
	reverse=(reverse*10)+(num%10);
	
		
	}
				
	if(temp==reverse) {
		
		System.out.println(" the given number is palindrome");}
	
		
		else {
			System.out.println("the given number is not palindrome");
	}
	}

}
