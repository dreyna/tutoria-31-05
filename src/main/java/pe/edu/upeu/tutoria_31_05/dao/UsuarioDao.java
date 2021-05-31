package pe.edu.upeu.tutoria_31_05.dao;

import java.util.List;

import pe.edu.upeu.tutoria_31_05.entity.Usuario;

public interface UsuarioDao {
	public int validarUsuario(String user, String pass);
	public int createUser(Usuario u);
	public int updateUser(Usuario u);
	public int deleteUser(int id);
	public Usuario readUser(int id);
	public List<Usuario> readAll();
}
