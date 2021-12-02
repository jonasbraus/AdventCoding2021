import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Door1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Data1.txt"));
        List<String> list = new ArrayList<String>();

        String line;
        while((line = bufferedReader.readLine()) != null)
        {
            list.add(line);
        }

        int[] lines = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            lines[i] = Integer.parseInt(list.get(i));
        }

        int count = 0;

        for(int i = 0; i < lines.length; i++)
        {
            if(i < lines.length - 3)
            {
                if(lines[i + 1] + lines[i + 2] + lines[i + 3] > lines[i] + lines[i + 1] + lines[i + 2])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}