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
public class Inventory {
    private ArrayList<Ingredient> ingredients;
    public Inventory() {
        this.ingredients = new ArrayList<Ingredient>();
    }
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }
    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
