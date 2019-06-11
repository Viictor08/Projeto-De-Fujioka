package fujioka;

public class Produto {
	private String id;
	private String nome;
	private float preçoVenda;
	private int qntDeEstoque;
	Unidade u=new Unidade();
	Categoria ca=new Categoria();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreçoVenda() {
		return preçoVenda;
	}
	public void setPreçoVenda(float preçoVenda) {
		this.preçoVenda = preçoVenda;
	}
	public int getQntDeEstoque() {
		return qntDeEstoque;
	}
	public void setQntDeEstoque(int qntDeEstoque) {
		this.qntDeEstoque = qntDeEstoque;
	}
	
}
