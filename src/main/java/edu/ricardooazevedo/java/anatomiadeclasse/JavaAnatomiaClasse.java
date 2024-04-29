
package edu.ricardooazevedo.java.anatomiadeclasse;

/**
 *
 * @author ricar
 */
public class JavaAnatomiaClasse {

    //revisão sobre a sintaxe basica do java:
    public static void main(String[] args) {
        //Exemplo de uso:
        
        String primeiroNome = "Ricardo";
        
        String segundoNome = "Azevedo";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);

    }

    
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
