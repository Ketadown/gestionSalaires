package gestionsalaires;

import java.util.ArrayList;

public class Service {

	private String titre;
	private ArrayList<Employe> ListeEmployes = new ArrayList<Employe>();

	public Service(String titre){
		this.titre=titre;
	}

	public void ajouterEmploye(Employe emp){
		ListeEmployes.add(emp);
	}

	public void afficherDescription(){
		for(Employe employe : ListeEmployes){
			System.out.println(employe.getDescription());
		}
	}

	public double salaireTotal(){

		double salaireTotal = 0;

		for(Employe employe : ListeEmployes){
			salaireTotal += employe.getSalaire();
		}

		return salaireTotal;
	}
}
