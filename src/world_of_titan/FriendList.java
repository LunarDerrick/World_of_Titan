package world_of_titan;

import java.io.*; // FileInputStream, FileNotFoundException
import java.util.Scanner;

public class FriendList {

    private java.util.LinkedList<Allies> list = new java.util.LinkedList();
    private String[] Name;
    private int[] Strength, Agility, Intelligence, Coordination, Leadership;

    /**
     * loadAllies(String filename): reads a .txt file to initialize a map for
     * various uses.
     *
     * this function should be invoked as early as possible, as a lot of
     * functions rely on map data.
     *
     * @param filename: name of the .txt file, case sensitive
     */
    public void loadAllies(String filename) {
        Scanner s = new Scanner(System.in);
        try {
            Scanner in = new Scanner(new FileInputStream(filename));
            while (in.hasNextLine()) {
                System.out.print("Enter name: ");
                String name = in.nextLine();
                System.out.println(name);
                if (name.isBlank()) {
                    break;
                }
                System.out.print("Enter characteristics: ");
                String c1 = in.nextLine();
                System.out.println(c1);
                System.out.println();
                String[] c2 = c1.split(" ");
                Integer[] c3 = new Integer[7];
                for (int i = 0; i < c2.length; i++) {
                    c3[i] = Integer.parseInt(c2[i]);
                }
                Allies allie = new Allies(name, c3[0], c3[1], c3[2], c3[3], c3[4], c3[5], c3[6]);
                list.add(allie);
                System.out.println(allie.toString());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    /**
     * sortAttribute(): accepts a String and prints every ally's matching
     * attribute in a descending order.
     */
    public void sortAttribute() {
        convert();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Sorting attribute: ");
            String attr = s.nextLine();
            if (attr.isBlank()) {
                break;
            } else {
                System.out.println();
                
                    if(attr.equalsIgnoreCase("strength")){
                        for (int i = 0; i < list.size(); i++) {
                            for (int j = 0; j < list.size() - 1; j++) {
                                if (Strength[j] > Strength[j + 1]) {
                                    int hold1 = Strength[j];
                                    Strength[j] = Strength[j + 1];
                                    Strength[j + 1] = hold1;
                                    int hold2 = Agility[j];
                                    Agility[j] = Agility[j + 1];
                                    Agility[j + 1] = hold2;
                                    int hold3 = Intelligence[j];
                                    Intelligence[j] = Intelligence[j + 1];
                                    Intelligence[j + 1] = hold3;
                                    int hold4 = Coordination[j];
                                    Coordination[j] = Coordination[j + 1];
                                    Coordination[j + 1] = hold4;
                                    int hold5 = Leadership[j];
                                    Leadership[j] = Leadership[j + 1];
                                    Leadership[j + 1] = hold5;
                                    String hold6 = Name[j];
                                    Name[j] = Name[j + 1];
                                    Name[j + 1] = hold6;
                                }
                            }
                        }
                    
                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(Name[i] + " " + Strength[i]);
                        }
                        System.out.println();

                        break;
                    }
                        if(attr.equalsIgnoreCase("agility")){
                        for (int i = 0; i < list.size(); i++) {
                            for (int j = 0; j < list.size() - 1; j++) {
                                if (Agility[j] > Agility[j + 1]) {
                                    int hold1 = Strength[j];
                                    Strength[j] = Strength[j + 1];
                                    Strength[j + 1] = hold1;
                                    int hold2 = Agility[j];
                                    Agility[j] = Agility[j + 1];
                                    Agility[j + 1] = hold2;
                                    int hold3 = Intelligence[j];
                                    Intelligence[j] = Intelligence[j + 1];
                                    Intelligence[j + 1] = hold3;
                                    int hold4 = Coordination[j];
                                    Coordination[j] = Coordination[j + 1];
                                    Coordination[j + 1] = hold4;
                                    int hold5 = Leadership[j];
                                    Leadership[j] = Leadership[j + 1];
                                    Leadership[j + 1] = hold5;
                                    String hold6 = Name[j];
                                    Name[j] = Name[j + 1];
                                    Name[j + 1] = hold6;
                                }
                            }
                        }

                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(Name[i] + " " + Agility[i]);
                        }
                        System.out.println("");
                        
                        break;
                        }
                    if(attr.equalsIgnoreCase("intelligence")){
                        for (int i = 0; i < list.size(); i++) {
                            for (int j = 0; j < list.size() - 1; j++) {
                                if (Intelligence[j] > Intelligence[j + 1]) {
                                    int hold1 = Strength[j];
                                    Strength[j] = Strength[j + 1];
                                    Strength[j + 1] = hold1;
                                    int hold2 = Agility[j];
                                    Agility[j] = Agility[j + 1];
                                    Agility[j + 1] = hold2;
                                    int hold3 = Intelligence[j];
                                    Intelligence[j] = Intelligence[j + 1];
                                    Intelligence[j + 1] = hold3;
                                    int hold4 = Coordination[j];
                                    Coordination[j] = Coordination[j + 1];
                                    Coordination[j + 1] = hold4;
                                    int hold5 = Leadership[j];
                                    Leadership[j] = Leadership[j + 1];
                                    Leadership[j + 1] = hold5;
                                    String hold6 = Name[j];
                                    Name[j] = Name[j + 1];
                                    Name[j + 1] = hold6;
                                }
                            }
                        }

                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(Name[i] + " " + Intelligence[i]);
                        }
                        System.out.println();
                    
                        break;
                    }
                    if(attr.equalsIgnoreCase("coordination")){
                        for (int i = 0; i < list.size(); i++) {
                            for (int j = 0; j < list.size() - 1; j++) {
                                if (Coordination[j] > Coordination[j + 1]) {
                                    int hold1 = Strength[j];
                                    Strength[j] = Strength[j + 1];
                                    Strength[j + 1] = hold1;
                                    int hold2 = Agility[j];
                                    Agility[j] = Agility[j + 1];
                                    Agility[j + 1] = hold2;
                                    int hold3 = Intelligence[j];
                                    Intelligence[j] = Intelligence[j + 1];
                                    Intelligence[j + 1] = hold3;
                                    int hold4 = Coordination[j];
                                    Coordination[j] = Coordination[j + 1];
                                    Coordination[j + 1] = hold4;
                                    int hold5 = Leadership[j];
                                    Leadership[j] = Leadership[j + 1];
                                    Leadership[j + 1] = hold5;
                                    String hold6 = Name[j];
                                    Name[j] = Name[j + 1];
                                    Name[j + 1] = hold6;
                                }
                            }
                        }

                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(Name[i] + " " + Coordination[i]);
                        }
                        System.out.println();
                    
                        break;
                    }
                    if(attr.equalsIgnoreCase("leadership")){
                        for (int i = 0; i < list.size(); i++) {
                            for (int j = 0; j < list.size() - 1; j++) {
                                if (Leadership[j] > Leadership[j + 1]) {
                                    int hold1 = Strength[j];
                                    Strength[j] = Strength[j + 1];
                                    Strength[j + 1] = hold1;
                                    int hold2 = Agility[j];
                                    Agility[j] = Agility[j + 1];
                                    Agility[j + 1] = hold2;
                                    int hold3 = Intelligence[j];
                                    Intelligence[j] = Intelligence[j + 1];
                                    Intelligence[j + 1] = hold3;
                                    int hold4 = Coordination[j];
                                    Coordination[j] = Coordination[j + 1];
                                    Coordination[j + 1] = hold4;
                                    int hold5 = Leadership[j];
                                    Leadership[j] = Leadership[j + 1];
                                    Leadership[j + 1] = hold5;
                                    String hold6 = Name[j];
                                    Name[j] = Name[j + 1];
                                    Name[j + 1] = hold6;
                                }
                            }
                        }

                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(Name[i] + " " + Leadership[i]);
                        }
                        System.out.println();
                    
                        break;
                    }
                        else{
                       System.out.println("Error");
                    }
                }
            }
        }
    

    /**
     * findAbility(): accepts a String and an Integer, then lists out all
     * soldiers with matching attribute and value.
     */
    public void findAbility() {
        convert();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Finding ability: ");
            String ability = s.nextLine();

            if (ability.isBlank()) {
                break;
            } else {
                System.out.println("");
            }

            System.out.print("value: ");
            int value = s.nextInt();
            String enter = s.nextLine();
            // to match the spacing given in the example
            System.out.println("");

            switch (ability) {
                case "Strength":
                    System.out.print("Soldier: ");
                    for (int i = 0; i < list.size(); i++) {
                        if (value == Strength[i]) {
                            System.out.print(Name[i] + ", ");
                        }
                    }
                    System.out.println();

                    break;

                case "Agility":
                    System.out.print("Soldier: ");
                    for (int i = 0; i < list.size(); i++) {
                        if (value == Agility[i]) {
                            System.out.print(Name[i] + ", ");
                        }
                    }
                    System.out.println();

                    break;

                case "Intelligence":
                    System.out.print("Soldier: ");
                    for (int i = 0; i < list.size(); i++) {
                        if (value == Intelligence[i]) {
                            System.out.print(Name[i] + ", ");
                        }
                    }
                    System.out.println();

                    break;

                case "Coordination":
                    System.out.print("Soldier: ");
                    for (int i = 0; i < list.size(); i++) {
                        if (value == Coordination[i]) {
                            System.out.print(Name[i] + ", ");
                        }
                    }
                    System.out.println();

                    break;

                case "Leadership":
                    System.out.print("Soldier: ");
                    for (int i = 0; i < list.size(); i++) {
                        if (value == Leadership[i]) {
                            System.out.print(Name[i] + ", ");
                        }
                    }
                    System.out.println();

                    break;

                default:
                    System.out.println("Error");
            }
            System.out.println();
        }
    }

    /**
     * convert(): simplifies invocation for the main list for other functions'
     * use.
     *
     * It intializes a handful of arrays to be referenced to the main ArrayList.
     */
    private void convert() {
        Name = new String[list.size()];
        Strength = new int[list.size()];
        Agility = new int[list.size()];
        Intelligence = new int[list.size()];
        Coordination = new int[list.size()];
        Leadership = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            Name[i] = list.get(i).getName();
            Strength[i] = list.get(i).getStrength();
            Agility[i] = list.get(i).getAgility();
            Intelligence[i] = list.get(i).getIntelligence();
            Coordination[i] = list.get(i).getCoordination();
            Leadership[i] = list.get(i).getLeadership();
        }
    }
}
