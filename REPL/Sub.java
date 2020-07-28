package REPL;

public class Sub {

	public int sub( int num1,int num2,int num3,int num4) {
		return num1-num2-num3-num4;
		
	}
	
	public int sub( int num1,int num2,int num3) {
		return num1-num2-num3;
	}
	
	public int sub( int num1,int num2) {
		return num1-num2;
	}
	
	

	public static void main(String[] args) {
	
 Sub nums=new Sub();
 System.out.println(nums.sub(100,20,20,20));
 System.out.println(nums.sub(100, 20, 50));
 System.out.println(nums.sub(100, 80));
}
}