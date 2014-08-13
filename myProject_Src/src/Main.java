// Автор: Стаценко Владимир
// http://www.vova-prog.narod.ru

import tools.utils.*;
public class Main {
    
    public Main() {
    }
    
    public static void main(String[] args) {
        Class1 c1 = new Class1("Hi");
        Class2 c2 = new Class2("Hello");
        System.out.println(c1.showMes());
        System.out.println(c2.showMes());
    }
    
}
