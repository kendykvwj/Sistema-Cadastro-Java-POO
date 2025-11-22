package model;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produto(int i, String nome, double preco, int quantidade) { 
		super();
		this.id = i;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}


	public double getPreco() { 
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public void setNome(String nome) { 
		this.nome = nome;
	}
    
  
	public void setPreco(double preco) { 
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("ID: " + this.id  +"||" + "nome: " + this.nome + "||" + "preço do produto: "+ this.preco + "||" + "quantidade: " + this.quantidade + "||");
	}
	
	
    @Override
    public String toString() {
        return "ID: " + id + "||" + "nome: " + nome + "||" + "preço do produto: " + String.format("%.2f", preco) + "||" + "quantidade: " + quantidade + "||";
    }
}