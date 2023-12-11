package src.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.main.Animal;

public class AnimalTest {
	
	@Test
	void hasName() {
		Animal tiger = new Animal("Tiger");
		assertEquals(tiger.getName(), "Tiger");
	}
}