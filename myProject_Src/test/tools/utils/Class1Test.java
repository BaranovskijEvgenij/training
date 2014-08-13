// Автор: Стаценко Владимир
// http://www.vova-prog.narod.ru

package tools.utils;

import junit.framework.*;

public class Class1Test extends TestCase {
    
    public Class1Test(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Class1Test.class);
        
        return suite;
    }

    public void testShowMes() {
        System.out.println("showMes");
        
        Class1 c = new Class1("Hi!");
        assertTrue(c.showMes().equals("Class1: Hi!"));
    }
}
