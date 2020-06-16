
package buscarnombreenunvector;
import java.util.Scanner;
public class Buscarnombreenunvector {
    public static void main(String[] args) {
     String nom;
     Scanner leer = new Scanner(System.in);
     String [] nombre = {"juan","pedro","pablo","jose"};
     
     System.out.print("Ingrese un Nombre  :  ");
     nom = leer.next();
     
     for(int n=0;n<nombre.length;n++){
         if(nom.equals(nombre[n])){
             System.out.println("Datos encontrados");
         }else{
             System.out.println("No se encontro el dato");
         }break;
         
     
     }
                  
        
    }
    
}
