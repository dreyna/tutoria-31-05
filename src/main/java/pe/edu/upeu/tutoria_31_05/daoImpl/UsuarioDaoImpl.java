package pe.edu.upeu.tutoria_31_05.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pe.edu.upeu.tutoria_31_05.config.Conexion;
import pe.edu.upeu.tutoria_31_05.dao.UsuarioDao;
import pe.edu.upeu.tutoria_31_05.entity.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;

	@Override
	public int validarUsuario(String user, String pass) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuario where username=? and password=?";
		int x = 0;
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				x = 1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		return x;
	}

	@Override
	public int createUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario readUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
