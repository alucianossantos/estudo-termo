/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.termo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alex Luciano
 */
public final class BancoDePalavras {
    
    private static ArrayList<String> bancoPalavras = new ArrayList<>();
    
    BancoDePalavras() {
        adicionaPalavras();
        System.out.println("Palavras adicionadas!");
    }
    
    public void adicionaPalavras() {
        bancoPalavras.add("UTFPR");
        bancoPalavras.add("CURSO");
        bancoPalavras.add("AULAS");
        bancoPalavras.add("NOTAS");
        bancoPalavras.add("ALUNO");
        bancoPalavras.add("TESES");
        bancoPalavras.add("LIVRO");
        bancoPalavras.add("EXAME");
        bancoPalavras.add("TURMA");
        bancoPalavras.add("SALAS");
        bancoPalavras.add("PROVA");
        bancoPalavras.add("BOLSA");
        bancoPalavras.add("PAUTA");
        bancoPalavras.add("GRUPO");
        bancoPalavras.add("GRADE");
        bancoPalavras.add("TEXTO");
        bancoPalavras.add("LINUX");
        bancoPalavras.add("PIXEL");
        bancoPalavras.add("TELAS");
        bancoPalavras.add("NUVEM");
        bancoPalavras.add("ROBOT");
        bancoPalavras.add("INPUT");
        bancoPalavras.add("DRIVE");
        bancoPalavras.add("CLOUD");
        bancoPalavras.add("BYTES");
        bancoPalavras.add("SENHA");
        bancoPalavras.add("LOGIN");
        bancoPalavras.add("CACHE");
        bancoPalavras.add("PLUGS");
        bancoPalavras.add("PATCH");
        bancoPalavras.add("PIXEL");
        bancoPalavras.add("ÁUDIO");
        bancoPalavras.add("FONTE");
        bancoPalavras.add("CHIPS");
        bancoPalavras.add("FRAME");
        bancoPalavras.add("MICRO");
        bancoPalavras.add("INDEX");
        bancoPalavras.add("CIVIL");
        bancoPalavras.add("TURBO");
        bancoPalavras.add("MOTOR");
        bancoPalavras.add("FORÇA");
        bancoPalavras.add("SOLDA");
        bancoPalavras.add("TORRE");
        bancoPalavras.add("FIBRA");
        bancoPalavras.add("PONTE");
        bancoPalavras.add("CURVA");
        bancoPalavras.add("PESOS");
        bancoPalavras.add("TESTE");
        
        for(String palavra: bancoPalavras) {
            System.out.println("('" + palavra + "'),");
        }
    }
    
    public String geraPalavra() {
        Random random = new Random();
        int index = random.nextInt(bancoPalavras.size());
        String palavraAleatoria = bancoPalavras.get(index);
        return palavraAleatoria;
    }
}
