/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellitout;

/**
 *
 * @author rena7
 */
public class SpellItOut {

    public static final String[] unidades = { "", "um", "dois", "três", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
			"treze", "quatorze", "quinze", "dezasseis", "dezassete",
			"dezoito", "dezanove" };

    public static final String[] dezenas = { 
			"", 		// 0
			"",		// 1
			"vinte", 	// 2
			"trinta", 	// 3
			"quarenta", 	// 4
			"cinquenta", 	// 5
			"sessenta", 	// 6
			"setenta",	// 7
			"oitenta", 	// 8
			"noventa" 	// 9
    };
    
    public static final String[] centenas = { 
			"", 		// 0
			"cento",	// 1
			"duzentos", 	// 2
			"trezentos", 	// 3
			"quatrocentos", // 4
			"quinhentos", 	// 5
			"seiscentos", 	// 6
			"setecentos",	// 7
			"oitocentos", 	// 8
			"novecentos" 	// 9
    };
    
    public static String converter(int n){
        if (n < 0) {
            return "menos " + converter(-n);
	}
        
        if (n < 20) {
            return unidades[n];
	}
        
        if (n < 100) { //falta validar o nr 100
            return dezenas[n / 10] + " e " + unidades[n % 10];
        }
        
        if (n < 1000) {
            return centenas[n / 100] + " e " + converter(n % 100);
	}
        
        if (n < 1000000) { //falta validar todos os nrs 1000
            return converter(n / 1000) + " mil e " + converter(n % 1000);
	}
        
        return "nada";
    }
    
    public static void main(String[] args) {
        
        int n;
	n = 972333;
	System.out.println(converter(n) + "");
    }
    
}
