// Автор: Стаценко Владимир
// http://www.vova-prog.narod.ru

package tools.utils;

public class Class2 {
    
    private String text = "";

    public Class2(String text) {
        if(text != null) {
            this.text = text;
        }
    }
    
    public String showMes() {
        if(text.equals("")) {
            return "Class2: no message";
        }
        return "Class2: " + text;
    }
}
