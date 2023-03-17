/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class lista {
    
    ArrayList<usuario> milista=new ArrayList<usuario>();

    public lista() {
        this.milista.add(new usuario("juan","1234",0));
        this.milista.add(new usuario("ana","abc",0));
        this.milista.add(new usuario("admin","admin",1));
        
    }

    public ArrayList<usuario> getMilista() {
        return milista;
    }
    
    
    
}
