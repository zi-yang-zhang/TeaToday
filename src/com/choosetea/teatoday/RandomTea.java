package com.choosetea.teatoday;

import java.util.Random;

public class RandomTea {

	String [] oolongTea = {
			"Dark Roasted Oolong",
			"Milk Oolong",
			"Osmanthus Oolong",
			"Rose Oolong",
			"Lavender Oolong"};
	String [] whiteTea = {
			"Mango White Tea",
			"Vanilla White Tea"};
	String[] sixtyPercentBlackTea ={
			"Ceylon",
			"Assam",
			"Earl Grey"};
	String[] fivePercentBlackTea ={
			"Lemon",
			"Darjeeling",
			"Cinnamon & Spice"};
	String[] thirtyFivePercentBlackTea ={
			"Chai Masala",
			"English Breakfast",
			"Keemun",
			"Chocolate Mint",
			"Lychee",
			"Passion Fruit",
			"Vanilla Nuts",
			"Vanilla Nuts Earl Grey",
			"Camomile Puerh",
			"Lavender Black",
			"Pureh"};
	String[] sixtyPercentGreenTea ={
			"Jasmine Green Tea",
			"Strawberry Sencha"};
	String[] fivePercentGreenTea ={
			"Dragon Pearl",
			"Bancha",
			"Houjicha",
			"Sencha Asamushi",
			"Blue Forest",
			"Cherry",
			"Ginger",
			"Orange Zest",
			"Yerba Mate"};
	String[] thirtyFivePercentGreenTea ={
			"Genmaicha",
			"Kukicha",
			"Moroccan Mint",
			"Pomegranate Blueberry"};
	String[] seventyPercentHerbal ={
			"Camomile",
			"Honeybush Four Seasons",
			"Honeybush Ruby",
			"Honeybush Strawberry Melon",
			"Honeybush Vanilla",
			"Decaf Green Tea"};
	String[] thirtyPercentHerbal ={
			"Lavender",
			"Rooibos Organic",
			"Rooibos Blueberry",
			"Rooibos Earl Grey"};
	String[] sixtyPercentAllTea ={
			"Jasmine Green Tea",
			"Strawberry Sencha",
			"Ceylon",
			"Assam",
			"Earl Grey",
			"Dark Roasted Oolong",
			"Milk Oolong",
			"Osmanthus Oolong",
			"Rose Oolong",
			"Lavender Oolong"};
	String[] thirtyFivePercentAllTea ={
			"Genmaicha",
			"Kukicha",
			"Moroccan Mint",
			"Pomegranate Blueberry",
			"Chai Masala",
			"English Breakfast",
			"Keemun",
			"Chocolate Mint",
			"Lychee",
			"Passion Fruit",
			"Vanilla Nuts",
			"Vanilla Nuts Earl Grey",
			"Camomile Puerh",
			"Lavender Black",
			"Pureh",
			"Camomile",
			"Honeybush Four Seasons",
			"Honeybush Ruby",
			"Honeybush Strawberry Melon",
			"Honeybush Vanilla",
			"Decaf Green Tea"};
	String[] fivePercentAllTea ={
			"Lemon",
			"Darjeeling",
			"Cinnamon & Spice",
			"Dragon Pearl",
			"Bancha",
			"Houjicha",
			"Sencha Asamushi",
			"Blue Forest",
			"Cherry",
			"Ginger",
			"Orange Zest",
			"Yerba Mate",
			"Lavender",
			"Rooibos Organic",
			"Rooibos Blueberry",
			"Rooibos Earl Grey",
			"Mango White Tea",
			"Vanilla White Tea"};
	public String teaType(int teaType,boolean milk, boolean latte, boolean hot,boolean cold,boolean herb, boolean jelly,boolean pearl){
		String tea = null;
		String[] withMilk = {""," Milk Tea"," Latte"};
		String[] hotOrCold = {" Hot"," Cold"};
		String[] withHerb = {""," With Herb"};
		String[] withJelly = {""," With Jelly"};
		String[] withPearl = {""," With Pearl"};
		double r = Math.random();
		
		//String [][] allTea = {blackTea,greenTea,oolongTea,herbalDecafe,whiteTea};
		switch(teaType){
		//5:All Tea,0:Black, 1:Green, 2:Oolong, 3:Herbel, 4:White Tea
			case 0:
				if (r < 0.60) {
					tea = sixtyPercentBlackTea[randInt(0,sixtyPercentBlackTea.length-1)];
				}else if(r < 0.95){
					tea = thirtyFivePercentBlackTea[randInt(0,thirtyFivePercentBlackTea.length-1)];
				}else{
					tea = fivePercentBlackTea[randInt(0,fivePercentBlackTea.length-1)];
				}
				break;
			case 1:
				if (r < 0.60) {
					tea = sixtyPercentGreenTea[randInt(0,sixtyPercentGreenTea.length-1)];
				}else if(r < 0.95){
					tea = thirtyFivePercentGreenTea[randInt(0,thirtyFivePercentGreenTea.length-1)];
				}else{
					tea = fivePercentGreenTea[randInt(0,fivePercentGreenTea.length-1)];
				}
				break;
			case 2:
				tea = oolongTea[randInt(0,oolongTea.length-1)];
				break;
			case 3:
				if (r < 0.70) {
					tea = seventyPercentHerbal[randInt(0,seventyPercentHerbal.length-1)];
				}else{
					tea = thirtyPercentHerbal[randInt(0,thirtyPercentHerbal.length-1)];
				}
				break;
			case 4:	
				tea = whiteTea[randInt(0,whiteTea.length-1)];
				break;
			case 5:
				if (r < 0.60) {
					tea = sixtyPercentAllTea[randInt(0,sixtyPercentAllTea.length-1)];
				}else if(r < 0.95){
					tea = thirtyFivePercentAllTea[randInt(0,thirtyFivePercentAllTea.length-1)];
				}else{
					tea = fivePercentAllTea[randInt(0,fivePercentAllTea.length-1)];
				}
				break;
		}
		if(cold){
			tea = tea + hotOrCold[1];
		}else if(hot){
			tea = tea + hotOrCold[0];
		}else{
			tea = tea + hotOrCold[randInt(0,1)];
		}
		if(milk){
			tea = tea + withMilk[1];
		}else if(latte){
			tea = tea + withMilk[2];
		}else{
			tea = tea + withMilk[randInt(0,2)];
		}
		
		
		if(herb){
			tea = tea + withHerb[1];
		}else{
			tea = tea + withHerb[randInt(0,1)];
		}
		if(jelly){
			tea = tea + withJelly[1];
		}else{
			tea = tea + withJelly[randInt(0,1)];
		}
		if(pearl){
			tea = tea + withPearl[1];
		}else{
			tea = tea + withPearl[randInt(0,1)];
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
