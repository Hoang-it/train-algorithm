import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;

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

    public static void bt3(String input){
        List<StringBuilder> words = new ArrayList<>();
        int countWord = -1;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))){
                StringBuilder newWord = new StringBuilder();
                newWord.append(input.charAt(i));
                words.add(newWord);
                countWord++;
            } else {
                words.get(countWord).append(input.charAt(i));
            }
        }
        System.out.println(words);
        List<String> output = new ArrayList<>();
        for (int j = 0; j < words.size(); j++) {
            StringBuilder word = words.get(j);
            StringBuilder digit = new StringBuilder();
            boolean canAdd = true;

            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))){
                    digit.append(word.charAt(i));
                    for (int k = i+1; k < word.length(); k++) {
                        if (!Character.isDigit(word.charAt(k))) {
                            canAdd = false;
                            break;
                        }
                    }
                }
            }
            if (digit.length() != 0) output.add(word.toString().replace(digit, ""));
            if (canAdd && digit.length() != 0) output.add(digit.toString());
        }
        System.out.println(output);
    }

    public static void bt4(String input){
        Gson gson = new Gson();
        Conference conference = gson.fromJson(input, Conference.class);
        System.out.println(conference);
    }
    public static void main(String[] args) {
        System.out.println("[TMA] train algorithm");
//        bt1("BuHf7GauEo2521xdrP2ffR8LuMJi123906kly4HW123.00ef5Vp4PZN1653548.90568bv0qxDg8OC0001016275o7GhjVzDzy8oqcyELRcEu053sqYGKPJIkvNF8mz4KV9K9Amo");
        bt3("He5lloT4oTheXWo7rldFor1000Tim8es");
        String json = "{\n" +
                "    \"ConferenceId\": \"abcdsad123124415516aqqxcdeycxzasdq21234sedq13fsdxcWNsxdZXCQdsqe\", \n" +
                "    \"CallId\": \"e842xz1c21-c31sd3-12775c\",\n" +
                "    \"CallStartDate\": \"2021-09-09\",\n" +
                "    \"CallEndDate\": \"2021-09-09\",\n" +
                "    \"connectionTime\" :[\n" +
                "        {\n" +
                "            \"ParticipantId\": \"e91dad88-52b7-8188-b9655s\",\n" +
                "            \"ConnectionTime\": \"2021-09-09\"\n" +
                "        }\n" +
                "    ]\n" +
                "    \n" +
                "}";
//        bt4(json);
    }
}
