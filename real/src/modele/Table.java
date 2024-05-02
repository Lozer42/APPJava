/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author y.hamri1
 */
public class Table {
    private int id;
    private int capacite;
    
    public Table(int id, int capacite) {
        this.id = id;
        this.capacite = capacite;
    }
    
    public int getCapacite() {
        return this.capacite;
    }
}
