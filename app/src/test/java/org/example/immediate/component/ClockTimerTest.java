package org.example.immediate.component;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.component.ClockTimer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ClockTimerTest {
	
	private ClockTimer ct;

	@BeforeEach
	void setUp() {
		ct = new ClockTimer(); }
	
	@Test
	void startInZeroTest() {
		ct.start();
		assertTrue(ct.getTime().isZero()); } }
