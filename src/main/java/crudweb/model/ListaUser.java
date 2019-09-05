package crudweb.model;

import java.util.ArrayList;

public class ListaUser {
	private static ArrayList<User> usuarios;
	
	public ListaUser() {
	}

	public ListaUser(ArrayList<User> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public ArrayList<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<User> usuarios) {
		this.usuarios = usuarios;
	}

	
	public static User getUsuario(int id){
		User user = null;
		for(User u : usuarios) {
			System.out.println(u.toString());
			if(u.getId() == id) {
				user = u;
			} else {
				System.out.println("Usuário não encontrado");
			}
		}
		return user;
	}
	
}
