package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
    private boolean isAwake;
	public FarmAnimal(String name, String sound, boolean isAwake) {
		this.name = name;
		this.sound = sound;
		this.isAwake = isAwake;
	}

	public String getName( ) {
		return name;
	}
	public String getSound( ) {
		if(isAwake = false){
			this.sound = "Zzzz...";
		}else{

	   }
		return sound;
	}
	public Boolean getSleep(){
		return isAwake = false;
	}
}
