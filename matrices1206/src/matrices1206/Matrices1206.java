
package matrices1206;

public class Matrices1206 {

    public static void main(String[] args) {
       // crear matriz
       String estaciones [][] = new String[2][2];
       // cargar datos a mi matriz
       estaciones [0][0] = "Otoño";
       estaciones [0][1] = "Verano";
       estaciones [1][0] = "Primavera";
       estaciones [1][1]= "Invierno";
       //imprimir matriz
       System.out.println("Estacion en la posición (0,0) =  " + estaciones [0][0]);
       System.out.println("Estacion en la posición (0,1) =  " + estaciones [0][1]);
       System.out.println("Estacion en la posición (1,0) =  " + estaciones [1][0]);
       System.out.println("Estacion en la posición (1,1) =  " + estaciones [1][1]);
        
    }
    
}
