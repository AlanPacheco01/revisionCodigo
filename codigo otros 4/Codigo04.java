package com.generation;
//se importa el scanner para leer valores de entrada
import java.util.Scanner;

public class Codigo04 {
	//Se agrega método main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();
        
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                	//se implementa método equals para el comparativo de strings
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                    // se agrega "s" en tijera
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    System.out.println("Entrada no válida.");
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
