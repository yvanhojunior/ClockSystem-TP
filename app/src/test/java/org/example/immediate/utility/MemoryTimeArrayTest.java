package org.example.immediate.utility;


import org.example.utility.MemoryTimeArray;
import org.example.utility.Time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

 class MemoryTimeArrayTest {
	
	private MemoryTimeArray memo;

	@BeforeEach
	void setUp() {
		memo = new MemoryTimeArray(3);
		Time timeOne = new Time(1,0,0);
		Time timeTwo = new Time(0,1,0);
		Time timeThree = new Time(0,0,1);
		memo.add(timeOne);
		memo.add(timeTwo);
		memo.add(timeThree); }
	
	@Test
	void addTest() {
		Time expected = memo.get(1);
		Time added = new Time(11,11,11);
		memo.add(added);
		assertTrue(memo.get(0).equals(expected) && memo.get(2).equals(added)); } }
