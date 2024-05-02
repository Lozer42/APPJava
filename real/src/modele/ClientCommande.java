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
public class ClientCommande {
    private Table table;
    private ArrayList<MenuPlats> platsApreparer;
    
    public ClientCommande(Table table, ArrayList<MenuPlats> platsCommandes) {
        this.table = table;
        this.platsApreparer = platsCommandes;
    }
    
    public Table getTable() {
        return this.table;
    }
    public ArrayList<MenuPlats> getPlatsApreparer() {
        return this.platsApreparer;
    }
}
