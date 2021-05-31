package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.tutoria_31_05.dao.UsuarioDao;
import pe.edu.upeu.tutoria_31_05.daoImpl.UsuarioDaoImpl;

public class UsuarioTest {
	private UsuarioDao udao;

	@Before
	public void before() {
		udao = new UsuarioDaoImpl();
	}
	@Test
	public void test() {
		int  x = udao.validarUsuario("dreyna", "123");
		int esperado = 1;
		assertEquals(esperado, x);;
	}

}
