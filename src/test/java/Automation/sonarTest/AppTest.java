package Automation.sonarTest;

import org.junit.Test;

public class AppTest{

	@Test
	public void t1_test() {
		App o = new App();
		o.m1("Shailendra");
	}

	@Test
	public void t2_test() {
		App o = new App();
		o.m2(17);
		o.m2(19);
	}
	
	//@Test
	public void t3_test() {
		App o = new App();
		//o.m3(17);
		o.m3(19);
		o.getDataFromDB();
	}
}
