package world_of_titan;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tester {

    public static void main(String[] args) {
        // Test codes in this main class
        FriendList friendList = new FriendList();
        Scouting scouting = new Scouting();
        SoldierArrange soldierArrange = new SoldierArrange();
        Titan titan = new Titan();
        
        // Load data from data.txt
        try {
            Scanner read = new Scanner(new FileInputStream("data.txt"));
            while (read.hasNextLine()) {
                String input = read.nextLine();
                String[] inputList = input.split(" ");
                int[] numberList = new int[inputList.length];
                
                for (int i = 0; i < numberList.length; i++)
                    numberList[i] = Integer.parseInt(inputList[i]);
                
                int[] values = new int[numberList.length-2];
                System.arraycopy(numberList, 2, values, 0, numberList.length-2);
                
                scouting.mapNode(numberList[0], numberList[1], values);
            }
            
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        System.out.println(scouting.toString());
    }

}
