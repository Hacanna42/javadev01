package example01;

import javax.swing.JOptionPane;

public class Dialog01 {

	public static void main(String[] args) {
    
		String input1 = JOptionPane.showInputDialog("국어 점수 : ");
		String input2 = JOptionPane.showInputDialog("수학 점수 : "); 
		String input3 = JOptionPane.showInputDialog("영어 점수 : "); 
		String input4 = JOptionPane.showInputDialog("사회 점수 : "); 
		String input5 = JOptionPane.showInputDialog("과학 점수 : "); 
		
		//double형 변환
		double a = Integer.parseInt(input1);
		double b = Integer.parseInt(input2);
		double c = Integer.parseInt(input3);
		double d = Integer.parseInt(input4);
		double e = Integer.parseInt(input5);
		
		System.out.println("--------------------");
		double f = a+b+c+d+e;
		System.out.println("5 과목의 합게는 : "+f+ "입니다.");
		System.out.println("5 과목의 평균은 : "+(double)f/5);
		
	}

}
