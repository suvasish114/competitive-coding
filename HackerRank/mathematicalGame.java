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
     * Complete the 'getScoreDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numSeq as parameter.
     */

    public static int getScoreDifference(List<Integer> numSeq) {
        // Write your code here
        int first_player=0, second_playr=0;
        for(int i=0; i<numSeq.size(); i++){
            if(i%2==0){
                first_player += numSeq.get(i);
                if(numSeq.get(i)%2 == 0){
                    Collections.reverse(numSeq.subList(i+1, numSeq.size()));
                }
            }
            else{
                second_playr += numSeq.get(i);
                if(numSeq.get(i)%2 == 0){
                    Collections.reverse(numSeq.subList(i+1, numSeq.size()));
                }
            }
        }
        return Math.abs(first_player - second_playr);
    }
}

public class mathematicalGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numSeqCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numSeq = IntStream.range(0, numSeqCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.getScoreDifference(numSeq);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
