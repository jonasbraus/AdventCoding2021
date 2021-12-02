import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Door2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Data2.txt"));
        List<String> list = new ArrayList<String>();

        String line;
        while((line = bufferedReader.readLine()) != null)
        {
            list.add(line);
        }

        int forward = 0;
        int depth = 0;
        int aim = 0;

        int value = 0;

        for(String s : list)
        {
            value = Integer.parseInt(s.split(" ")[1]);

            if(s.startsWith("forward"))
            {
                forward += value;
                depth += value * aim;
            }
            if(s.startsWith("down"))
            {
                aim += value;
            }
            if(s.startsWith("up"))
            {
                aim -= value;
            }
        }

        System.out.println(forward * depth);
    }
}
