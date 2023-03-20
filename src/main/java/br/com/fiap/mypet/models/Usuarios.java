package br.com.fiap.mypet.models;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private List<Usuarios> usuarios;

    public Usuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuarios usuario) {
        this.usuarios.add(usuario);
        System.out.println("Usu�rio cadastrado com sucesso!");
    }

    public void editarUsuario(String email, String novoNome, String novaSenha) {
        for (Usuarios usuario : this.usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                usuario.setNome(novoNome);
                usuario.setSenha(novaSenha);
                System.out.println("Usu�rio editado com sucesso!");
                return;
            }
        }
        System.out.println("Usu�rio n�o encontrado.");
    }

    private void setSenha(String novaSenha) {
		// TODO Auto-generated method stub
		
	}

	private void setNome(String novoNome) {
		// TODO Auto-generated method stub
		
	}

	private String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarUsuario(String email) {
        for (Usuarios usuario : this.usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                this.usuarios.remove(usuario);
                System.out.println("Usu�rio deletado com sucesso!");
                return;
            }
        }
        System.out.println("Usu�rio n�o encontrado.");
    }

    public void listarUsuarios() {
        System.out.println("Lista de usu�rios:");
        for (Usuarios usuario : this.usuarios) {
            System.out.println("Nome: " + usuario.getNome() + " | Email: " + usuario.getEmail());
        }
    }

	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}
}