package week3.day1assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		for(int i=0; i<=split.length ; i++) {
			String word=split[i];
			
			if(i%2==0) {
				for(int j=word.length()-1; j>=0;j--) {
					
					char charAt=word.charAt(j);
					
					System.out.println(word.charAt(j));}
					
				}
				else {
					System.out.println(split[i] +" ");
					
				}
				}
			}
		}

