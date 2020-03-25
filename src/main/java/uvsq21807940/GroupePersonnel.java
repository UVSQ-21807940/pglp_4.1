package uvsq21807940;


import java.util.ArrayList;
import java.util.List;

public class GroupePersonnel extends PerType{

List<PerType> people = new ArrayList<PerType>();
	
	public void print() {
		System.out.println("--------------");
		for(PerType composant: people) {
			composant.print();
		}
	}
	
	public void add(PerType composant) {
		people.add(composant);
	}
	
	public void remove(PerType composant) {
		people.remove(composant);
	}

	@Override
	public boolean isGroupe() {
		// TODO Auto-generated method stub
		return false;
	}
	

}