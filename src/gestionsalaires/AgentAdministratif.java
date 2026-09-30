package gestionsalaires;

public class AgentAdministratif extends Employe{

	public AgentAdministratif(String nom, String prenom, int anciennete){
		super(nom,prenom,anciennete,"Agent Administratif");
	}

	@Override
	public double getSalaire(){
		return(1900);
	}
}
