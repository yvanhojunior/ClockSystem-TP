package org.example.immediate.utility;


import org.example.utility.PointedArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointedArrayTest {
	
	private PointedArray<Integer> array;

	@BeforeEach
	void setUp() {
		Integer[] intArray = {Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2)};
		array = new PointedArray<Integer>(intArray); }
	
	@Test
	void setPointerException1() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.setPointer(-1));
	}

	@Test
	void setPointerException2() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.setPointer(3));
		}

	@Test
	void getException1() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.get(-1));
	}

	@Test
	void getException2() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.get(3));
	}

	@Test
	void getPointedItemTest() {
		array.setPointer(2);
		assertEquals(Integer.valueOf(2), array.getPointedItem());
		array.setPointer(1);
		assertEquals(Integer.valueOf(1), array.getPointedItem());
		}
	
}
