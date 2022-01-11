package com.byethost33.wikimetns.registers;

import com.byethost33.wikimetns.LuckyEvent;

public class RegistersLuckyBlockEvent {
	
	static String basename = "com.byethost33.wikimetns.events";
	
	public static void register () {
		LuckyEvent.eventList.add(basename + "DirtyHead");
	}
}
