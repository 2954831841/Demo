import java.util.Scanner;
public class ChenLiang {
	public static void main(String[] args) {
		for(int i=1;true;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("��ѡ����˻������");
		System.out.println("������1��������2");
		System.out.println("����3  �˳�");
		double c=sc.nextDouble();		
		if(c==1) {
		Zhen A=new Zhen();
		A.jsj();
		}
		if(c==2) {
			Chen A=new Chen();
			A.jsj();
	}
		if(c==3) {break;}
		}
	}
}
