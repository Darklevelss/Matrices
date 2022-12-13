package co.edu.uptc.presentacion;

import java.util.Scanner;

import co.edu.uptc.logica.control.Operaciones;

public class Consola {
	private Scanner sc;
	private Operaciones matrizGeneral;

	public Consola() {
		sc = new Scanner(System.in);
		matrizGeneral = new Operaciones();
	}

	public void menuConsola() {
		int opc = 1;
		while (opc != 0) {
			System.out.println("""
						Elija la Opción
						1.añadir matriz
						2.mostrar matriz
						0.salir

					""");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				int tam = 0;
				System.out.println("digite el tamaño de la matriz");
				tam = sc.nextInt();
				matrizGeneral.llenarMatriz(tam);
				break;
			case 2:
				mostrarMatriz();
				break;
			case 0:
				System.out.println("bye");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
		}
	}

	// date y local date diferencia de versiones
	public void mostrarMatriz() {
		for (int i = 0; i < matrizGeneral.retornarMatriz().length; i++) {
			for (var j = 0; j < matrizGeneral.retornarMatriz()[0].length; j++) {
				System.out.printf("%d\t", matrizGeneral.retornarMatriz()[i][j]);

			}
			System.out.println();
		}
	}
}
