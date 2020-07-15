package Automation.sonarTest;

/**
 * Hello world!
 *
 */
public class App {
    
	public void m1( String args )
    {
        System.out.println("Hello " + args);
    }
    
	public void m2( int age )
    {
    	if (age<18) {
    		System.out.println("Hello Teen");	
		}
        
    }
    
	public void m3( int age )
    {
    	if (age<18) {
    		System.out.println("Hello Teen");	
		}else {
			System.out.println("Hello Adult");			
		}
        
    }
}
