package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

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
	private static SingleLinkedListImpl<String> listaVacia;
	private static SingleLinkedListImpl<String> unElemento;
	private static SingleLinkedListImpl<String> miLista2;

	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<String>("A","B","C");
		this.miLista2 = new SingleLinkedListImpl<String>("A","B","C","D","E","F","G");
		this.unElemento = new SingleLinkedListImpl<String>("A");
		this.listaVacia = new SingleLinkedListImpl<String>();
		
	}
	
	 @Test //unitario con reverse
		public void reverse() {
		 AbstractSingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C");
		 AbstractSingleLinkedListImpl<String> ListaInvertida = new SingleLinkedListImpl<String>();
		 
			ListaInvertida = Lista.reverse();
			assertEquals("[C, B, A]", ListaInvertida.toString());
		}
	 
	 
	 

   @Test //unitario con A
	public void addLastA() {
		this.miLista.addLast("A");
		assertEquals("[A, B, C, A]", this.miLista.toString());
	}
	
	@DisplayName("addLast")
    @ParameterizedTest(name="Add Last {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addLast(String s) {
    	this.miLista.addLast(s);
    	assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }
    @Test //unitario con s=A, n=2
	public void addNTimesA2() {
		this.miLista.addNTimes("A", 2);
		assertEquals("[A, B, C, A, A]", this.miLista.toString());
	}
	
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
	}
	
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
	
	//-------------------PONER EN MEMORIA QUE EL MÉTODO addFirst NO FUNCIONA---------------------
	 
	
	@DisplayName("addFirst")
	@ParameterizedTest(name="Add First {0} in list")
    @ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
    public void addFirst(String s) {
    	this.miLista.addFirst(s);
    	assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
   	 }
	
	
	@DisplayName("getApos")
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
	
	@Test
	@DisplayName("Size")
	public void size() {
		int prueba = this.miLista.size();
		assertEquals( 3, prueba);
	}
	
	@Test
	public void isSubListCP1() {
		SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
		 int resultado;
		
		SingleLinkedListImpl<String> CP1 = new SingleLinkedListImpl<String>("A","B");
		assertEquals("[A, B]", CP1.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		
		 
		resultado = Lista.isSubList(CP1);
		
		assertEquals(resultado, 1);}
		
	@Test
	public void isSubListCP2() {
		SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
		 int resultado;
		
		SingleLinkedListImpl<String> CP2 = new SingleLinkedListImpl<String>("B","C");
		assertEquals("[B, C]", CP2.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP2);
		
		assertEquals(resultado, 2);}
		
		@Test
		public void isSubListCP3() {
			SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
			 int resultado;
		
		SingleLinkedListImpl<String> CP3 = new SingleLinkedListImpl<String>("B","B");
		assertEquals("[B, B]", CP3.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP3);
		
		assertEquals(resultado, 4); }
		
		@Test
		public void isSubListCP4() {
			SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
			 int resultado;
			 
		SingleLinkedListImpl<String> CP4 = new SingleLinkedListImpl<String>("C","A");
		assertEquals("[C, A]", CP4.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP4);
		
		assertEquals(resultado, 6); }
		
		@Test
		public void isSubListCP5() {
			SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
			 int resultado;
			 
		SingleLinkedListImpl<String> CP5 = new SingleLinkedListImpl<String>("A");
		assertEquals("[A]", CP5.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP5);
		
		assertEquals(resultado, 1); }
		
		@Test
		public void isSubListCP6() {
			SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
			 int resultado;
			 
		SingleLinkedListImpl<String> CP6 = new SingleLinkedListImpl<String>();
		assertEquals("[]", CP6.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP6);
		
		assertEquals(resultado, 0); }
		
		@Test
		public void isSubListCP7() {
			SingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C","B","B","C","A");
			 int resultado;
			 
		SingleLinkedListImpl<String> CP7 = new SingleLinkedListImpl<String>("X","A");
		assertEquals("[X, A]", CP7.toString());
		assertEquals("[A, B, C, B, B, C, A]", Lista.toString());
		resultado = Lista.isSubList(CP7);
		
		assertEquals(resultado, -1);
		
	}
		/*@Test //unitario con reverse
		public void reverse() {
		 AbstractSingleLinkedListImpl<String> Lista = new SingleLinkedListImpl<String>("A","B","C");
		 AbstractSingleLinkedListImpl<String> ListaInvertida = new SingleLinkedListImpl<String>();
		 
			ListaInvertida = Lista.reverse();
			assertEquals("[C, B, A]", ListaInvertida.toString());
		}
	*/
	
		
		@Test
		public void removeLastCP1a() throws EmptyCollectionException{
			try{
				listaVacia.removeLast();
				fail("La excepcion no se lanza correctamente");
			}catch(EmptyCollectionException e){
				System.out.println("La excepción se lanza correctamente");
			}
		}
		// CP2 para una borrar un elemento de una lista que únicamente contiene un elemento
		@Test
		public void removeLastCP2a() throws EmptyCollectionException{
			unElemento.removeLast();
			assertEquals(unElemento.isEmpty(), true);
			// comprobamos si realmente la lista se ha quedado vacía o no. (true).
		}
		// CP3 para borrar el último elemento de una lista
		@Test
		public void removeLastCP3a() throws EmptyCollectionException{
			miLista2.removeLast();
			SingleLinkedListImpl<String> miListaEsperada =
					new SingleLinkedListImpl<String>("A","B","C","D","E","F");
			assertEquals(miLista2.toString(),miListaEsperada.toString());
			// una vez he borrado el último elemento de la lista milista,
			// ahora me creo una nueva lista sin ese último elemento, y comparo a ver si son iguales o no.
		}
	
		


		// CP1 para lista vacía
		@Test
		public void removeLastCP1b(){
			assertThrows(EmptyCollectionException.class,
					() -> {listaVacia.removeLast("G");});
		}
		// CP2 para cuando el elemento no se encuentre en la lista
		// CP2b no lanza la excepcion, si es un caracter que no esta en la lista
		@Test
		public void removeLastCP2b() throws NoSuchElementException{
			assertThrows(NoSuchElementException.class,
					() ->{miLista2.removeLast("X");});
			
		}
		// CP3 eliminando el primer elemento de la lista
		// Cuando borra el primer elemento de la lista, borra toda la lista
		@Test
		public void removeLastCP3b() throws EmptyCollectionException {
			SingleLinkedListImpl<String> listaEsperada =
					new SingleLinkedListImpl<String>("B","C","D","E","F","G");
			miLista2.removeLast("A");
			assertEquals(listaEsperada.toString(),miLista2.toString());
		}
		// CP4 eliminando el segundo elemento de la lista
		@Test
		public void removeLastCP4b() throws EmptyCollectionException{
			SingleLinkedListImpl<String> listaEsperada =
					new SingleLinkedListImpl<String>("A","C","D","E","F","G");
			miLista2.removeLast("B");
			assertEquals(listaEsperada.toString(),miLista2.toString());
		}
		// CP5 eliminando un elemento medio de la lista
		@Test
		public void removeLastCP5b() throws EmptyCollectionException{
			SingleLinkedListImpl<String> listaEsperada =
					new SingleLinkedListImpl<String>("A","B","C","E","F","G");
			miLista2.removeLast("D");
			assertEquals(listaEsperada.toString(),miLista2.toString());
		}
		// CP6 eliminando el último elemento de la lista
		@Test
		public void removeLastCP6b() throws EmptyCollectionException{
			SingleLinkedListImpl<String> listaEsperada =
					new SingleLinkedListImpl<String>("A","B","C","D","E","F");
			miLista2.removeLast("G");
			assertEquals(listaEsperada.toString(),miLista2.toString());
		}
		// CP7 pasando como argumento un valor inválido
		@Test
		public void removeLastCP7b() throws EmptyCollectionException{
			SingleLinkedListImpl<String> listaInvalida =
					new SingleLinkedListImpl<String>("@","[");
			// entre estos caracteres de la tabla ascii son válidos.
			SingleLinkedListImpl<String> listaEsperada =
					new SingleLinkedListImpl<String>("@");
			listaInvalida.removeLast("[");
			assertEquals(listaEsperada.toString(),listaInvalida.toString());
		}
		
		
		@DisplayName("indexOf")
	    @ParameterizedTest(name = "{index} =>elem={0}, esperado={1}")
	    @CsvSource(value = {
	            "A:     1",
	            "B:     2", 
	            "C:     3",
	            "Z:     -1",
	            "@:     -1",
	            "m:     -1",
	            "L:     -1",
	            }, delimiter = ':')
	    void test_csv4(String s, int salida) {
	        if(s.equals("A")||s.equals("B")||s.equals("C") ) {
	            assertEquals(this.miLista.indexOf(s), salida);
	        }
	        else {
	            assertThrows(IllegalArgumentException.class, () -> {
	                  Integer.valueOf(s);
	        });
	    }
	    }


	    @DisplayName("isEmptyLleno")
	    @Test //unitario con A
	    public void isEmpty_lleno() {
	        boolean prueba_lleno=false;

	        assertEquals(prueba_lleno, this.miLista.isEmpty());
	    }
	    @DisplayName("isEmptyVacio")
	    @Test //unitario con A
	    public void isEmpty_vacio() {
	        boolean prueba_vacio=true;

	        assertEquals(prueba_vacio, this.listaVacia.isEmpty());
	    }
		
		
	}
	 
	



