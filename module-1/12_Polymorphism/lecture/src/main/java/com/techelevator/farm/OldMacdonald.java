package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

//		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig(), new Giraffe()};
//
//		for (FarmAnimal animal : farmAnimals) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}
      Singable[] singables = new Singable[] {new Cow(), new Chicken(), new Pig(), new Tractor()};
				    for (Singable singable : singables) {
					String name = singable.getName();
					String sound = singable.getSound();
					System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
					System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
					System.out.println("With a " + sound + " " + sound + " here");
					System.out.println("And a " + sound + " " + sound + " there");
					System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
					System.out.println();
				}


					MarketInterface[] sellables = new MarketInterface[]{new Cow(), new Pig(), new Giraffe(), new Egg()};

					for (MarketInterface thing : sellables){
						System.out.println("For Sale: 1 " + thing.getName());
						System.out.println("Only $" + thing.getPrice());
					}
	}
}
