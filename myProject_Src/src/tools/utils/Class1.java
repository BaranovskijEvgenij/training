// Автор: Стаценко Владимир
// http://www.vova-prog.narod.ru

package tools.utils;

public class Class1 {
    
    private String text = "";

    public Class1(String text) {
        if(text != null) {
            this.text = text;
        }
    }
    
    public String showMes() {
        if(text.equals("")) {
            return "Class1: no message";
        }
        return "Class1: " + text;
    }
}
