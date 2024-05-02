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
public class Cuisine {
    // liste commandes en cours de preparation
     private ArrayList<ClientCommande> commandeEnCours;
     // stock d'ingredients
     private Inventory inventaire;
     
     public Cuisine(Inventory inventaire) {
         this.inventaire = inventaire;
         this.commandeEnCours = new ArrayList<ClientCommande>();
     }
     
    public void commandeEnPreparation(ClientCommande commande) {
        this.commandeEnCours.add(commande);
    }
    public  Inventory updateInventory(MenuPlats plat, Integer quantite) {
      return null;  
    }
}
