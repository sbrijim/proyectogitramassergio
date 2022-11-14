import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		parEimpar(num); //Muestra si es par o impar
		suma(num); //Muestra la suma del numero +5
		mostrarNum(num); //Muestra los 5 siguientes numeros
	}
	public static void parEimpar(int num) {
	if (num % 2==0) {
		System.out.println("Es par");
		}
	else {
		System.out.println("Es impar");
		}
	}
	public static void suma(int num) {
			System.out.println("La suma es:"+(num+5));
			}
	
	public static void mostrarNum(int num) {
	while(num <= 10){  
		System.out.println("Soy el " + num);  
		num ++; 
		}
	}
}

