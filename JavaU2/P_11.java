//9- Valoración de edad.

 java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner Ed = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		int ed = Ed.nextInt();
		
		if (ed >= 18 && ed <= 99)
		{
		    System.out.println("Eres mayor de edad.");
		}else if(ed < 18)
		{
		    System.out.println("Eres menor de edad.");
		}else 
		{
		    System.out.println("¿Es una broma?. \nIngresa una edad valida.");
		} 
  }
}
