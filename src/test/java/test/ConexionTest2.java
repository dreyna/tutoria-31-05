package test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import pe.edu.upeu.tutoria_31_05.config.Conexion;

public class ConexionTest2 {

	@Test
	public void test() {
		Connection cx = Conexion.getConexion();
		System.out.println(cx);
		assertEquals(null, cx);
		
	}

}
