package example01;

import javax.swing.JOptionPane;

public class Dialog01 {

	public static void main(String[] args) {
    
		String input1 = JOptionPane.showInputDialog("���� ���� : ");
		String input2 = JOptionPane.showInputDialog("���� ���� : "); 
		String input3 = JOptionPane.showInputDialog("���� ���� : "); 
		String input4 = JOptionPane.showInputDialog("��ȸ ���� : "); 
		String input5 = JOptionPane.showInputDialog("���� ���� : "); 
		
		//double�� ��ȯ
		double a = Integer.parseInt(input1);
		double b = Integer.parseInt(input2);
		double c = Integer.parseInt(input3);
		double d = Integer.parseInt(input4);
		double e = Integer.parseInt(input5);
		
		System.out.println("--------------------");
		double f = a+b+c+d+e;
		System.out.println("5 ������ �հԴ� : "+f+ "�Դϴ�.");
		System.out.println("5 ������ ����� : "+(double)f/5);
		
	}

}
