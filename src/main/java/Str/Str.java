import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Str {

    public static void main(String[] args) throws Exception {


        ArrayList<String> arr = new ArrayList<String>();


        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = file.readLine()) != null) {
            arr.add(line);
        }
        file.close();


        ArrayList<String> arr2 = new ArrayList<String>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int b = 1;
        while (arr.size() > 0) {

            for (int j = 1; j < arr.size(); ) {
                if (arr.get(0).equals(arr.get(j))) {

                    b++;
                    arr.remove(j);
                } else {
                    j++;
                }
            }
            arr2.add(arr.get(0));
            arr3.add(b);

            arr.remove(arr.get(0));

            b = 1;
        }


        for (int i = arr3.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr3.get(j) < arr3.get(j + 1)) {
                    int tmp;
                    tmp = arr3.get(j);
                    arr3.set(j, arr3.get(j + 1));
                    arr3.set(j + 1, tmp);


                    String tmp2;
                    tmp2 = arr2.get(j);
                    arr2.set(j, arr2.get(j + 1));
                    arr2.set(j + 1, tmp2);


                }


            }
        }


        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr3.get(i) + " " + arr2.get(i));
        }
    }

}