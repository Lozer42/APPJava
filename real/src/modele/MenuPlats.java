/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import javax.swing.JTextField;

/**
 *
 * @author y.hamri1
 */
public class MenuPlats {
    private String nomPlat;
    private double prix;
    
    public MenuPlats(String plat, double prix) {
        this.nomPlat = plat;
        this.prix = prix;
    }
    
    public String getPlat() {
        return nomPlat;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double newPrix) {
        this.prix = newPrix;
    }
    
    @Override
    public String toString() {
        return this.getPlat() +" - "+ this.getPrix() ;
    }
    public static void main(String[] args) {
        MenuPlats kebab = new MenuPlats("kebab",12.5);
        System.out.println(kebab);
        kebab.setPrix(7.88);
        System.out.println(kebab);
    }
}
