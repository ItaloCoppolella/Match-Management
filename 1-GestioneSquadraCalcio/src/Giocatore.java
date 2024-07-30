
public class Giocatore {
	private String nome;
	private int annoNascita;
	private boolean capitano;
	
	
	
//	GETTER
	public String getNome() {
		return nome;
	}
	
	public int getAnnoNascita() {
		return annoNascita;
	}
	
	
	public boolean isCapitano() {
		return capitano;
	}

	//	SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public void setCapitano(boolean capitano) {
		this.capitano = capitano;
	}
	
	
	
}
