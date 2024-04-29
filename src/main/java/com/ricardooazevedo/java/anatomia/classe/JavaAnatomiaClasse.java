/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ricardooazevedo.java.anatomia.classe;

/**
 *
 * @author ricar
 */
public class JavaAnatomiaClasse {

    //revisão sobre a sintaxe basica do java:
    public static void main(String[] args) {

        System.out.println("Ola turma, sejam bem-vindos!");

        //Exemplo de declaração de variaveis:
        String meuNome = "Ricardo";

        int anoFabricacao = 2024;

        boolean verdadeira = false;

    }

    //Exemplo de declaração de métodos:
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
