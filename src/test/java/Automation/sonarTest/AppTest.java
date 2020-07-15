package Automation.sonarTest;

import org.testng.annotations.Test;

public class AppTest {

	@Test
	private void t1() {
		App o = new App();
		o.m1("Shailendra");
	}
	
	@Test
	private void t2() {
		App o = new App();
		o.m2(18);
	}
}
