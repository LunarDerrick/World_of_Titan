package world_of_titan;

public class FriendList {
    // set up 2.1 Eren's Allies variables here
    java.util.LinkedList<Allies> list=new java.util.LinkedList<>();
        
    try {
        Scanner in = new Scanner(new FileInputStream("Allies.txt"));
        while(in.hasNextLine()){
            System.out.println("Enter name: ");
            String name = in.nextLine();
            System.out.println(name);
            if (name.isBlank()){
                break;
            }
            System.out.println("Enter characteristics: ");
            String c1 = in.nextLine();
            System.out.println(c1);
            System.out.println();
            String[]c2 = c1.split(" ");
            Integer[]c3 = new Integer[7];
            for(int i=0;i<c2.length;i++){
                c3[i]=Integer.parseInt(c2[i]);
            }
            Allies allie=new Allies(name,c3[0],c3[1],c3[2],c3[3],c3[4],c3[5],c3[6]);
            list.add(allie);
            System.out.println(allie.toString());
        }
        in.close();
    } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
    }
}

public class Allies<E> {
    
    private String name;
    private Integer height,weight,strength,agility,intelligence,coordination,leadership;

    public Allies(String name, Integer height, Integer weight, Integer strength, Integer agility, Integer intelligence, Integer coordination, Integer leadership) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.coordination = coordination;
        this.leadership = leadership;
    }

    @Override
    public String toString() {
        return "Name: " + name 
                + "\nHeight: " + height + "cm" 
                + "\nWeight: " + weight + "kg"
                + "\nStrength: " + strength 
                + "\nAgility: " + agility 
                + "\nIntelligence:" + intelligence 
                + "\nCoordination: " + coordination 
                + "\nLeadership:" + leadership +"\n";
    }
    
    
}

