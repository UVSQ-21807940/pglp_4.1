package uvsq21807940;

public class NumTel {

	private String nomtel ;
	private String numero ;
	public NumTel(String nomtel, String numero) {
		super();
		this.nomtel = nomtel;
		this.numero = numero;
	}
	public String getNomteleph() {
		return nomtel;
	}
	public void setNomtel(String nomtel) {
		this.nomtel = nomtel;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "NumeroTelephone [nomtel=" + nomtel + ", numero=" + numero + "]";
		
	}
		
		
	
}
