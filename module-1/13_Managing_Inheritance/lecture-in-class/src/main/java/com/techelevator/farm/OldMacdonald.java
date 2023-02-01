package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singables =
				new Singable[] {new Cow(), new Chicken(), new Pig(), new Tractor(), new Cat("Boots","Yeow")};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();

//			if (singable instanceof FarmAnimal){
//				System.out.println(singable.getName() + " is a FarmAnimal");
//				System.out.println();
//			} else {
//				System.out.println(singable.getName() + " is NOT a FarmAnimal");
//				System.out.println();
//			}
			String isNot = (singable instanceof FarmAnimal) ? "" : " NOT ";
			String isSellable = (singable instanceof Sellable ) ? "" : " NOT ";
			System.out.println(singable.getName() + " is " + isNot + " a FarmAnimal and is " + isSellable + " sellable");

			if (singable instanceof FarmAnimal){
				((FarmAnimal) singable).sleep(true);
				System.out.println(singable.getName() + ": " + singable.getSound());
			}
			System.out.println();

		}

//		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};
//
//		for (Sellable sellable : sellables) {
//			System.out.println("Step right up and get your " + sellable.getName());
//			System.out.println("Only $" + sellable.getPrice());
//		}
	}
}
