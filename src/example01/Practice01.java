package example01;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1 = 5;
       int num2 = 7;
       double d_num1 = 2.4;
       double d_num2 = 3.5;
       System.out.println(num1);
       num1 = num2;
       System.out.println(num1);
       num2 = num1  + num2;
       System.out.println(num2);
       
       System.out.println("--------------");
       System.out.println(d_num1);
       d_num1 = 0.1;
       System.out.println(d_num1);
       d_num1 = d_num1 + d_num2;
       System.out.println("°á°ú : " +(d_num1 + d_num2));
       
	}

}
