package secuenciaescape;

public class SecuenciaDeEscape {

	public static void main(String[] args) {
		// miguelRamos camel case lower camel case
		// MiguelRamos camel case upper camel case
		// \
		
		// Secuencia de Escape
		// \n para dar un salto de linea
		System.out.println("Pagina: \nhttps://santander.cl");
		/*
		 * Imprime 
		 * Pagina:
		 * https://santander.cl
		 * */
		
		// Para tabular se utiliza \t
		System.out.println("Pagina:\t\thttps://santander.cl");
		/*
		 * Imprime
		 * Pagina:		https://santander.cl
		 * */
		
		// para imprimir una diagonal inversa se utiliza \\
		System.out.println("Pagina:\\https://santander.cl\\ ");
		/*
		 * Imprime
		 * Pagina: \https://santander.cl\
		 */
		
		// Para imprimir comillas dobles se utiliza \"
		System.out.println("Pagina:\"https://santander.cl\"");
		// Para imprimir comillas dobles se utiliza \'
		System.out.println("Pagina:\'https://santander.cl\'");
		
		System.out.println("Retorno de carro");
		//  \r para un retorno de carro
		System.out.println("Pagina:\rhttps://santander.cl");
		
		// \b para borrar un caracter
		System.out.println("\bPagina:\b\b\b\bhttps://santander.cl");
		/*
		 * Imprime
		 * Pag https://santander.cl
		 */

	}

}
