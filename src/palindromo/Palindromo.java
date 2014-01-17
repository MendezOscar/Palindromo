
package palindromo;
import java.util.Scanner;

public class Palindromo {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int tamaño = 0;
  
     System.out.print("Ingrese la cantidad de caracteres");
     tamaño = sc.nextInt();
     
     char caracter[] = new char[tamaño];
       
     for (int i = 0; i < tamaño; i++){
         System.out.print(": ");
         caracter[i] = sc.next().charAt(0);                
     }
     
     boolean pali = true;
     int fin = tamaño -1;
             
     for (int inicio = 0; inicio < fin; inicio++){
         if (caracter[inicio] != caracter[fin]){
             pali = false;
             break;
         }
         fin--;         
     }
     if (pali){
         System.out.println("Palindromo");
     }
         else {
         System.out.println("No es Palindromo");
     }
     }
    }

