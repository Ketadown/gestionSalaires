/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {

	protected String language;

	public Developpeur(String nom, String prenom, int anciennete,String language) {
		super(nom,prenom,anciennete,"Développeur");

		this.language=language;
	}

	@Override
	public int getSalaire(){

		int prime =0;

		switch (this.language.toLowerCase().trim()) {
			case "java" :
				prime = 50;
				break;

			case "python" :
				prime = 70;
				break;

			case "php" :
				prime = 45;
				break;
		}
		return(1900+anciennete*100+prime);
	}

}
