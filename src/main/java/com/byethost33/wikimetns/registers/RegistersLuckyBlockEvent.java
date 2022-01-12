package com.byethost33.wikimetns.registers;

import com.byethost33.wikimetns.LuckyEvent;
import com.byethost33.wikimetns.events.DemoScreen;
import com.byethost33.wikimetns.events.DirtyHead;

public class RegistersLuckyBlockEvent {
	
	private static String resolveFullName(Class<?> classe){
		
		return classe.toString().replace("class ", "");
		
	}
	
	public static void register () {
		LuckyEvent.eventList.add(resolveFullName(DirtyHead.class));
		LuckyEvent.eventList.add(resolveFullName(DemoScreen.class));
	}
}
