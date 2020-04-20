import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter num to convert :");
		no=sc.nextInt();
		String binarystr=Integer.toBinaryString(no);
		System.out.println("\n Binary value of "+ no +" is "+binarystr);
	}

}
