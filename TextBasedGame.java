// Copyright (c) Ac industries All rights reserved
//
// Created by: Andrew Coxall
// Created on: June 12, 2020
// Text based game

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  

public class TextBasedGame {
	// comment
	
	public static void main(String[] args) {
		// comment
		
		String forestOrLakeDecision;
		Boolean forestOrLakeValidChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println("Welcome to your adventure.");
    	System.out.println("You are in a your home town named “Bark town” and your mission is to try to get to Star city. Best of luck =)");
		System.out.println("There are two ways that you can get to Star city. The Lake and the Forest.");
		System.out.println("Which would you like to try: (Lake or Forest)");
		
		try {
			do {
				forestOrLakeDecision = br.readLine();
		
				if (forestOrLakeDecision.equals("Lake")) {
					lake ();
					forestOrLakeValidChoice = true;
				}else if (forestOrLakeDecision.equals("Forest")) {
					forest ();
					forestOrLakeValidChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Lake or Forest)");
				}
			} while (forestOrLakeValidChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void forest() {
		// comment
		
		String runOrTalk;
		Boolean runOrtalkChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You are now in the woods. You see a man standing far off with a sword.");
		System.out.println("Would you like to Talk or Run?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				runOrTalk = br.readLine();
		
				if (runOrTalk.equals("Run")) {
					run ();
					runOrtalkChoice = true;
				}else if (runOrTalk.equals("Talk")) {
					talk ();
					runOrtalkChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Talk or Run)");
				}
			} while (runOrtalkChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void run() {
		// comment
		
		String callForHelpOrTryAndGetOut;
		Boolean callForHelpOrTryAndGetOutChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You are captured by a group of giant spiders!");
		System.out.println("Would you like to Call for help or Try and get out?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				callForHelpOrTryAndGetOut = br.readLine();
				
				if (callForHelpOrTryAndGetOut.equals("Call for help")) {
					callForHelp ();
					callForHelpOrTryAndGetOutChoice = true;
				}else if (callForHelpOrTryAndGetOut.equals("Try and get out")) {
					TryAndGetOut ();
					callForHelpOrTryAndGetOutChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Call for help or Try and get out)");
				}
			} while (callForHelpOrTryAndGetOutChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void talk() {
		// comment
		String loudlyOrQuitly;
		Boolean loudlyOrQuitlyChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You walk up to the man and he tells you that we have to be careful in the woods");
		System.out.println("Woul you like to walk Loudly or Quitly");
		System.out.println("Which would you like to try:");
		
		try {
			do {
				loudlyOrQuitly = br.readLine();
				
				if (loudlyOrQuitly.equals("Loudly")) {
					Loudly ();
					loudlyOrQuitlyChoice = true;
				}else if (loudlyOrQuitly.equals("Quitly")) {
					Quitly ();
					loudlyOrQuitlyChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (:Loudly or Quitly)");
				}
			} while (loudlyOrQuitlyChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void fightOrRun() {
		// comment 
		
		String  fightOrRun;
		Boolean fightOrRunChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("My Function called");
	}
	
	static void callForHelp() {
		// comment
		
		String  fightOrRunFromSpiders;
		Boolean fightOrRunFromSpidersChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The man you saw from before comes and gets you out ! =) ");
		System.out.println("But ... Oh no the spiders saw you");
		System.out.println("Would you like to Fight or Run?");
		System.out.println("What would you like to do: ");
		
		try {
			do {
				fightOrRunFromSpiders = br.readLine();
				
				if (fightOrRunFromSpiders.equals("Run")) {
					RunFromSpiders ();
					fightOrRunFromSpidersChoice = true;
				}else if (fightOrRunFromSpiders.equals("Fight")) {
					fightSpiders();
					fightOrRunFromSpidersChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Fight or Run)");
				}
			} while (fightOrRunFromSpidersChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void TryAndGetOut() {
		// comment
		
		String  TryAndGetOut;
		Boolean TryAndGetOutChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Oh, no the spiders saw you trying to get out and killed you! =( ");
	}
	
	static void fightSpiders() {
		// comment
		
		String  takeHimWIthYouOrLeaveHim;
		Boolean takeHimWIthYouOrLeaveHimChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You killed the spiders but the man is knocked unconscious");
		System.out.println("Would you like to Take him with you or Leave him?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				takeHimWIthYouOrLeaveHim = br.readLine();
				
				if (takeHimWIthYouOrLeaveHim.equals("Take him with you")) {
					takeHimWIthYou ();
					takeHimWIthYouOrLeaveHimChoice = true;
				}else if (takeHimWIthYouOrLeaveHim.equals("Leave him")) {
					LeaveHim();
					takeHimWIthYouOrLeaveHimChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
		
	static void RunFromSpiders() {
		// comment 
		
		String  TryAndGetOut;
		Boolean TryAndGetOutChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}	
		static void takeHimWIthYou() {
		// comment 
		
		String  TryAndGetOut;
		Boolean TryAndGetOutChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
	}
	static void LeaveHim() {
		// comment 
		
		System.out.println("You left the man in the woods");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}
	
	static void Loudly() {
		// comment 
		
		String  AttackOrNotMoveMole;
		Boolean AttackOrNotMoveMoleChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A giant mole comes up from the groud!");
		System.out.println("Would you like to Attack or Not move");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				AttackOrNotMoveMole = br.readLine();
				
				if (AttackOrNotMoveMole.equals("Attack")) {
					AttackMole ();
					AttackOrNotMoveMoleChoice = true;
				}else if (AttackOrNotMoveMole.equals("Not move")) {
					NotMoveMole();
					AttackOrNotMoveMoleChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Attack or Not move)");
				}
			} while (AttackOrNotMoveMoleChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void Quitly() {
		// comment 
		
		String  AttackOrNotMoveTroll;
		Boolean AttackOrNotMoveTrollChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You have walked into a trolls den. You don't think it can see you");
		System.out.println("Would you like to Attack or Not move");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				AttackOrNotMoveTroll = br.readLine();
				
				if (AttackOrNotMoveTroll.equals("Attack")) {
					AttackMole ();
					AttackOrNotMoveTrollChoice = true;
				}else if (AttackOrNotMoveTroll.equals("Not move")) {
					NotMoveMole();
					AttackOrNotMoveTrollChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Attack or Not move)");
				}
			} while (AttackOrNotMoveTrollChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	static void AttackTroll() {
		// You die if you try and kill the troll
		
	System.out.println("You died =( ");  
	}
	static void NotMoveTroll() {

	String  takeHimWIthYouOrLeaveHimTroll;
	Boolean takeHimWIthYouOrLeaveHimTrollChoice = false;
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("The man has been knocked out by the troll .....the troll moves on.");
	System.out.println("Would you like to Take him with you or Leave him");
	System.out.println("Which would you like to try: ");  
			try {
			do {
				takeHimWIthYouOrLeaveHimTroll = br.readLine();
				
				if (takeHimWIthYouOrLeaveHimTroll.equals("Take him with you")) {
					takeHimWIthYouTroll();
					takeHimWIthYouOrLeaveHimTrollChoice = true;
				}else if (takeHimWIthYouOrLeaveHimTroll.equals("Leave him")) {
					LeaveHimTroll();
					takeHimWIthYouOrLeaveHimTrollChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimTrollChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	static void LeaveHimTroll(){
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}
	static void takeHimWIthYouTroll(){
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
	}
	static void AttackMole(){
		String  takeHimWIthYouOrLeaveHimMole;
		Boolean takeHimWIthYouOrLeaveHimMoleChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The man has been knocked out by the mole .....the mole moves on.");
		System.out.println("Would you like to Take him with you or Leave him");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				takeHimWIthYouOrLeaveHimMole = br.readLine();
				
				if (takeHimWIthYouOrLeaveHimMole.equals("Take him with you")) {
					takeHimWIthYouMole();
					takeHimWIthYouOrLeaveHimMoleChoice = true;
				}else if (takeHimWIthYouOrLeaveHimMole.equals("Leave him")) {
					LeaveHimMole();
					takeHimWIthYouOrLeaveHimMoleChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimMoleChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	static void NotMoveMole(){
		System.out.println("Oh no the mole saw you");
		System.out.println("The mole killed you =(");
	}
	static void takeHimWIthYouMole(){
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
	}
	static void LeaveHimMole(){
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}
	static void lake(){
		String  swimOrTalk;
		Boolean swimOrTalkChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The water is deep and blue, you could swim but youy also see a ma witha boat.");
		System.out.println("Would you like to Talk or Swim");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				swimOrTalk = br.readLine();
				
				if (swimOrTalk.equals("Talk")) {
					talkLake();
					swimOrTalkChoice = true;
				}else if (swimOrTalk.equals("Swim")) {
					swim();
					swimOrTalkChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Swim or Talk)");
				}
			} while (swimOrTalkChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}	
	}
	static void talkLake(){
		
	String  workOrFightManLake;
	Boolean workOrFightManLakeChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The man says you can come on his boat if you work for him.");
		System.out.println("You could work for him or you could try an take over his ship");
		System.out.println("Would you like to Fight man or Work");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				workOrFightManLake = br.readLine();
				
				if (workOrFightManLake.equals("Fight man")) {
					fightManLake();
					workOrFightManLakeChoice = true;
				}else if (workOrFightManLake.equals("Work")) {
					work();
					workOrFightManLakeChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Help or Fight)");
				}
			} while (workOrFightManLakeChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}	
	}
	static void fightManLake(){
		
	String  runOrFightShark;
	Boolean runOrFightSharkChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A gaint shark comes out of the water, it smells blood");
		System.out.println("Would you like to Fight or Run");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				runOrFightShark = br.readLine();
				
				if (runOrFightShark.equals("Fight")) {
					fightShark();
					runOrFightSharkChoice = true;
				}else if (runOrFightShark.equals("Run")) {
					runShark();
					runOrFightSharkChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Run or Fight)");
				}
			} while (runOrFightSharkChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}	
	}
	static void runShark(){
		
		String  takeHimWIthYouOrLeaveHimLakeShark;
		Boolean takeHimWIthYouOrLeaveHimLakeSharkChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The man with the boat comes and help you");
		System.out.println("You killed the shark but the man is knocked unconscious");
		System.out.println("Would you like to Take him with you or Leave him?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				takeHimWIthYouOrLeaveHimLakeShark = br.readLine();
				
				if (takeHimWIthYouOrLeaveHimLakeShark.equals("Take him with you")) {
					takeHimWIthYouLakeShark ();
					takeHimWIthYouOrLeaveHimLakeSharkChoice = true;
				}else if (takeHimWIthYouOrLeaveHimLakeShark.equals("Leave him")) {
					LeaveHimLakeShark();
					takeHimWIthYouOrLeaveHimLakeSharkChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimLakeSharkChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	static void takeHimWIthYouLakeShark(){
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
	}
	static void LeaveHimLakeShark(){
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}
	static void fightShark(){
		System.out.println("You both died trying to fight the shark =(");
	}
	
	//// start of work on lake part
	//
	//
	//
	//
	
	static void work(){
	String  runOrFightPirates;
	Boolean runOrFightPiratesChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A ship pirates sails near you they want your gold");
		System.out.println("Would you like to Fight or Run");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				runOrFightPirates = br.readLine();
				
				if (runOrFightPirates.equals("Fight")) {
					fightPirates();
					runOrFightPiratesChoice = true;
				}else if (runOrFightPirates.equals("Run")) {
					runPirates();
					runOrFightPiratesChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Run or Fight)");
				}
			} while (runOrFightPiratesChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}	
	}
	
	static void runPirates(){
		System.out.println("You died trying to get away form the pirates");
	}
	
	static void fightPirates(){
		String  takeHimWIthYouOrLeaveHimLakePirates;
		Boolean takeHimWIthYouOrLeaveHimLakePiratesChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You killed the pirates but the man is knocked unconscious");
		System.out.println("Would you like to Take him with you or Leave him?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				takeHimWIthYouOrLeaveHimLakePirates = br.readLine();
				
				if (takeHimWIthYouOrLeaveHimLakePirates.equals("Take him with you")) {
					takeHimWIthYouLakePirates ();
					takeHimWIthYouOrLeaveHimLakePiratesChoice = true;
				}else if (takeHimWIthYouOrLeaveHimLakePirates.equals("Leave him")) {
					LeaveHimLakePirates();
					takeHimWIthYouOrLeaveHimLakePiratesChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimLakePiratesChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}
	
	static void takeHimWIthYouLakePirates(){
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
		
	}
	
	static void LeaveHimLakePirates (){
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
		
	}
	
	
	static void swim(){
		String  helpOrFight;
		Boolean helpOrFightChoice = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A giant squid has seen you and is trying to eat you! ");
		System.out.println("Would you like to Fight or call for Help");
		System.out.println("Which would you like to try: ");  
				try {
			do {
				helpOrFight = br.readLine();
				
				if (helpOrFight.equals("Help")) {
					helpLake();
					helpOrFightChoice = true;
				}else if (helpOrFight.equals("Fight")) {
					fightLake();
					helpOrFightChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Help or Fight)");
				}
			} while (helpOrFightChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}	
	}
	static void helpLake(){
		String  takeHimWIthYouOrLeaveHimLakeSquid;
		Boolean takeHimWIthYouOrLeaveHimLakeSquidChoice = false;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The man with the boat comes and help you");
		System.out.println("You killed the squid but the man is knocked unconscious");
		System.out.println("Would you like to Take him with you or Leave him?");
		System.out.println("Which would you like to try: ");
		
		try {
			do {
				takeHimWIthYouOrLeaveHimLakeSquid = br.readLine();
				
				if (takeHimWIthYouOrLeaveHimLakeSquid.equals("Take him with you")) {
					takeHimWIthYouLakeSquid ();
					takeHimWIthYouOrLeaveHimLakeSquidChoice = true;
				}else if (takeHimWIthYouOrLeaveHimLakeSquid.equals("Leave him")) {
					LeaveHimLakeSquid();
					takeHimWIthYouOrLeaveHimLakeSquidChoice = true;
				}
				else {
					System.out.println("Invalid input");
					System.out.println("Which would you like to try: (Take him with you or Leave him)");
				}
			} while (takeHimWIthYouOrLeaveHimLakeSquidChoice != true);
			
		} catch (Exception e) {
			System.out.println(e);
     	}
	}	
	
	static void fightLake(){
		System.out.println("You died trying to fight the squid =(");
	}
	static void takeHimWIthYouLakeSquid(){
		System.out.println("You take him with you and hope that he is going to be ok");
		System.out.println("When you get to Star city you go to the hospital");
		System.out.println("");
		System.out.println("Thank you for playing see you next time ");
	}
	static void LeaveHimLakeSquid(){
		System.out.println("You got away safely and made your way towards Star city");
		System.out.println("You enter the bar to meet up with your contact for your next job.");
		System.out.println("He buys you a drink….. It’s poisoned and there's no one to help you ");
		System.out.println("You died =(");
	}
}



