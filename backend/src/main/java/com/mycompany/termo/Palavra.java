/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.termo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Luciano
 */
public class Palavra {
    
    private String palavraCerta = "";
    private String palavraErrada = "";
    private List<Letra> palavra = new ArrayList<>();
    
    Palavra(String pCerta, String pErrada) {
        this.palavraCerta = pCerta;
        this.palavraErrada = pErrada;
        adicionaLetra();
        testaLetras();
    }
    
    public final void adicionaLetra() {
        for(int i = 0; i < this.palavraErrada.length(); i++) {
            Letra l = new Letra(Character.toString(palavraErrada.charAt(i)));
            this.palavra.add(l);
        }
    }
    
    public void setPalavra(String texto) {
        this.palavraErrada = texto;
    }
    
    public List<Letra> getPalavra(){
        return palavra;
    }
    
    public final void testaLetras(){
        int i = 0;
        for(Letra letra: this.palavra){
            for(i = 0; i < palavraCerta.length(); i++){
                letra.temNaPalavra(letra.toString().equals(Character.toString(palavraCerta.charAt(i))));
                i++;
            }
        }
        
        i = 0;
        for(Letra letra: this.palavra){
            letra.lugarCerto(letra.getLetra().equals(Character.toString(palavraCerta.charAt(i))));
            i++;
        }
    }
    
    public void corPreta(){
        String letras = "";
        for(Letra letra: this.palavra){
            if(!letra.getTemNaPalavra()){
                letras += letra;
            }
        }
        System.out.println("Cor preta: " + letras);
    }
    
    public void corLaranja(){
        String letras = "";
        for(Letra letra: this.palavra){
            if(letra.getTemNaPalavra()){
                if (!letra.getlugarCorreto()) {
                    letras += letra;
                }
            }
        }
        System.out.println("Cor laranja: " + letras);
    }
    
    public void corVerde(){
        String letras = "";
        for(Letra letra: this.palavra){
            if(letra.getTemNaPalavra()){
                if (letra.getlugarCorreto()) {
                    letras += letra;
                }
            }
        }
        System.out.println("Cor verde: " + letras);
    }
    
    public boolean acertouPalavra() {
        return this.palavra.stream().allMatch(letra -> letra.getlugarCorreto());
    }
}
