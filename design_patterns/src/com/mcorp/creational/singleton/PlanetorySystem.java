package com.mcorp.creational.singleton;

public class PlanetorySystem {
	public static void main(String[] args) {
		Planet earth = new Planet("Earth");
		Planet mercury = new Planet("Mercury");
		Star sun = Star.getInstance();
		Star sun1 = Star.getInstance();
		
		if(earth == mercury)
			System.out.println("Same planets");
		
		if(sun == sun1)
			System.out.printf("Only one sun( %s ) exist in the planetory system.\n", sun.getName());
		else
			System.out.printf("Multiple suns cannot exist in planetor system. \n");
		
		EagerStar esun = EagerStar.getInstance();
		EagerStar esun1 = EagerStar.getInstance();
		
		if(esun == esun1)
			System.out.printf("Only one sun( %s ) exist in the planetory system. \n", esun.getName());
		
		BestSun bsun = BestSun.getInstance();
		BestSun bsun1 = BestSun.getInstance();
		
		if(bsun == bsun1)
			System.out.printf("Only one sun( %s ) exist in the planetory system. \n", bsun.getName());
		
		
		
	}
}
