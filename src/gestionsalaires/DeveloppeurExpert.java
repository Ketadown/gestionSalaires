package gestionsalaires;

public class DeveloppeurExpert extends Developpeur {

	public DeveloppeurExpert(String nom, String prenom, int anciennete, String language) {
		super(nom,prenom,anciennete,language);
	}

	@Override
	public double getSalaire() {
		double salaire = super.getSalaire();
		salaire = salaire * 1.1;

		return salaire;
	}
}
