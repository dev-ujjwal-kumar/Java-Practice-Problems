package Java.siemens;

class newTest{    
	public void m1(int i){  
			  System.out.println("int arg " + i);  //1
	}  
	public void m1(float i){  
			  System.out.println("float arg " + i);  //2
	}  
} 

class additionaTest extends newTest{
	
	@Override
	public void m1(int i){
		System.out.println("This is additional newTest class");
	}
}
class test1{

	public static void main (String[] args) {  
		newTest t = new newTest();
		// additionaTest ai = new newTest(); //error
		// ai.m1(10);
		newTest t1 = new additionaTest();
        t1.m1(10);  //This is additional newTest class

		t.m1(10);	//	1
		t.m1(10.5f);	//2
		t.m1('a');	//	error
		t.m1(10L);	//	error
		// t.m1(10.5);	//	2
	}
}


