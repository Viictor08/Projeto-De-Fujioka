package fujioka;

public class ItemMovimento {
	private String id;
	private int quantidade;
	private float preço;
	Venda v=new Venda();
	Categoria[] cat=new Categoria[15];
	Compra c=new Compra();
	Movimento m=new Movimento();
	Produto[] p=new Produto[15];
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
}
