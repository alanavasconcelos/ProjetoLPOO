
public class Jogo {
	
    
	private boolean terminou = false;
	private boolean ganhou = false;
	private int[] jogada;
	private int rodada = 0;
	private Tabuleiro board;
	private int numeroDeBandeirasTotais;
	private int numeroDeBandeirasAtivas;
	private int dificuldade;
	
	
	public Jogo(){
		
	}
	public void Jogar(Tabuleiro board){
		
	}
	public void setNumeroDeBandeirasTotais(int numeroDeBandeirasTotais) {

		this.numeroDeBandeirasTotais = numeroDeBandeirasTotais;

	}

	public int getNumeroDeBandeirasSobrando() {

		return this.numeroDeBandeirasTotais - this.numeroDeBandeirasAtivas;

	}

	public int getDificuldade() {

		return this.dificuldade;

	}


}
