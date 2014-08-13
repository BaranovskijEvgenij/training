// Автор: Стаценко Владимир
// http://www.vova-prog.narod.ru

package tools.utils;

import junit.framework.*;

public class Class2Test extends TestCase {
    
    public Class2Test(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Class2Test.class);
        
        return suite;
    }

    public void testShowMes() {
        System.out.println("showMes");
        
        Class2 c = new Class2("Hi!");
        assertTrue(c.showMes().equals("Class2: Hi!"));
    }
}
