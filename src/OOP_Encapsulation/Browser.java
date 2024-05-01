package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdatedAvailable();
		System.out.println();
		System.out.println("browser is launched");
	}
	
	private void checkBrowserVersion() {
		System.out.println("check Browser Version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("check browser with OS Compatibility");
	}
	
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}
	
	private void checkUpdatedAvailable() {
		System.out.println("checkUpdatedAvailable");
	}
}
