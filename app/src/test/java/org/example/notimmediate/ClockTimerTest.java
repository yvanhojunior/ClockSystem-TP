package org.example.notimmediate;


import org.example.component.ClockTimer;
import org.example.state.clocktimer.DisplayClockTimerOff;
import org.example.state.clocktimer.DisplayClockTimerOn;
import org.example.utility.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ClockTimerTest {
	
	private ClockTimer ct;

	@BeforeEach
	void setUp() {
		ct = new ClockTimer(); }
	
	@Test
	void autoStopStateTest() throws InterruptedException {
		ct.getTime().setSecond(2);
		ct.start();
		assertSame(DisplayClockTimerOn.Instance(), ct.getPowerState());
		
		Thread.sleep(2100);
		assertSame(DisplayClockTimerOff.getInstance(), ct.getPowerState());
		}
	
	@Test
	void tickTest() throws InterruptedException {
		ct.getTime().setMinute(1);
		ct.start();
		Thread.sleep(2100);
		ct.stop();
		assertEquals(ct.getTime(), new Time(0,0,58));
		}
	}
