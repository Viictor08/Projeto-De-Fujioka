package fujioka;

public class Movimento {
	private String id;
	private float total;
	private String data;
	Pessoa p=new Pessoa();
	Usuario u=new Usuario();
	PessoaF�sica[] fis=new PessoaF�sica[15];
	PessoaJur�dica[] jus=new PessoaJur�dica[15];
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
