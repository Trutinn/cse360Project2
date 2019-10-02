package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddMachineTest {

	@Test
	void test1() 
	{
		AddingMachine temp = new AddingMachine();
		temp.add(4);
		temp.subtract(2);
		temp.add(5);
		System.out.println(temp.getTotal());
		System.out.println(temp.toString());
		assertEquals(7, temp.getTotal());
	}
	@Test
	void test2() 
	{
		AddingMachine temp = new AddingMachine();
		temp.subtract(4);
		temp.subtract(3);
		temp.subtract(5);
		System.out.println(temp.getTotal());
		System.out.println(temp.toString());
		assertEquals(-12, temp.getTotal());
	}

}
