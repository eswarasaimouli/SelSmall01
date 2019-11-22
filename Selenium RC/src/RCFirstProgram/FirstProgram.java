package RCFirstProgram;

import com.thoughtworks.selenium.DefaultSelenium;

public class FirstProgram {

	public static void main(String[] args) {
		
		DefaultSelenium X2 = new DefaultSelenium("localhost", 4444, 
				"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "https://");
		
		X2.start();
		X2.windowMaximize(); 
		X2.open("https://facebook.com");
		X2.type("id=email", "eswarasaimoui");
		X2.type("id=pass", "Mouli007");
		X2.click("id=u_0_a");
		
		
	}

}
