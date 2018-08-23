package example01;

import javax.swing.JOptionPane;

public class PracticeIF {

	public static void main(String[] args) {

     int A =Integer.parseInt(JOptionPane.showInputDialog("정수 1 입력"));
     int B =Integer.parseInt(JOptionPane.showInputDialog("정수 2 입력"));
     int C =Integer.parseInt(JOptionPane.showInputDialog("정수 3 입력"));
     int A1 = A;
     int B1 = B;
     int C1 = C;
     int D = 0;
     if (A>0 && B>0 && C>0){
    	 D = 1;
     }
     if (D==1) {
    	A = A%2;
    	B = B%2;
    	C = C%2;
    	if (A==0){
       	 System.out.println(A1);
        }
        if (B==0){
       	 System.out.println(B1);
        }
        if (C==0){
       	 System.out.println(C1);
        }
        
     }else {
    	 System.out.println("잘못된 값입니다.");
     }
     
     
     
     }
} 