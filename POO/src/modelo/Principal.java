package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int op=0;

		do {

			System.out.println("Ingrese el valor del lado");
			float lado=entrada.nextFloat();
			if (lado>0) {
				Cubo objetos=new Cubo(lado);

				do {
					//menu principal
					System.out.println("Menu Calculos \n 1.-Calcular Area \n 2.-Calcular Perimetro \n 3.-Calcular Volumen \n 4.-Canselar \n 5.-Salir \n Valor del Lado :"+lado);
					op=entrada.nextInt();
					int ops=0;

					switch (op) {
					case 1:
						do {// son lo menus dos pero antes se hace la accion
							System.out.println("La area del cubo es: "+objetos.calcularArea());
							System.out.println("Menu Opcion\n 1.-Menu Calculos  \n 2.-Salir al Inicio \n Valor del Lado :"+lado);
							ops=entrada.nextInt();
						} while ((ops==1||ops==2)==false);

						break;
					case 2:
						do {// lo mismo que el 1
							System.out.println("El perimetro del cubo es: "+objetos.calcularPerimetro());
							System.out.println("Menu Opcion\n 1.-Menu Calculos  \n 2.-Salir al Inicio \n Valor del Lado :"+lado);
							ops=entrada.nextInt();
						} while ((ops==1||ops==2)==false);
						break;
					case 3:
						do {// lo mismo que el 1
							System.out.println("El volumen del cubo es: "+objetos.calcularVolumen());
							System.out.println("Menu Opcion\n 1.-Menu Calculos  \n 2.-Salir al Inicio \n Valor del Lado :"+lado);
							ops=entrada.nextInt();
						} while ((ops==1||ops==2)==false);

						break;
					default:
						break;
					}
					if (ops==2) {/// si en el menu dos se quiere cambiar el balor es como si fuera la op 4 asi que cambiamos op
						op=4;
					}
				} while (op!=4);
			}
		} while (op!=5);

	}

}
