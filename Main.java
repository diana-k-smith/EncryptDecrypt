import javax.swing.JOptionPane;

public class Main {
public static void main(String[]args){
	/* Initializing variables */
	String Encrypt;
	String Decrypt;
	int EnLength;
	int DeLength;
	int counteri;
	/* Asking whether its going to be encrypted or decrypted */
	String Answer = JOptionPane.showInputDialog("Would you like to encrypt or decrypt text");
	if (Answer.equalsIgnoreCase("Encrypt"))
	{
	/* Asking what string is to be encrypted */
	Encrypt = JOptionPane.showInputDialog(null, "What would you like to Encrypt?");
	/* Getting the length of the string for the loop*/
	EnLength = Encrypt.length(); 
	/* Starting the loop */
	for(counteri = 0; counteri < EnLength; counteri++){
		char character = Encrypt.charAt(counteri); /* starting at the first character */
		int ascii = (int) character; /* converting first character*/
		/* doing the math using counteri as subtracted */
		int asciiValue = ascii; 
		int nAscii = asciiValue - counteri; 
		//System.out.println(nAscii);
		/* converting back to characters from ascii & printing it*/
		System.out.println((char)nAscii);
	} 
	} else if (Answer.equalsIgnoreCase("Decrypt"))
	{ 
		Decrypt = JOptionPane.showInputDialog(null, "What would you like to Decrypt?");
		DeLength = Decrypt.length();
		for(counteri = 0; counteri < DeLength; counteri++ ){
			// start out with the nAscii
			char character = Decrypt.charAt(counteri); //starting at first charactor//
			int ascii = (int) character; //converts ascii from charactor
			// add counter to NAscii
			int asciiValue = ascii;
			int nAscii = asciiValue + counteri;
			//Convert nAscii into Charactor
			System.out.print((char)nAscii);
		
		
		}
	}
}
}
