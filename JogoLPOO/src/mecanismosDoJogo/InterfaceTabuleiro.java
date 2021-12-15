package mecanismosDoJogo;


public interface InterfaceTabuleiro {
	
	public void adicionarVizinhas();
	public void exibeMinas();
	public void adicionarMinas();
	public void adicionarMalucas();
	public int clicar(int linha,int coluna);
	public void colocaBandeira(int linha, int coluna);
	public boolean venceu();
	public CelulaNormal getCelula(int linha, int coluna);
	public int getNumeroDeMinas();
	public String toString();

}
