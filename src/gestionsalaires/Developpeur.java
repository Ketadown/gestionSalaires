/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur {
   private String nom;
   private String prenom;
   private int anciennete;
   private String poste;

    public Developpeur(String nom, String prenom, int anciennete) {
        this.poste="developpeur";
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }
    
    public int getSalaire(){
        return (1900+anciennete*100);
    }
    
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
   
   
}
