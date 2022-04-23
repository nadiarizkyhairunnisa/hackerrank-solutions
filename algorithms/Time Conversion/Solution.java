import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String timeConversion(String s) throws ParseException{
        // Input date format
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
       
        // Output date format
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";
       
        // Converting the input (String s) to Date format
        time = dateFormat.parse(s);
       
        // Changing the format of date from 12-Hour to 24-Hour and store it in String output
        output = format.format(time);
        
        return output;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
