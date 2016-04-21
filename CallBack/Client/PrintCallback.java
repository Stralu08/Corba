package client;

import cb.*;

/**
* Ein Callback, der den String in the Parametern ausgibt
* @author Lukas Straessler
*/

public class PrintCallback extends CallBackPOA {
	
	@Override
	public void call_back(java.lang.String mesg){
		System.out.println(mesg);
	}
}