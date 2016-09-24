package com.mcorp.creational.singleton;

public class Star {

	private static Star _sun;
	private String name = "surya";

	private Star() {
	}

	public static synchronized Star getInstance() {

		if (_sun == null) { // lazily initialized.
			_sun = new Star();// only one sun exists in our planetary system.
		}
		return _sun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
