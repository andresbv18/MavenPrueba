package prueba.cuarta.unidad;

import java.util.Scanner;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion3 = 0 ;
		do {
			int numero;
			String clave;
			Scanner entrada = new Scanner(System.in);

			System.out.print("Ingrese Clave de usuario: ");
			clave = entrada.nextLine();
			if (clave.equals("85DB")) {
				System.out.println("Bienvenido al Sistema");

				int opcion = 0;
				do {

					final int saldo_inicial = 2500;
					int opcion1;
					double ingreso, saldoActual = 0, retiro, saldo = 0;
					Scanner entrada1 = new Scanner(System.in);
					System.out.println(" Banco del Pichicaha:\nseleccione una opcion:\n");
					System.out.println("1. consultar pagos");
					System.out.println("2.realizar tranferencia");
					System.out.println("3.Salir\n");

					System.out.print("Ingresar un numero\n*");
					opcion1 = entrada1.nextInt();
					switch (opcion1) {
					case 1:
						System.out.print("no tiene pagos pendientes_");
						break;
					case 2:
						System.out.print("Digite la cantidad que desea tranferir:_ ");
						retiro = entrada1.nextDouble();
						if (retiro <= saldo_inicial) {
							saldoActual = saldo_inicial - retiro;
							System.out.println("Dinero en cuenta:_ " + saldoActual);
						}
						break;
					}

				} while (opcion != 3);
				break;

			}

			else {
				System.out.println("Nombre de Usuario o contraseña Incorrecto");

			}

		} while (opcion3 != -1);

	}
}
