/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Manager {
   private String nom;
   private String prenom;
   private int anciennete;
   private String poste;

    public Manager(String nom, String prenom, int anciennete) {
        this.poste="manager";
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }
    
    public int getSalaire(){
        return (2200+anciennete*110);
    }
    
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
