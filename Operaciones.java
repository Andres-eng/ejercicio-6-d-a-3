public class Operaciones{
	private int num1;
	private int num2;

	public Operaciones(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void setNum1(float num1){
		num1=num1;
	}
	public int getNum1(){
		return num2;
	}
	public void setNum2(float num1){
		num2=num2;
	}
	public int getNum2(){
		return num2;
	}
	
	public void Oper(){
	int suma, resta, mul, divi;
	
	suma=num1+num2;
	resta=num1-num2;
	mul=num1*num2;
	divi=num1/num2;
	System.out.printf("La suma es:" + suma);
	System.out.printf("La resta es:" + resta);
	System.out.printf("La multiplicacion es:" + mul);
	System.out.printf("La divicion es:" +divi);
	}
}