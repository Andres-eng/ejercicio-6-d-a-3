import java.util.Scanner;

	public class Ingreso{
	public static void main(String []args){
		int num1,num2;
	Scanner lee =new Scanner(System.in);
	
	System.out.printf("Ingrese el primer numero: ");
	num1=lee.nextInt();
	System.out.printf("Ingrese el segundo numero: ");
	num2=lee.nextInt();
	
	
Operaciones obj=new Operaciones(num1 , num2);
obj.Oper();
	}
}