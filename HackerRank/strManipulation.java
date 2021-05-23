/*
Link: https://www.hackerrank.com/competitions/celebrate-asian-pacific-american-heritage-month-2021-coding-contest
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'canBeEqualized' function below.
     *
     * The function is expected to return a STRING_ARRAY. The function accepts
     * following parameters: 1. STRING_ARRAY firstStrings 2. STRING_ARRAY
     * secondStrings
     */

    public static List<String> canBeEqualized(List<String> firstStrings, List<String> secondStrings) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < firstStrings.size(); i++) {
            boolean flag = false;
            char[] mstr1 = firstStrings.get(i).toCharArray();
            char[] mstr2 = secondStrings.get(i).toCharArray();

            for(int j=0; j<mstr1.length && flag!=true; j++){
                if(mstr1[j] != mstr2[j]){
                    String str = String.valueOf(mstr1);
                    mstr1 = String.valueOf(mstr1).replace(mstr1[j], mstr2[j]).toCharArray();
                    if(String.valueOf(mstr1).equals(String.valueOf(mstr2))) flag = true;
                    else mstr1 = str.toCharArray();
                }
            }
            
            mstr1 = firstStrings.get(i).toCharArray();
            mstr2 = secondStrings.get(i).toCharArray();
            
            for(int j=0; j<(mstr1.length) && flag!=true; j++){
                if(mstr1[j] != mstr2[j]){
                    String str = String.valueOf(mstr2);
                    mstr2 = String.valueOf(mstr2).replace(mstr2[j],mstr1[j]).toCharArray();
                    if(String.valueOf(mstr1).equals(String.valueOf(mstr2))) flag = true;
                    else mstr2 = str.toCharArray();
                }
            }
            if(flag == true) result.add("YES");
            else result.add("NO");
        }
        return result;
    }
}

public class strManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int firstStringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> firstStrings = IntStream.range(0, firstStringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        int secondStringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> secondStrings = IntStream.range(0, secondStringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        List<String> result = Result.canBeEqualized(firstStrings, secondStrings);

        bufferedWriter.write(result.stream().collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
