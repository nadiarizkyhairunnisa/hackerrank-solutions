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
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean meet = false;
        String result = null;
        
        int kangA = x1 + v1;
        int kangB = x2 + v2;
        int temp = 0;
        
        if(x1 >= 0 && x2 >= 0 && x1 <= 10000 && x2 <= 10000)
        {
            if((x2 > x1 && v2 >= v1) | (x1 > x2 && v1 >= v2))
            {
                meet = false;
            }
            else {
                while(meet == false && temp < 10000)
                {
                    if(kangA == kangB)
                    {
                        meet = true;
                    }
                    kangA += v1;
                    kangB += v2;
                    temp++;
                }
            }
            
            if(temp>10000)
            {
                meet = false;
            }
        }
        
        if(meet == false)
        {
            result = "NO";
        }
        else 
        {
            result = "YES";
        }
    return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
