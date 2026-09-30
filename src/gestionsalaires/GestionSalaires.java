/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tests applicatifs

		// Ajout d'un language pour tester

        Developpeur d = new Developpeur("Durand", "Michel", 4,"python");
        Manager m = new Manager("Dupont", "Lucie", 2);

		//Ajout d'un developpeur expert pour tester.

		DeveloppeurExpert de = new DeveloppeurExpert("Blemand","Yanis",50,"php");

        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
		System.out.println(de.getDescription());



    }

}
