package uvsq21807940;


import java.util.ArrayList;

public class AffichageGr {
    private ArrayList list;
    
   public void afficheGroupe() {
	   
   }
	
	private class GroupIterator implements Iterator{
        
		public GroupIterator() {
			int verif=0;
			while(verif<list.size()){
				if (list.get(verif) instanceof GroupePersonnel) {
					
					for( PerType pers: ((GroupePersonnel)list.get(verif)).people )
					list.add(pers);
				}
			}
		}
		private int index;
		public boolean hasNext() {
			
			if(index<list.size()) {
				return true;
			}
			// TODO Auto-generated method stub
			return false;
		}

		public GroupePersonnel next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public Iterator getIterator() {
		return new GroupIterator();
		
	}

}