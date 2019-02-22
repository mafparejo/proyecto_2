package proyecto_2;

import org.junit.Test;

import junit.framework.TestCase;

public class ColegioTest extends TestCase {

	 @Test
	  public void testGetNumero() {
		Colegio c = new Colegio();
	    assertEquals(300, c.getNumero(0));
	  }
	 
	 @Test
	  public void testGetNombre() {
		Colegio c = new Colegio();
	    assertEquals("OTRO", c.getNombre());
	  }
	 
	 @Test
	  public void testVerificar() {
		Colegio c = new Colegio();
	    assertTrue(c.getVerificar());
	  }
}
