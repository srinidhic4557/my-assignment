package week3.day1assignment;


public class Automation extends MultipleLangauge implements Language,TestTool {


		

		
	
	@Override
	public void Java() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void python() {
		System.out.println("python");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
	Automation obj=new Automation()	;
	obj.Java();
	obj.python();
	obj.Selenium();
	obj.ruby();
	
	}
}
