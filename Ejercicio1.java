import java.util.Scanner;

public class Ejercicio1 {

	public static int sumaDig(int num) {
		
	   return (num%10)+sumaDig(num/10);
}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println(sumaDig(num));
		
		
   }

}
