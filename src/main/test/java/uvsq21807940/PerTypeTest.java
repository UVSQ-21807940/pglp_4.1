package uvsq21807940;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;


public class PerTypeTest 
    
{
	private Personnel a,b; ;
	@Before
	public void init() {
	 a=new Personnel.PersonnelBuilder("SAID", "mohand", "prof")
	.dateNaissance(LocalDate.parse("1995-06-28" , DateTimeFormatter.ISO_DATE))
	.addNumeroTelephone(new NumTel("mobile","0758"))
	.addNumeroTelephone(new NumTel("fixe","0672"))
	.build();
	 
	 b=new Personnel.PersonnelBuilder("SAID", "mohand", "prof")
				.dateNaissance(LocalDate.parse("1995-06-28" , DateTimeFormatter.ISO_DATE))
				.addNumeroTelephone(new NumTel("mobile","0758"))
				.addNumeroTelephone(new NumTel("fixe","0672"))
				.build();
	 
	 
	}
	@Test
	public void test() {
	
		
		assertEquals(a.getNom(), "SAID");
		assertEquals(a.getPrenom(), "mohand");
		assertEquals(a.getFonction(), "prof");
		assertEquals(a.getDateNaissance(),LocalDate.parse("1995-06-28", DateTimeFormatter.ISO_DATE));
		
		


	
	a.getNumerosTelephone().equals(b.getNumerosTelephone());  
	

	
	
	

	

}
}
