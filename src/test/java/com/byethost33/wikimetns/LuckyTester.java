package com.byethost33.wikimetns;

import org.junit.Test;

public class LuckyTester {
	
	@Test
	public void test1 () {
		System.out.println("Ok !");
		LuckyEvent.eventList.add("External Event");
		System.out.println(LuckyEvent.getEvents());
	}
	
	/* Pour faire tourner ce test il faut retirer tout les arguments de play dans LuckyEvent
	@Test
	public void classLoaderTest () throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		LuckyEvent.eventList.remove(0);
		LuckyEvent.eventList.add("com.byethost33.wikimetns.events.DirtyHead");
		System.out.println(LuckyEvent.Play());
	}
	*/
}
