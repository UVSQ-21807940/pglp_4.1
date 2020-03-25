package uvsq21807940;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Personnel a=new Personnel
				.PersonnelBuilder("hadj", "mohand", "prof")
				.dateNaissance(LocalDate.parse("1995-06-28" , DateTimeFormatter.ISO_DATE))
				
				.addNumeroTelephone(new NumTel("fixe","0667766777"))
				.build();
    	
    	System.out.println(a.getNumerosTelephone().equals(a.getNumerosTelephone()));
    	System.out.println(a.getNumerosTelephone().getClass());
       
       
    		   
    }
}