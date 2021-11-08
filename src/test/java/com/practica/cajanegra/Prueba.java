package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/* class Prueba {

	   @Test
	   public void miTestDeEjemplo(){
	       SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B");
	       assertEquals(2,mylist.size());
	   }


}*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Prueba {
	private SingleLinkedListImpl<String> miLista;  
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<String>("A","B","C");
	}
    /*@Test //unitario con A
	public void addLastA() {
		this.miLista.addLast("A");
		assertEquals("[A, B, C, A]", this.miLista.toString());
	}*/
	/*
	@DisplayName("addLast")
    @ParameterizedTest(name="Add Last {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addLast(String s) {
    	this.miLista.addLast(s);
    	assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }*/
    /*@Test //unitario con s=A, n=2
	public void addNTimesA2() {
		this.miLista.addNTimes("A", 2);
		assertEquals("[A, B, C, A, A]", this.miLista.toString());
	}*/
	/*
	@DisplayName("addNtimes")
	@ParameterizedTest(name = "{index} => s={0}, n={1}, salida={2}")
	@CsvSource(value = {
	"A:   1:     [A, B, C, A]",        
	"B:   1:     [A, B, C, B]", 
	"M:   1:     [A, B, C, M]",
	"Y:   1:     [A, B, C, Y]",
	"Z:   1:     [A, B, C, Z]",
	"@:   1:     [A, B, C, @]",
	"[:   1:     [A, B, C, []",
	"A:   2:     [A, B, C, A, A]",        
	"B:   2:     [A, B, C, B, B]", 
	"M:   2:     [A, B, C, M, M]",
	"Y:   2:     [A, B, C, Y, Y]",
	"Z:   2:     [A, B, C, Z, Z]",
	"@:   2:     [A, B, C, @, @]",
	"[:   2:     [A, B, C, [, []",
	"A:   3:     [A, B, C, A, A, A]",        
	"B:   3:     [A, B, C, B, B, B]", 
	"M:   3:     [A, B, C, M, M, M]",
	"Y:   3:     [A, B, C, Y, Y, Y]",
	"Z:   3:     [A, B, C, Z, Z, Z]",
	"@:   3:     [A, B, C, @, @, @]",
	"[:   3:     [A, B, C, [, [, []",
	"A:   4:     [A, B, C, A, A, A, A]",        
	"B:   4:     [A, B, C, B, B, B, B]", 
	"M:   4:     [A, B, C, M, M, M, M]",
	"Y:   4:     [A, B, C, Y, Y, Y, Y]",
	"Z:   4:     [A, B, C, Z, Z, Z, Z]",
	"@:   4:     [A, B, C, @, @, @, @]",
	"[:   4:     [A, B, C, [, [, [, []",
	"A:   5:     [A, B, C, A, A, A, A, A]",        
	"B:   5:     [A, B, C, B, B, B, B, B]", 
	"M:   5:     [A, B, C, M, M, M, M, M]",
	"Y:   5:     [A, B, C, Y, Y, Y, Y, Y]",
	"Z:   5:     [A, B, C, Z, Z, Z, Z, Z]",
	"@:   5:     [A, B, C, @, @, @, @, @]",
	"[:   5:     [A, B, C, [, [, [, [, []",
	"A:   0:     [A, B, C]",        
	"B:   0:     [A, B, C]", 
	"M:   0:     [A, B, C]",
	"Y:   0:     [A, B, C]",
	"Z:   0:     [A, B, C]",
	"@:   0:     [A, B, C]",
	"[:   0:     [A, B, C]",
	"A:   -1:     [A, B, C]",        
	"B:   -1:     [A, B, C]", 
	"M:   -1:     [A, B, C]",
	"Y:   -1:     [A, B, C]",
	"Z:   -1:     [A, B, C]",
	"@:   -1:     [A, B, C]",
	"[:   -1:     [A, B, C]",
	}, delimiter = ':')
	void test_csv(String s, int n, String salida) {
		if(n>0) {
			this.miLista.addNTimes(s, n);
		    assertEquals(this.miLista.toString(), salida);
		}else {
			assertThrows(IllegalArgumentException.class, () -> {
			      Integer.valueOf(s);
			    });
		}
	}*/
	/*
	@DisplayName("addAtPos")
	@ParameterizedTest(name = "{index} => s={0}, n={1}, salida={2}")	//{"@", "A", "B", "M", "Y", "Z", "["}
	@CsvSource(value = {
	"A:   1:     [A, A, B, C]",        
	"B:   1:     [B, A, B, C]", 
	"M:   1:     [M, A, B, C]",
	"Y:   1:     [Y, A, B, C]",
	"Z:   1:     [Z, A, B, C]",
	"@:   1:     [@, A, B, C]",
	"[:   1:     [[, A, B, C]",
	"A:   2:     [A, A, B, C]",        
	"B:   2:     [A, B, B, C]", 
	"M:   2:     [A, M, B, C]",
	"Y:   2:     [A, Y, B, C]",
	"Z:   2:     [A, Z, B, C]",
	"@:   2:     [A, @, B, C]",
	"[:   2:     [A, [, B, C]",
	"A:   3:     [A, B, A, C]",        
	"B:   3:     [A, B, B, C]", 
	"M:   3:     [A, B, M, C]",
	"Y:   3:     [A, B, Y, C]",
	"Z:   3:     [A, B, Z, C]",
	"@:   3:     [A, B, @, C]",
	"[:   3:     [A, B, [, C]",
	"A:   4:     [A, B, C, A]",        
	"B:   4:     [A, B, C, B]", 
	"M:   4:     [A, B, C, M]",
	"Y:   4:     [A, B, C, Y]",
	"Z:   4:     [A, B, C, Z]",
	"@:   4:     [A, B, C, @]",
	"[:   4:     [A, B, C, []",
	"A:   5:     [A, B, C, A]",        
	"B:   5:     [A, B, C, B]", 
	"M:   5:     [A, B, C, M]",
	"Y:   5:     [A, B, C, Y]",
	"Z:   5:     [A, B, C, Z]",
	"@:   5:     [A, B, C, @]",
	"[:   5:     [A, B, C, []",
	"A:   0:     [A, B, C]",        
	"B:   0:     [A, B, C]", 
	"M:   0:     [A, B, C]",
	"Y:   0:     [A, B, C]",
	"Z:   0:     [A, B, C]",
	"@:   0:     [A, B, C]",
	"[:   0:     [A, B, C]",
	"A:   -1:     [A, B, C]",        
	"B:   -1:     [A, B, C]", 
	"M:   -1:     [A, B, C]",
	"Y:   -1:     [A, B, C]",
	"Z:   -1:     [A, B, C]",
	"@:   -1:     [A, B, C]",
	"[:   -1:     [A, B, C]",
	}, delimiter = ':')
	void test_csv2(String s, int n, String salida) {
		if(n>0) {
			this.miLista.addAtPos(s, n);
		    assertEquals(this.miLista.toString(), salida);
		}else {
			assertThrows(IllegalArgumentException.class, () -> {
			      Integer.valueOf(s);
			    });
		}
	}
	*/
	/* -------------------PONER EN MEMORIA QUE EL MÉTODO addFirst NO FUNCIONA---------------------
	 */
	/*
	@DisplayName("addFirst")
	@ParameterizedTest(name="Add First {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addFirst(String s) {
    	this.miLista.addFirst(s);
    	assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
   	 }
	*/
	
	/*@DisplayName("getApos")
	@ParameterizedTest(name = "{index} =>pos={0}, esperado={1}")
	@CsvSource(value = {
	"1:     A",        
	"2:     B", 
	"3:     C",
	"4:     ERROR",
	"0:     ERROR",
	"-1:     ERROR",
	"-2:     ERROR",
	}, delimiter = ':')
	void test_csv3(int n, String salida) {
		if(n>0 && n<miLista.size()) {
			assertEquals(this.miLista.getAtPos(n), salida);
		}else {
			assertThrows(IllegalArgumentException.class, () -> {
			      Integer.valueOf(salida);
			    });
		}
	} 
	*/
	@Test
	@DisplayName("Size")
	public void size() {
		int prueba = this.miLista.size();
		assertEquals( 3, prueba);
	}
}


