package week3.day2assign;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="MADAM";
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);}
if(rev.equals(str)) {
	System.out.println("palindrome");}
	else {
		System.out.println("not palindrome");
}
	}

}
