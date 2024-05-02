/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
/**
 *
 * @author y.hamri1
 */
public class Menu {
    private ArrayList<MenuPlats> items;
    // Constructeur
    public Menu() {
        this.items = new ArrayList<MenuPlats>();
    }
    // Methodes
    public void addPlat(MenuPlats item) {
        this.items.add(item);
    }
    public void removePlat(MenuPlats item) {
        this.items.remove(item);
    }
    public void setPrixPlat(MenuPlats plat, double newPrix) {
        if (this.items.contains(plat)) {
            plat.setPrix(newPrix);
        } else {
            
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        if (this.items.isEmpty()) {
            result +="Aucun menu n'est proposé à la carte.";
        } else {
            for (MenuPlats mp : this.items) {
                result += ("\n"+ mp.getPlat() +" - "+ mp.getPrix());
            }
        } return result;
    }
    public static void main(String[] args) {
        MenuPlats kebab = new MenuPlats("kebab",12.5);
        MenuPlats pizza = new MenuPlats("pizza",10);
        MenuPlats felfel = new MenuPlats("felfel",4);
        Menu menu = new Menu();
        
        menu.addPlat(kebab);
        System.out.println(menu);
        
        menu.addPlat(pizza);
        menu.addPlat(felfel);
        System.out.println(menu);
        
        menu.setPrixPlat(felfel,5);
        System.out.println(menu);
    }
}
