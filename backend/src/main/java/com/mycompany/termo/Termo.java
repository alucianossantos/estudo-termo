/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.termo;

import java.util.Scanner;

/**
 *
 * @author Alex Luciano
 */
public class Termo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        BancoDePalavras bp = new BancoDePalavras();
        
        String p = bp.geraPalavra();
        boolean acertou = false;
        for(int i = 0; !acertou; i++) {
            System.out.print("Digite uma palavra: ");
            String texto = sc.nextLine().toUpperCase();

            Palavra palavra = new Palavra(p, texto);

            for(Letra l: palavra.getPalavra()){
                System.out.print(l);
            }

            System.out.println("");
            palavra.corPreta();
            System.out.println("");
            palavra.corLaranja();
            System.out.println("");
            palavra.corVerde();

            acertou = (palavra.acertouPalavra()) || (i >= 5);
        }
    }
}
