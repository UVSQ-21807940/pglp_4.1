package uvsq21807940;

public abstract class PerType {

abstract public boolean isGroupe();
	
	public String typeString() {
		return (isGroupe() ? "Groupe" : "Personnel");
	}

	protected abstract void print();
	

}
