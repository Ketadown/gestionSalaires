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
		super(nom,prenom,anciennete,"Developpeur");

		this.language=language;
	}

	@Override
	public double getSalaire(){

		int prime =0;
		double multiplicateur = 1;

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

		return((1900+anciennete*100+prime));
	}

	@Override
	public String getDescription() {

		if (this.language != "" || !this.language.isEmpty()) {
			return super.getDescription() + " (Langage acquis : " + this.language + ")";
		}
		return super.getDescription();
	}

}
