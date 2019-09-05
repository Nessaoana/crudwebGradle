package crudweb.model;

public class User {
	private String nome;
	private String email;
	private int idade;
	private int id;
	
	private static int id_user;

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String nome, String email, int idade){
		id_user = id_user + 1;
		this.id = id_user;
		this.nome = nome;
		this.email = email;
		this.idade = idade;

	}	
	
	public User () {}
	
}
