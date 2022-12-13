package co.edu.uptc.logica.control;

import java.util.Random;

public class Operaciones {
	private int[][] Matriz;

	public int[][] llenarMatriz(int tam) {
		Matriz = new int[tam][tam];
		for (int i = 0; i < Matriz.length; i++) {
			for (var j = 0; j < Matriz[0].length; j++) {
				if (i % 2 != 0) {
					Matriz[i][j] = new Random().nextInt(5);
					if (Matriz[i][j] == 0) {
						Matriz[i][j] = new Random().nextInt(10000) + 1001;
					}
				} else {
					Matriz[i][j] = new Random().nextInt(100) + 21;
				}

			}
		}
		return Matriz.clone();
	}

//que todos los numeros de las filas  pares tengan valores mayores a 20 y los impares menores a 5, si se genra 0 mayor a mil
	public int[][] retornarMatriz() {
		return Matriz;
	}

}
