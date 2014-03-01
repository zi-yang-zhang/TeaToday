package com.choosetea.teatoday;

import java.util.Random;

public class RandomTea {
	
	public static String teaType(int teaType){
		int type = teaType;
		String tea = null;
		//1:Black, 2:Green, 3:Oolong, 4:Herbel, 5:White Tea
		/*String cylon = "Cylon";
		String assam = "Assam";
		String oolongFormosa = "Oolong Formosa";
		String earlGrey = "Earl Grey";
		String camomile = "Camomile";
		String roseOolong ="Rose Oolong";
		String osmanthusOolong = "Osmanthus Oolong";
		String strawberrySencha = "Strawberry Sencha";
		String passionfruitblack = "Passionfruit Black";
		String lycheeBlack = "Lychee Black";
		String kukicha = "Kukicha";
		String darkroastedOolong = "Dark Roasted Oolong";
		String masalachai = "Masalachai";
		String cinnamonAndSpice = "Cinnamon And Spice";
		String moroccoMint = "Morocco Mint";
		String chocolateMint = "Chocolate Mint";
		String vanillaNut = "Vanilla Nut";
		String vanillaNutEarlGrey = "Vanilla Nut Earl Grey";
		String puerh = "Puerh";
		String camomilePuerh = "Camomile Puerh";
		String lavenderBlack = "Lavender Black";
		String lavenderOolong = "Lavender Oolong";
		String blueForest = "Blue Forest";
		String blueberryPomegranate = "Blueberry Pomegranate";
		String orange = "Orange";
		String citron = "Citron";
		String cherry = "Cherry";
		String honeybushStrawberryMelon = "Honeybush Strawberry Melon";
		String honeybushVanilla = "Honeybush Vanilla";
		String honeybushOrganic = "Honeybush Organic";*/
		String [] blackTea = {
				"Assam",
				"Ceylon",
				"Chai Masala",
				"Darjeeling",
				"Earl Grey",
				"English Breakfast",
				"Keemun",
				"Chocolate Mint",
				"Cinnamon & Spice",
				"Lemon",
				"Lychee",
				"Passion Fruit",
				"Vanilla Nuts",
				"Vanilla Nuts Earl Grey",
				"Camomile Puerh",
				"Lavender Black",
				"Pureh"};
		String [] greenTea = {
				"Jasmine Green Tea",
				"Dragon Pearl",
				"Jade Bamboo (Mao Jian)",
				"Bancha",
				"Genmaicha",
				"Houjicha",
				"Kukicha",
				"Sencha Asamushi",
				"Moroccan Mint",
				"Blue Forest",
				"Cherry",
				"Ginger",
				"Orange Zest",
				"Pomegranate Blueberry",
				"Strawberry Sencha",
				"Yerba Mate"};
		String [] oolongTea = {
				"Dark Roasted Oolong",
				"Milk Oolong",
				"Osmanthus Oolong",
				"Rose Oolong",
				"Lavender Oolong"};
		String [] herbalDecafe = {
				"Camomile",
				"Lavender",
				"Honeybush Four Seasons",
				"Honeybush Ruby",
				"Honeybush Strawberry Melon",
				"Honeybush Vanilla",
				"Rooibos Organic",
				"Rooibos Blueberry",
				"Rooibos Earl Grey",
				"Decaf Green Tea"};
		String [] whiteTea = {
				"Mango White Tea",
				"Vanilla White Tea"};
		String [][] allTea = {blackTea,greenTea,oolongTea,herbalDecafe,whiteTea};
		switch(type){
		//0:All Tea,1:Black, 2:Green, 3:Oolong, 4:Herbel, 5:White Tea
			/*case 0:
				tea = allTea[randInt(0,allTea[].length),randInt(0,allTea[].length)];*/
			case 1:
				tea = blackTea[randInt(0,blackTea.length-1)];
				break;
			case 2:
				tea = greenTea[randInt(0,greenTea.length-1)];
				break;
			case 3:
				tea = oolongTea[randInt(0,oolongTea.length-1)];
				break;
			case 4:
				tea = herbalDecafe[randInt(0,herbalDecafe.length-1)];
				break;
			case 5:	
				tea = whiteTea[randInt(0,whiteTea.length-1)];
				break;
		}
		return tea;
		
	}
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
}
