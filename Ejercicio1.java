import java.util.Scanner;
/**
* @author Luis Miguel Bernabé
* @version 3.0
*/
public class Ejercicio1 {
    /**
	* @param num Valor entero para el que se realiza la suma de sus digitos
	* @return devuelve un entero
	*/
	public static int sumaDig(int num) {
	
	   if (num<=9)
	    	return num;
		
	   else return (num%10)+sumaDig(num/10);
}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un nº positivo:");
		
		int num=sc.nextInt();
		
		System.out.println("Con recursividad: "+sumaDig(num));
		
		
   }

}
