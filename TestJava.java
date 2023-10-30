package testjava;
import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose task: 1 - 'Repetitions' or 2 - 'Interviews'");
        String k = in.nextLine();
        if (k.equals("1")){
            String s = in.nextLine();
            int n = in.nextInt(), i = 0;
            do {
                System.out.println(s);
                i++;
            }
            while (i < n);
        }
        else if (k.equals("2")) {
            boolean flag = true;
            int i;
            String razS = in.next(), litrovS = in.next();
            for (i = 0; i < razS.length() && flag; i++) 
                flag = (razS.charAt(i) >= '0' && razS.charAt(i) <= '9');
            for (i = 0; i < litrovS.length() && flag; i++) 
                flag = (litrovS.charAt(i) >= '0' && litrovS.charAt(i) <= '9');
            if (flag) {
                int raz = Integer.parseInt (razS), litrov = Integer.parseInt (litrovS);
                int week = raz * litrov, now = week;
                for (i = 1; i < 17; i++) {
                    System.out.printf("%d liters will be drunk by week %d\n", now, i);
                    now += week;
                }    
                if (now >= 120) System.out.println("Welcome to IT-club");
                else System.out.println("Unfortunately, student didn't pass the main test");
            }
            else System.out.println("Incorrect data");
        }
        else System.out.println("We haven't figured out with such a task yet");
    }
}
