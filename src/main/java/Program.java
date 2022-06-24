import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void bt1(String input){
        List<Double> matches = new ArrayList<>();
        StringBuilder match = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i);

                if (current >= 48){
                    if (current <= 57) {
                        if (match == null) match = new StringBuilder();
                        match.append((char) current);
                        continue;
                    }
                }
                if (current == 46){
                    if (match != null){
                        match.append((char) current);
                        continue;
                    }

                }
                if (match != null && match.length() != 0) matches.add(Double.parseDouble(match.toString()));
                match = null;
        }
        if (match != null) matches.add(Double.parseDouble(match.toString()));
        System.out.println(Collections.max(matches));

    }
    public static void bt2(int input){
        String pattern = "#@";
        StringBuilder output = new StringBuilder();

        int index = 0;
        System.out.println("*");
        if (input == 1) return;
        for (int i = 0; i < input; i++, index++) {
            if (index == -1){
                output.append("*");
                index=0;
                i++;
            }
            if (index == 0){
                output.insert(0, "*");
                output.append("#");
                index++;
                System.out.println(output);
                continue;
            }

            if (index == 3){
                index =-2;
                output.deleteCharAt(0);
                System.out.println(output);
                continue;
            }
            output.append(pattern.charAt(index-1));
            System.out.println(output);

        }
    }
    public static void main(String[] args) {
        System.out.println("[TMA] train algorithm");
//        bt1("BuHf7GauEo2521xdrP2ffR8LuMJi123906kly4HW123.00ef5Vp4PZN1653548.90568bv0qxDg8OC0001016275o7GhjVzDzy8oqcyELRcEu053sqYGKPJIkvNF8mz4KV9K9Amo");
            bt2(7);
    }
}
