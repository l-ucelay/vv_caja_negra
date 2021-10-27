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
    @ParameterizedTest(name="Add Last {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addLast(String s) {
    	this.miLista.addLast(s);
    	assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }
    /*@Test //unitario con s=A, n=2
	public void addNTimesA2() {
		this.miLista.addNTimes("A", 2);
		assertEquals("[A, B, C, A, A]", this.miLista.toString());
	}*/
	/*@ParameterizedTest(name="Add N Times {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["}, ints= {1,2,3,0, -1})
    public void addNTimes(String s, int n) {
    	this.miLista.addNTimes(s, n);
    	assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }
	@DisplayName("Ntimes")
	@ParameterizedTest(name = "{index} => s={0}, n={1}, salida={2}")
	@CsvSource(value = {
	"A:      2:      [A, B, C, A, A]",        
	"Z:   4:      [A, B, C, Z, Z, Z, Z]", 
	"X:    1:    [A, B, C, X]",
	"B:    0:    [A, B, C]",
	"@:    1:    [A, B, C, @]"
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
	/*@DisplayName("NPos")
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
	void test_csv(String s, int n, String salida) {
		if(n>0) {
			this.miLista.addAtPos(s, n);
		    assertEquals(this.miLista.toString(), salida);
		}else {
			assertThrows(IllegalArgumentException.class, () -> {
			      Integer.valueOf(s);
			    });
		}
	}*/
	
	/* -------------------PONER EN MEMORIA QUE EL MÉTODO addFirst NO FUNCIONA---------------------
	 * 
	 * @ParameterizedTest(name="Add First {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addFirst(String s) {
    	this.miLista.addFirst(s);
    	assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
   	 }
	*/
	  
	
	
	
}


