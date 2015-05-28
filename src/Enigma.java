/*****************************************
 * Enigma Clase principal.
 *******************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Enigma {

	//Atributos principales e inicialización del mismo.
	static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
    
    
	public static void main(String[] args) {
		
		//Instanciamos el objeto de la clase Cifrado.
		Cifrado cf = new Cifrado();
		
		try { 
	        String texto = ""; 
	        int n = 0; 
	        System.out.println("-....................PROCESO DE CIFRADO CESAR .....................-");
	        System.out.print("Indique el texto a cifrar en mayúsuclas: "); 
	        texto = bf.readLine(); 
	        System.out.print("Indique el número para el desplazamiento (numero entero): "); 
	        n = Integer.parseInt(bf.readLine()); 
	       System.out.println("-.....................EL RESULTADO ES..............................-");
	        System.out.println("Texto ha cifrar: "+texto); 
	        System.out.println("Texto cifrado: "+ cf.CifradoCesar(abecedario, texto,n)); 
	        } catch (Exception e) { 
	            System.out.print("Valor no valido."); 
	        } 
	}

}
