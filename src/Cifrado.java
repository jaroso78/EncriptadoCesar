/*****************************************************************************
 * 
 * @author JAVIER RODRIGUEZ SOLER.
 * Clase Cifrado.
 *****************************************************************************/

public class Cifrado {

	  
	/***************************************************************************
	 * CifradoCesar 
	 * @param abecedario -> String con el abecedario original.
	 * @param entrada  -> String con el texto a desplazar.
	 * @param desp -> int con el n�mero de desplazamiento.
	 * @return String con el texto cifrado.
	 *****************************************************************************/
	public String CifradoCesar (String abecedario, String entrada,int desp){ 
        String salida = ""; 
        //Bucle recorriendo la entrada que se le pasa a partir del tama�o del array de string.
        for(int i = 0;i<entrada.length();i++){ 
        	//Si  no es un espacio
            if(abecedario.indexOf(entrada.charAt(i)) != -1) 
            	//A�adimos al string el caracter 
            	//Recorremos el string del abecedario sumada mas el desplazamiento y dividido por el resto del tama�o del abecedario.
                salida += abecedario.charAt(( abecedario.indexOf(entrada.charAt(i)) +desp)%abecedario.length()); 
            else 
            	//Indicamos el espacio en blanco.
                salida += entrada.charAt(i); 
        } 
        return salida; 
    } 
}
