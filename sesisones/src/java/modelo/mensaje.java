/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alejandro
 */
public class mensaje {
    String mens;
    String autor;

    public mensaje(String mens, String autor) {
        this.mens = mens;
        this.autor = autor;
    }

    public String getMens() {
        return mens;
    }

    public String getAutor() {
        return autor;
    }
    
    
}
