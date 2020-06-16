
package matrizalfabeto;

public class Matrizalfabeto {

   
    public static void main(String[] args) {
         int filas = 10;
         int columnas = 50;
         char letras[][] = new char [filas][columnas];
         char letrasquetoca = 'A';
         
         //cargar la matriz de letras
         for (int f=0;f<filas;f++){
             for(int c=0;c<columnas;c++){
                 letras[f][c] = letrasquetoca;
                 letrasquetoca ++;
                 
                        
             }
         }
         //Imprimir la matriz
         for(int f =0; f<filas ;f++){
             for(int c=0;c<columnas;c++){
                 System.out.print(letras[f][c] + " ");
             }
                 System.out.println();
                        
         
         }
         
         
             
             
         
         }
         
        
        
        
        
        
    }
    
}
