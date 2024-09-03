/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.termo;

/**
 *
 * @author Alex Luciano
 */
public class Letra {
    
    private String letra = "";
    private boolean temNaPalavra = false;
    private boolean lugarCorreto = false;
    
    Letra(String letra) {
        this.letra = letra;
    }
    
    public String getLetra() {
        return this.letra;
    }
    
    public boolean getTemNaPalavra() {
        return this.temNaPalavra;
    }

    public boolean getlugarCorreto() {
        return this.lugarCorreto;
    }
    
    public void temNaPalavra(boolean tem) {
        this.temNaPalavra = tem;
    }
    
    public void lugarCerto(boolean lugar) {
        this.lugarCorreto = lugar;
    }
    
    @Override
    public String toString(){
        return this.letra;
    }
}
