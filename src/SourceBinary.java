


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SourceBinary {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(new File("C:\\Users\\Abdifatah M Ibrahim\\Documents\\quranText.txt"));
            List<String> lines = new ArrayList<String>();

            //parsing the Qur'an into an ArrayList of Strings: lines(Verses)
            while (sc.hasNextLine())
            {
                lines.add(sc.nextLine());
            }

            //Dump the ArrayList:Lines into an Array of Strings: arr[]
            String[] arr = lines.toArray(new String[0]);

            try {

                //arr2[] initialized to same length as arr[]
                String[] arr2 = new String[arr.length];
                String aa = "";

                //Changing the Verse|Lines to into non-spaced String
                for(int i = 0; i < arr.length; i++)
                {
                    aa = "";
                    for(int x = 0; x <= (arr[i].length())-1; x++)
                    {
                        if(arr[i].charAt(x) == ' ')
                        {
                            //skip if its a space
                        }
                        else
                        {
                            //add the character to the String aa
                            aa += Character.toString(arr[i].charAt(x));
                        }
                    }
                    //Add the non spaced string to the arr2[]
                    arr2[i] = aa;
                }

                System.out.println("arr2 length " + arr2.length);

                int result = 0, num = 0, z = 0;

                //what does this for loop do?
                for(int i = 0; i < arr2.length; i++)
                {
                    //where is num coming from?
                    if(num >= 534)
                    {
                        result = i;
                        break;
                    }
                        else
                        {
                            z = 0;
                            for(int x = 0; x <= (arr2[i].length())-1; x++)
                                {
                                    z=z+1;
                                }
                        num = num + z;
                        }
                }

            System.out.println("result2  = " + result);

            } catch (Exception ex)
                {
                    //catch errors
                }
        } catch (FileNotFoundException e)
             {
                e.printStackTrace();
             }

    }//Main

}//End SourceBinary
