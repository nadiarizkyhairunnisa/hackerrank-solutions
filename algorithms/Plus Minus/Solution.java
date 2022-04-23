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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float temp_positive = 0;
        float temp_negative = 0;
        float temp_zero = 0;
        
        for(int idx = 0; idx < arr.size(); idx++){
            if (arr.get(idx) > 0){
                temp_positive++;
            } else if (arr.get(idx) < 0){
                temp_negative++;
            } else {
                temp_zero++;
            }
        }
        System.out.println(String.format("%.6f", temp_positive/arr.size()));
        System.out.println(String.format("%.6f", temp_negative/arr.size()));
        System.out.println(String.format("%.6f", temp_zero/arr.size()));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
