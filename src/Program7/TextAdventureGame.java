package Program7;
import java.util.Scanner;
public class TextAdventureGame {
	/* 
	 *  kylee prescott
	 *  1/19
	 *  this prgram is a text adventure game 
	 */

	public static void main(String[] args) {
		
	
			Scanner input = new Scanner(System.in);
			
			tank(input);
		     }

		public static void tank (Scanner input) {
			// story output 
		System.out.println("Welcome to Finding Dory!");
		System.out.println("You are Nemo. You are trying to save Dory.");
		System.out.println("You are currently in your tank you have two options: ");
		//ascii art 
		System.out.println(" __ _     _     _              _    \r\n" + 
				" / _(_)   | |   | |            | |   \r\n" + 
				"| |_ _ ___| |__ | |_ __ _ _ __ | | __\r\n" + 
				"|  _| / __| '_ \\| __/ _` | '_ \\| |/ /\r\n" + 
				"| | | \\__ \\ | | | || (_| | | | |   < \r\n" + 
				"|_| |_|___/_| |_|\\__\\__,_|_| |_|_|\\_\\\r\n" + 
				"                                     \r\n" + 
				"                  ");

		// two options and goes to another method 
		//while loop 
		while(true) {
			//two questions
			System.out.println("You can either clog the filtration system(clog)");
			System.out.println("Or you can pretend to be dead(pretend)");
			String question = input.next();
			//if statements
			if (question.startsWith("clog")) {
				putInABag(input);
				break;
			}
			else if (question.startsWith("pretend")){
				pretendToBeDead(input);
				break;
			}// if the answer wasnt an option 
			else {
				System.out.println("try again");
				
			}
			}
		  }
		public static void putInABag(Scanner input) {
		System.out.println("You were put in a bag to clean the tank");
		// ascii art 
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMNKXWMMMMMMMMMWMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWWMMMMMMMWx;kWW0kKWWMMWWWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMWWMMMMMMOl:dNkl;oNWNklOWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWOdk0XWMNodd:dlxodXkdo:xMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWKo,cddOOlOd..o0c:oxXXlxMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWMW0ddxdl,xo,d00coXXkdxKWWWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMWNOodkokOONWWXkxdxXWMWWWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWWNx:ccllloddx0WMMMMWWMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWXkdlool::,;xXWMMMWMWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWMMWXkox0OKKOXW0xxdx0NWWMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWWOodXMNKNXOXMNKNNOdoONWWMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWXolOWWMMMWWNNMWWMWWXxcl0WMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMW0llxkkOkkxxxxxxxxkkkkkxolxXMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMWklOWMMWWWNNXXXXXNNWWMMMMMNxl0WMMMMMMMMMM\r\n" + 
				"MMMMMMMMWxl0MMMMMMMMMMMWMMMMMMMMMMMMWOlOWMMMMMMMMM\r\n" + 
				"MMMMMMMMOcOMMMMMMMMMMMMMMMMMMMMMMMMMWM0lkWMMMMMMMM\r\n" + 
				"MMMMMMMNldWMMMMMMMMMMMMMMMMMMMMMMMMMMMMOlOWMMMMMMM\r\n" + 
				"MMMMMMMkc0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWdoXMMMMMMM\r\n" + 
				"MMMMMMMdoNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKlkMMMMMMM\r\n" + 
				"MMMMMMWdoWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWddWMMMMMM\r\n" + 
				"MMMMMMMxoNMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWxlXMMMMMM\r\n" + 
				"MMMMMMMklKWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMxlXMMMMMM\r\n" + 
				"MMMMMMMXdok0NWMMMMMMMMMMMMMMMMMMMMMMMWKOklxNMMMMMM\r\n" + 
				"MMMMMMMMWXOxxxxxO0KXNWWWWWWWWWNX0OkxxxxkOXWMWMMMMM\r\n" + 
				"WWWWWWWWWWWWWN0OkxxkO0KKKKKK0OkxxkO0XWMMMMMMMMMMMM\r\n" + 
				"XKXKXXXXKKKXXXXXNNWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"KKX000KK00KKKXK000KKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"");
		System.out.println("You know have to choices you can:");
		// while loop 
		while(true) {
			// two choices 
			System.out.println("Roll left");
			System.out.println("Roll right");
			String question = input.next();
			if (question.startsWith("left")) {
				left(input);
				break;
			}
			else if (question.startsWith("right")){
				right(input);
				break;
			}
			else {
				System.out.println("try again");
				
			}
			}
		  }
		// story guide 
		public static void left(Scanner input) {
		System.out.println("You rolled into a garbage can! ");
		System.out.println("You cannot get out and you werent found");
		System.out.println("You ended up dying");
		//ascii art 
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWXOdllccccccclxOXWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWOl'.            ..lONMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMWMMWWKl.                  .cKMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMXc                      :XMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMWMWx.                      .dWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWl                        cNMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMx.   ...     .   ....   .dWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMNc 'oO0Okd,.  .,okOOOo' :XMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMNc.dWMMMWWO'  'OMMMMWWd.cXMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMNd. :0NMWN0c....:0NWMW0: .oNWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWNo.  .;::,.'d0Oo'.;::;.  .oNWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMWWNKOxoc. ...dKKKXx.....:oxk0NWMMWMMWMMMM\r\n" + 
				"MMMMMMMWKKNWWWMMNo.  .,;,,;;.  .lNWWWWWNXXNWMWWMMM\r\n" + 
				"MMMMMWNd'.:ONMMMMKo,....  ....,lKWWMMW0c..oNWWMMMM\r\n" + 
				"MMWMWO;.   .:d0XWMWNX0OOkxkO0XNWWWX0x:.   .,OWMMMM\r\n" + 
				"MMMMWx..      .':lx0XWMMMMMMWX0xl:'.      ..dWMMMM\r\n" + 
				"MMMMMWKOkxxdoc;'.  .':ldkkxl;'.  .';codxxxOKNMMMMM\r\n" + 
				"MMWMMMMMMMMMMMWX0d;..    .   ..;dOXWMMMMMWWMMWMMMM\r\n" + 
				"MMMMMNOxxkOOOxol:'.. .,:cl:,.. .';ldxOOOkddONWMMMM\r\n" + 
				"MMWWWd.   ...   .,:ox0XWMMWX0ko:,.   ...   .dWMMMM\r\n" + 
				"MMWMW0c.   ..;ok0NWMMMMMMMMMMMMWN0ko:..   .:KMMMMM\r\n" + 
				"MMMMMMXo..,o0NMWMMMMMMMMMMMMMWMMMWWMW0o,..lXMMMMMM\r\n" + 
				"MMMMMMMWXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMWNKKWMMMMMMM\r\n" + 
				"MMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWNWWWWWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWNXXNNXXXXXXXNNNNXNWNNNXXXXXNWMMMMMMMMMM\r\n" + 
				"");
		}
		public static void right(Scanner input) {
		System.out.println("You rolled out of the widow.");
		System.out.println("You have two options:");
		//while loop 
		while(true) {
			//two options user input 
			System.out.println("Roll across the street(roll)");
			System.out.println("Get a ride from a pelican(ride)");
			String question = input.next();
			if (question.startsWith("roll")) {
				acrossTheStreet(input);
				break;
			}
			else if (question.startsWith("ride")){
				rideFromPelican(input);
				break;
			}
			// if the user input isnt an option
			else {
				System.out.println("try again");
				
			}
			}
		  }
		public static void acrossTheStreet(Scanner input) {
			//story mode 
				System.out.println("You rolled across the street succsesfully!");
				System.out.println("You are now in the ocean");
				//asscii art 
				System.out.println("___   ___ ___  __ _ _ __  \r\n" + 
						" / _ \\ / __/ _ \\/ _` | '_ \\ \r\n" + 
						"| (_) | (_|  __/ (_| | | | |\r\n" + 
						" \\___/ \\___\\___|\\__,_|_| |_|\r\n" + 
						"                            \r\n" + 
						"                            ");
				tookARight(input);
						
			      }
		// story output 
		public static void rideFromPelican(Scanner input) {
		System.out.println("You ended up on a bouy in the middle of the ocean with a friendly pelican.");
		System.out.println("You have two options:");

		// while loop
		while(true) {
			// two options
			System.out.println("You can continue to talk to the pelican(talk)");
			System.out.println("You can swim down(swim)");
			String question = input.next();
			if (question.startsWith("talk")) {
				talkToPelican(input);
				break;
			}
			else if (question.startsWith("swim")){
				swimDown(input);
				break;
			}
			else {
				System.out.println("try again");
				
			}
			}
		  }
		  
		public static void swimDown(Scanner input) {
			// story mode 
		System.out.println("You chose to swim down!");
		System.out.println("You now start to see something in the distance and start to swim up to it");
		System.out.println("You have found Dory!");
		System.out.println("Congragulations you have won!!");
		System.out.println("MMMMMMMMMN0kkOKX0koc;,;:ldkXWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMNx::;,:c,.......   'oKWMMMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMM0lccc:::;::cccc:;,'..,kWMMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMWKo:ccccccccccccccccc:,..oNMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMNKx:,;ccccccc::::c::;;:cc;..lXMMMMMMMMMMMMMMMM\r\n" + 
					"MWKOkOkkxo::ccc::ok0XXX0kdo::c:..;OWMMMMMMMMMMMMMM\r\n" + 
					"W0kKNKxooddlcc:oKN0dlclxKNNKo:c;. ,dKWMMMMMMMMMMMM\r\n" + 
					"KONXo.    .cc:xNKc.     .,oXNxc:' .;cxXMMMMMMMMWWM\r\n" + 
					"0KWd.      .:oXX:          oNXo:,. .:llxXMMMMN0dkW\r\n" + 
					"KXWl       .;xNO'          ;XNdc;.  .;co0WWX0kkddX\r\n" + 
					"XKWO'      ':dXK;          oWKoc;... .:xOkkxkO0koO\r\n" + 
					"WKXN0l,..,:cclON0;      .;oXXdcc;,co;.  ...,lk00dd\r\n" + 
					"MWXKK0OxdocccclxKXkocclxKNN0dcc,.:xOd.      .o00ko\r\n" + 
					"MMMWXd:cccccccccldkO00OOxxocc:'. .o0d.      .lOOkl\r\n" + 
					"MMMMWOccccccccc::ccccccccccc:'.  .cx;.    ..cxOOxl\r\n" + 
					"MMMMMXdccc;,'...;cccccccccc::,.  .,,',:c::cdkOOOdk\r\n" + 
					"MMMMMMKl:cc'. .'ccccccccccccc;'''',oKNMMWNK0kxxdkN\r\n" + 
					"MMMMMMWKoccc;',:ccccccccccccc:;;,;:OMMMMMMMMWNKXWM\r\n" + 
					"MMMMMMMMNklccccccccccccccc:;,,;lxOXWMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMWNOdlc:::::::::llodx0XWMMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMWXOoc::::ldOXNWMMMMMMMMMMMM");
		   }
		public static void talkToPelican(Scanner input) {
		System.out.println("You continued to talk to the pelican.");
		System.out.println("You have missed your chance to save Dory and the not so friendly pelican ate you!!");
		//asscii art 
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWXOdllccccccclxOXWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWOl'.            ..lONMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMWMMWWKl.                  .cKMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMXc                      :XMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMWMWx.                      .dWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMWl                        cNMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMx.   ...     .   ....   .dWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMNc 'oO0Okd,.  .,okOOOo' :XMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMNc.dWMMMWWO'  'OMMMMWWd.cXMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMNd. :0NMWN0c....:0NWMW0: .oNWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWNo.  .;::,.'d0Oo'.;::;.  .oNWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMWWNKOxoc. ...dKKKXx.....:oxk0NWMMWMMWMMMM\r\n" + 
				"MMMMMMMWKKNWWWMMNo.  .,;,,;;.  .lNWWWWWNXXNWMWWMMM\r\n" + 
				"MMMMMWNd'.:ONMMMMKo,....  ....,lKWWMMW0c..oNWWMMMM\r\n" + 
				"MMWMWO;.   .:d0XWMWNX0OOkxkO0XNWWWX0x:.   .,OWMMMM\r\n" + 
				"MMMMWx..      .':lx0XWMMMMMMWX0xl:'.      ..dWMMMM\r\n" + 
				"MMMMMWKOkxxdoc;'.  .':ldkkxl;'.  .';codxxxOKNMMMMM\r\n" + 
				"MMWMMMMMMMMMMMWX0d;..    .   ..;dOXWMMMMMWWMMWMMMM\r\n" + 
				"MMMMMNOxxkOOOxol:'.. .,:cl:,.. .';ldxOOOkddONWMMMM\r\n" + 
				"MMWWWd.   ...   .,:ox0XWMMWX0ko:,.   ...   .dWMMMM\r\n" + 
				"MMWMW0c.   ..;ok0NWMMMMMMMMMMMMWN0ko:..   .:KMMMMM\r\n" + 
				"MMMMMMXo..,o0NMWMMMMMMMMMMMMMWMMMWWMW0o,..lXMMMMMM\r\n" + 
				"MMMMMMMWXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMWNKKWMMMMMMM\r\n" + 
				"MMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWNWWWWWMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWNXXNNXXXXXXXNNNNXNWNNNXXXXXNWMMMMMMMMMM\r\n" + 
				"");
		}
		public static void pretendToBeDead(Scanner input) {
		System.out.println("You have been flushed.");
		System.out.println("You are now in the sewers!");
		System.out.println("You have two options:");

		while(true) {
			// options 
			System.out.println("You can take a right ");
			System.out.println("You can take a left");
			String question = input.next();
			if (question.startsWith("right")) {
				tookARight(input);
				break;
			}
			else if (question.startsWith("left")){
				tookALeft(input);
				break;
			}
			else {
				System.out.println("try again");
				
			}
			}
		  }
		public static void tookALeft(Scanner input) {
			 System.out.println("You have ended up in the sanatation plant.");           
			System.out.println("You have inhaled too many chemicals and died!");  
			//ascii art 
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMMMMMWXOdllccccccclxOXWMMMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMMMWOl'.            ..lONMMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMWMMWWKl.                  .cKMMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMXc                      :XMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMWMWx.                      .dWMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMWl                        cNMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMx.   ...     .   ....   .dWMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMNc 'oO0Okd,.  .,okOOOo' :XMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMMNc.dWMMMWWO'  'OMMMMWWd.cXMMMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMMNd. :0NMWN0c....:0NWMW0: .oNWMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMWNo.  .;::,.'d0Oo'.;::;.  .oNWMMMMMMMMMM\r\n" + 
					"MMMMMMMMMWWNKOxoc. ...dKKKXx.....:oxk0NWMMWMMWMMMM\r\n" + 
					"MMMMMMMWKKNWWWMMNo.  .,;,,;;.  .lNWWWWWNXXNWMWWMMM\r\n" + 
					"MMMMMWNd'.:ONMMMMKo,....  ....,lKWWMMW0c..oNWWMMMM\r\n" + 
					"MMWMWO;.   .:d0XWMWNX0OOkxkO0XNWWWX0x:.   .,OWMMMM\r\n" + 
					"MMMMWx..      .':lx0XWMMMMMMWX0xl:'.      ..dWMMMM\r\n" + 
					"MMMMMWKOkxxdoc;'.  .':ldkkxl;'.  .';codxxxOKNMMMMM\r\n" + 
					"MMWMMMMMMMMMMMWX0d;..    .   ..;dOXWMMMMMWWMMWMMMM\r\n" + 
					"MMMMMNOxxkOOOxol:'.. .,:cl:,.. .';ldxOOOkddONWMMMM\r\n" + 
					"MMWWWd.   ...   .,:ox0XWMMWX0ko:,.   ...   .dWMMMM\r\n" + 
					"MMWMW0c.   ..;ok0NWMMMMMMMMMMMMWN0ko:..   .:KMMMMM\r\n" + 
					"MMMMMMXo..,o0NMWMMMMMMMMMMMMMWMMMWWMW0o,..lXMMMMMM\r\n" + 
					"MMMMMMMWXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMWNKKWMMMMMMM\r\n" + 
					"MMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWNWWWWWMMMMMMMMMM\r\n" + 
					"MMMMMMMMMMWNXXNNXXXXXXXNNNNXNWNNNXXXXXNWMMMMMMMMMM\r\n" + 
					"");
		      }
		           public static void tookARight(Scanner input) {
		        	 System.out.println("You ended up in the ocean.");           
		           	System.out.println("You have two options:");             
		           	                       
		         //while loop 
		           	while(true) {   
		           		//options
		           		System.out.println("You can talk to a whale (talk) ");             
		               	System.out.println("You can just keep swimming!!(swim)");               
		               	String question = input.next();   
		           		if (question.startsWith("talk")) {                  
		           			talkToAWhale(input);                                  
		           			break;                                           
		           		}                                                    
		           		else if (question.startsWith("swim")){             
		           			justKeepSwimming(input);                                  
		           			break;                                           
		           		}                                                    
		           		else {                                               
		           			System.out.println("try again");    
		           			
		           		}                                                    
		           		}                                                    
		                 }
		           
		           public static void justKeepSwimming(Scanner input) {
		        	   //asscii art 
		        	   System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMWKd:..     .;oONMMMMMMMM\r\n" + 
		        	   		"MMMMMMMMMMMMMMMMMMMMMMMWOdc.            .,o0WMMMMM\r\n" + 
		        	   		"MMMMMMMMMMMMMMMMMMMMMMXl.                  .:0WMMM\r\n" + 
		        	   		"MMMMMMMMMMMMMMMMMMMMMX:                      .dNMM\r\n" + 
		        	   		"MMMMMMMMMMMMMMMMMMMMWo.                       .dWM\r\n" + 
		        	   		"MMMMWKOkxxkOKNMMMMMMX;                       ..dNM\r\n" + 
		        	   		"MWKo,.      .'lONMMMX;                  .':lx0XWMM\r\n" + 
		        	   		"Xo.            .:0WMWd.                 lXWMMMMMMM\r\n" + 
		        	   		":                'OWMWKOOOOkk:...,:.    'OMMMMMMMM\r\n" + 
		        	   		"                  'OMMMMMMMMX:.'.,o. ....,0MMMMMMM\r\n" + 
		        	   		".                .'kWMMMMMMM0'.c,.l:.,..'.'kWMMMMM\r\n" + 
		        	   		"0kd;          ;k0KXWMMMMMMMM0'.ol.;l.,l'.'..:ONMMM\r\n" + 
		        	   		"MM0,          .kWMMMMMMMMMMMK, cO, :c.lk;.'. .;kNM\r\n" + 
		        	   		"MWo..  . .,..' .kWMMMMMMMMMMNl 'Ox..l;.xKc.,;.  ,x\r\n" + 
		        	   		"MWl.. .. 'l.'xc .xWMMMMMMMMMMk. l0: ,d,'OK:.:xo,..\r\n" + 
		        	   		"MWl...', 'k:.dX: ,0MMMMMMMMMMNc .kd..ox.;KK; :KNK0\r\n" + 
		        	   		"MNc.'..;..Od.;Xk':KMMMMMMMMMMMk. :d. ;0l.lNk. :XMM\r\n" + 
		        	   		"M0'.;..;..xd..kNKXMMMMMMMMMMMMX: .c' .OO..kNc  lNM\r\n" + 
		        	   		"MO,co..,..o:  oWMMMMMMMMMMMMMMWo .:. .OX; cXk. .kM\r\n" + 
		        	   		"MWNNO;;' ';. .kMMMMMMMMMMMMMMMMXxxo. ;XN: ,KX:  cN\r\n" + 
		        	   		"MMMMWNO,'o:.,kWMMMMMMMMMMMMMMMMMMMx.,OWX; :XMk. cN\r\n" + 
		        	   		"MMMMMMNO0NKOXWMMMMMMMMMMMMMMMMMMMMXkKWMX:.xWMNo'xW\r\n" + 
		        	   		"\r\n" + 
		        	   		"");
		          	 System.out.println("You have ran into a jellyfish feild.");           
		             	System.out.println("You have two options:");             
		             	           
		             	//while loop 
		             	while(true) {     
		             		System.out.println("You can swim over it(over)");             
		                 	System.out.println("You can test your luck and swim through the jellyfish feild(through)");               
		                 	String question = input.next();   
		             		if (question.startsWith("over")) {                  
		             			swimOverIt(input);                                  
		             			break;                                           
		             		}                                                    
		             		else if (question.startsWith("through")){             
		             			 swimThroughIt(input);                                  
		             			break;                                           
		             		}                                                    
		             		else {                                               
		             			System.out.println("try again");    
		             			
		             		}                                                    
		             		}                                                    
		                   }
		           public static void swimOverIt(Scanner input) {
		        	   // output
		            	 System.out.println("You chose to swim over the jelly fish feild.");           
		               	System.out.println("You almost made it but, a fishermen saw you swimming by and thought you would look good in his fish tank at home!");             
		               	System.out.println("You didn't save Dory!");                                                    
		                     }
		           public static void swimThroughIt(Scanner input) {
		            	 System.out.println("You chose to test your luck and go through the jellyfish feild.");           
		               	System.out.println("You didnt have enough luck!");             
		               	System.out.println("You got stung one too many times and you died ");             
		               	     }
		           public static void talkToAWhale(Scanner input) {
		            	 System.out.println("You have a conversation with a blue whale."); 
		            	 //asscii art 
		            	 System.out.println("MMMMWKkkkOXWWWNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMW0xdxxkXN0kkkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMWX0Odd0OdxxkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMMMMWKkkkOXNWWMMMMMMMMMMMMMMMWWWWMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMMMWNKOxxkkkOO00KNWMMMMMMMMWN0dccoONMMWMMWWWMM\r\n" + 
		            	 		"WMMWN0kdol;,;:::::;;:codkO0NWWWWWW0;'''dNN0kdoodkK\r\n" + 
		            	 		"MWKkolllll:;:::::::;;;;;;,;cd0NMMMO;''.;ol,...,ok0\r\n" + 
		            	 		"NOolollllcccc::::::;;;;;;;;,,;oKWWXo,''......;OWMM\r\n" + 
		            	 		"kloolllllccccc:::::;;;;;,,;,,,':ONMNk;'...',l0WMMM\r\n" + 
		            	 		"ooooolllcccccc:::::;;;;;,,,,,,,';oO0d,..'l0XWMMMMM\r\n" + 
		            	 		"looollllcccccc:::::;;;;;;,,,,,,''',,''..:KMMMMMMMM\r\n" + 
		            	 		"loooolc,..;cc::::::;;;;;;;,,,,,,,'''''.;OWMMMMMMMM\r\n" + 
		            	 		"ooolooc;'';cccc::::;;;;;;,,,,,,''''''':0WMMMMMMMMM\r\n" + 
		            	 		"xlllccllcccccc:::::;;;;;,,,,,,,''''';dKWMMMMMMMMMM\r\n" + 
		            	 		"Nxcccllllcccc:;::::;;;;;,,,,,,,,',:d0WWWMMMMMMMMMM\r\n" + 
		            	 		"MWKkdlllclccc;:::::;;;;;;;,,,,;cdONMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMWNKOxxollc:;:c:::;;clooodk0XNMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMMWWWNXKK0ko::::;l0NWWMMMMMWMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMMMMMMMWMMMN0dl:;:dXMMMMMMMWMMMMMMMMMMMMMMMMMM\r\n" + 
		            	 		"MMMMMMMMMMMMMMMMMWXko:,xWMMMMMMMMMMMMMMMMMMWNNNNNN\r\n" + 
		            	 		"");
		            	 System.out.println("The blue whale tells you that Dory isnt far from you!Infact do you see that bouy over there? She's not to far from there he says!."); 
		               	System.out.println("You have two options:");             
		               	                          
		               	while(true) {            
		               		System.out.println("You can swim over to the bouy and trust the whale (swim)");             
		                   	System.out.println("You can continue to talk to the whale to get more infromation(talk)");               
		                   	String question = input.next();
		                   	// if statements  
		               		if (question.startsWith("swim")) {                  
		               			youTrustTheWhale(input);                                  
		               			break;                                           
		               		}                                                    
		               		else if (question.startsWith("talk")){             
		               			continueToTalkToWhale(input);                                  
		               			break;                                           
		               		}                                                    
		               		else {                                               
		               			System.out.println("try again"); 
		               			continue;
		               		}                                                    
		               		}                                                    
		                     }
		           public static void continueToTalkToWhale(Scanner input) {
		        	   //story output
		          	 System.out.println("You have and the blue whale have a good conversation."); 
		          	 System.out.println("The blue whale tells you that Dory is on the east side of the bouy."); 
		             	System.out.println("Right as you begin to swim over that way to find Dory she gets taken by a boat. ");             
		             	System.out.println("You have lost your chance to get Dory!  "); 
		             	
		             	                                                   
		                   }
		           public static void youTrustTheWhale(Scanner input) {
		          	 System.out.println("You have trusted the whale!"); 
		          	 System.out.println("You get to Dory just in time to get her away from the fishermens boat!"); 
		             	System.out.println("You have saved Dory and win cogragulations");
		             	System.out.println("MMMMMMMMMN0kkOKX0koc;,;:ldkXWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMMMMMNx::;,:c,.......   'oKWMMMMMMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMMMMM0lccc:::;::cccc:;,'..,kWMMMMMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMMMWKo:ccccccccccccccccc:,..oNMMMMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMNKx:,;ccccccc::::c::;;:cc;..lXMMMMMMMMMMMMMMMM\r\n" + 
		             			"MWKOkOkkxo::ccc::ok0XXX0kdo::c:..;OWMMMMMMMMMMMMMM\r\n" + 
		             			"W0kKNKxooddlcc:oKN0dlclxKNNKo:c;. ,dKWMMMMMMMMMMMM\r\n" + 
		             			"KONXo.    .cc:xNKc.     .,oXNxc:' .;cxXMMMMMMMMWWM\r\n" + 
		             			"0KWd.      .:oXX:          oNXo:,. .:llxXMMMMN0dkW\r\n" + 
		             			"KXWl       .;xNO'          ;XNdc;.  .;co0WWX0kkddX\r\n" + 
		             			"XKWO'      ':dXK;          oWKoc;... .:xOkkxkO0koO\r\n" + 
		             			"WKXN0l,..,:cclON0;      .;oXXdcc;,co;.  ...,lk00dd\r\n" + 
		             			"MWXKK0OxdocccclxKXkocclxKNN0dcc,.:xOd.      .o00ko\r\n" + 
		             			"MMMWXd:cccccccccldkO00OOxxocc:'. .o0d.      .lOOkl\r\n" + 
		             			"MMMMWOccccccccc::ccccccccccc:'.  .cx;.    ..cxOOxl\r\n" + 
		             			"MMMMMXdccc;,'...;cccccccccc::,.  .,,',:c::cdkOOOdk\r\n" + 
		             			"MMMMMMKl:cc'. .'ccccccccccccc;'''',oKNMMWNK0kxxdkN\r\n" + 
		             			"MMMMMMWKoccc;',:ccccccccccccc:;;,;:OMMMMMMMMWNKXWM\r\n" + 
		             			"MMMMMMMMNklccccccccccccccc:;,,;lxOXWMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMMMMMMWNOdlc:::::::::llodx0XWMMMMMMMMMMMMMMMMMM\r\n" + 
		             			"MMMMMMMMMMMMWXOoc::::ldOXNWMMMMMMMMMMMM");
		             	                              
		                   }

	}

}
