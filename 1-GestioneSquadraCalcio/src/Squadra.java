import java.util.List;

public class Squadra {
	private String nome;
	private List<Giocatore> giocatori;
	
	
//	GETTER
	public String getNome() {
		return nome;
	}
	
	public List<Giocatore> getGiocatori() {
		return giocatori;
	}
	
//	SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
	
}
