import java.util.Scanner;
public class ChenLiang {
	public static void main(String[] args) {
		for(int i=1;true;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("请选择相乘还是相加");
		System.out.println("乘输入1，加输入2");
		System.out.println("输入3  退出");
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
