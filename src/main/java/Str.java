import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Str {
    public static void main(String[] args) throws Exception {
        BufferedReader file = new BufferedReader(new FileReader("C:\\training\\src\\main\\java\\text.txt"));

        /*for(int i=0;i<file.read();i++){
            String line = file.readLine();
            System.out.println(line);
        }*/

    ArrayList<String> arr= new ArrayList<String>();

        for(int i=0;i<file.read();i++){
            String line = file.readLine();
            arr.add(line);
        }

            System.out.println(arr);
        int q=0;
        int w=0;
        for(int j=0; j<arr.size();j++) {
            for (int i = 0; i < arr.size()-1; i++) {
                if (arr.get(i).equals(arr.get(i + 1))) {
                   q+=1;
                    arr.remove(i);


                } else {
                    w += 1;

                    String tmp = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, tmp);

                }
            }
        }
        System.out.println();
        System.out.println(arr);
        System.out.println("Повторений было"+":"+ q);
        System.out.println("Уникальных пар"+":"+w);
    }
}
