package cl.desafiolatam.gs_testing;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private Calculadora calculadora;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	public void sumarHappyCase() {
		// GIVEN
		List<Float> numeros = new ArrayList<Float>(Arrays.asList(1f, 2f, 3f));

		// WHEN
		float valordeRetorno = calculadora.sumar(numeros);

		// THEN
		assertEquals();
	}
}
