package world_of_titan;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
// GUI library
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.*; // Button, TextField
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.*; // ActionEvent, EventHandler
// Titan.java libraries
import static java.lang.Math.abs;
import java.util.PriorityQueue;

public class Tester extends Application {

    public static void main(String[] args) {
        // Test codes in this main class
        //FriendList friendList = new FriendList();
        Scouting scouting = new Scouting();
        SoldierArrange soldierArrange = new SoldierArrange();

        //Allies
        java.util.LinkedList<Allies> list=new java.util.LinkedList<>();
        Scanner s = new Scanner(System.in);
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
        
        //Sorting attribute
        String[]Name=new String[list.size()];
        int[]Strength=new int[list.size()];
        int[]Agility=new int[list.size()];
        int[]Intelligence=new int[list.size()];
        int[]Coordination=new int[list.size()];
        int[]Leadership=new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            Name[i]=list.get(i).getName();
            Strength[i]=list.get(i).getStrength();
            Agility[i]=list.get(i).getAgility();
            Intelligence[i]=list.get(i).getIntelligence();
            Coordination[i]=list.get(i).getCoordination();
            Leadership[i]=list.get(i).getLeadership();
        }
        
        while(true){    
            System.out.print("Sorting attribute: ");
            String attr = s.nextLine();
            if (attr.isBlank()){
                break;
            }
            switch(attr){
                case "Strength":
                    for (int i=0;i<list.size();i++) {
                        for (int j=0;j<list.size()-1;j++){ 
                            if (Strength[j] > Strength[j+1]){
                                int hold1 = Strength[j];        
                                Strength[j] = Strength[j+1];  
                                Strength[j+1] = hold1;
                                int hold2 = Agility[j];        
                                Agility[j] = Agility[j+1];  
                                Agility[j+1] = hold2;
                                int hold3 = Intelligence[j];        
                                Intelligence[j] = Intelligence[j+1];  
                                Intelligence[j+1] = hold3;
                                int hold4 = Coordination[j];        
                                Coordination[j] = Coordination[j+1];  
                                Coordination[j+1] = hold4;
                                int hold5 = Leadership[j];        
                                Leadership[j] = Leadership[j+1];  
                                Leadership[j+1] = hold5;
                                String hold6 = Name[j];        
                                Name[j] = Name[j+1];  
                                Name[j+1] = hold6;
                            }
                        }
                    }

                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(Name[i]+" "+Strength[i]);
                    }
                    System.out.println();

                    break;

                case "Agility":
                    for (int i=0;i<list.size();i++) {
                        for (int j=0;j<list.size()-1;j++){ 
                            if (Agility[j] > Agility[j+1]){
                                int hold1 = Strength[j];        
                                Strength[j] = Strength[j+1];  
                                Strength[j+1] = hold1;
                                int hold2 = Agility[j];        
                                Agility[j] = Agility[j+1];  
                                Agility[j+1] = hold2;
                                int hold3 = Intelligence[j];        
                                Intelligence[j] = Intelligence[j+1];  
                                Intelligence[j+1] = hold3;
                                int hold4 = Coordination[j];        
                                Coordination[j] = Coordination[j+1];  
                                Coordination[j+1] = hold4;
                                int hold5 = Leadership[j];        
                                Leadership[j] = Leadership[j+1];  
                                Leadership[j+1] = hold5;
                                String hold6 = Name[j];        
                                Name[j] = Name[j+1];  
                                Name[j+1] = hold6;
                            }
                        }
                    }

                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(Name[i]+" "+Agility[i]);
                    }
                    System.out.println("");
                    
                    break;

                case "Intelligence":
                    for (int i=0;i<list.size();i++) {
                        for (int j=0;j<list.size()-1;j++){ 
                            if (Intelligence[j] > Intelligence[j+1]){
                                int hold1 = Strength[j];        
                                Strength[j] = Strength[j+1];  
                                Strength[j+1] = hold1;
                                int hold2 = Agility[j];        
                                Agility[j] = Agility[j+1];  
                                Agility[j+1] = hold2;
                                int hold3 = Intelligence[j];        
                                Intelligence[j] = Intelligence[j+1];  
                                Intelligence[j+1] = hold3;
                                int hold4 = Coordination[j];        
                                Coordination[j] = Coordination[j+1];  
                                Coordination[j+1] = hold4;
                                int hold5 = Leadership[j];        
                                Leadership[j] = Leadership[j+1];  
                                Leadership[j+1] = hold5;
                                String hold6 = Name[j];        
                                Name[j] = Name[j+1];  
                                Name[j+1] = hold6;
                            }
                        }
                    }

                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(Name[i]+" "+Intelligence[i]);
                    }
                    System.out.println();
                    
                    break;

                case "Coordination":
                    for (int i=0;i<list.size();i++) {
                        for (int j=0;j<list.size()-1;j++){ 
                            if (Coordination[j] > Coordination[j+1]){
                                int hold1 = Strength[j];        
                                Strength[j] = Strength[j+1];  
                                Strength[j+1] = hold1;
                                int hold2 = Agility[j];        
                                Agility[j] = Agility[j+1];  
                                Agility[j+1] = hold2;
                                int hold3 = Intelligence[j];        
                                Intelligence[j] = Intelligence[j+1];  
                                Intelligence[j+1] = hold3;
                                int hold4 = Coordination[j];        
                                Coordination[j] = Coordination[j+1];  
                                Coordination[j+1] = hold4;
                                int hold5 = Leadership[j];        
                                Leadership[j] = Leadership[j+1];  
                                Leadership[j+1] = hold5;
                                String hold6 = Name[j];        
                                Name[j] = Name[j+1];  
                                Name[j+1] = hold6;
                            }
                        }
                    }

                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(Name[i]+" "+Coordination[i]);
                    }
                    System.out.println();
                    
                    break;

                case "Leadership":
                    for (int i=0;i<list.size();i++) {
                        for (int j=0;j<list.size()-1;j++){ 
                            if (Leadership[j] > Leadership[j+1]){
                                int hold1 = Strength[j];        
                                Strength[j] = Strength[j+1];  
                                Strength[j+1] = hold1;
                                int hold2 = Agility[j];        
                                Agility[j] = Agility[j+1];  
                                Agility[j+1] = hold2;
                                int hold3 = Intelligence[j];        
                                Intelligence[j] = Intelligence[j+1];  
                                Intelligence[j+1] = hold3;
                                int hold4 = Coordination[j];        
                                Coordination[j] = Coordination[j+1];  
                                Coordination[j+1] = hold4;
                                int hold5 = Leadership[j];        
                                Leadership[j] = Leadership[j+1];  
                                Leadership[j+1] = hold5;
                                String hold6 = Name[j];        
                                Name[j] = Name[j+1];  
                                Name[j+1] = hold6;
                            }
                        }
                    }

                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(Name[i]+" "+Leadership[i]);
                    }
                    System.out.println();
                    
                    break;

                default:
                    System.out.println("Error");

            }
        }
        
        System.out.println();
        
        //Finding ability
        while(true){
            System.out.print("Finding ability: ");
            String ability = s.nextLine();
            
            if (ability.isBlank()){
                break;
            }
            
            System.out.print("value: ");
            int value = s.nextInt();
            String enter = s.nextLine();
            switch(ability){
                case "Strength":
                    System.out.print("Soldier: ");
                    for(int i=0;i<list.size();i++){
                        if(value==Strength[i]){
                            System.out.print(Name[i]+" ");
                        }
                    }
                    System.out.println();
                    
                    break;

                case "Agility":
                    System.out.print("Soldier: ");
                    for(int i=0;i<list.size();i++){
                        if(value==Agility[i]){
                            System.out.print(Name[i]+" ");                            
                        }
                    }
                    System.out.println();
                    
                    break;
                    
                case "Intelligence":
                    System.out.print("Soldier: ");
                    for(int i=0;i<list.size();i++){
                        if(value==Intelligence[i]){
                            System.out.print(Name[i]+" ");                            
                        }
                    }
                    System.out.println();
                    
                    break;
                    
                case "Coordination":
                    System.out.print("Soldier: ");
                    for(int i=0;i<list.size();i++){
                        if(value==Coordination[i]){
                            System.out.print(Name[i]+" ");                            
                        }
                    }
                    System.out.println();
                    
                    break;
                    
                case "Leadership":
                    System.out.print("Soldier: ");
                    for(int i=0;i<list.size();i++){
                        if(value==Leadership[i]){
                            System.out.print(Name[i]+" ");
                        }
                    }
                    System.out.println();
                    
                    break;
                    
                default:
                    System.out.println("Error");
            }
            System.out.println();
        }   
    
        
    
   
        // Load data from data.txt
        try {
            Scanner read = new Scanner(new FileInputStream("data.txt"));
            while (read.hasNextLine()) {
                String input = read.nextLine();
                String[] inputList = input.split(" ");
                int[] numberList = new int[inputList.length];

                for (int i = 0; i < numberList.length; i++) {
                    numberList[i] = Integer.parseInt(inputList[i]);
                }

                int[] values = new int[numberList.length - 2];
                System.arraycopy(numberList, 2, values, 0, numberList.length - 2);

                scouting.mapNode(numberList[0], numberList[1], values);
            }

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // display map data
        System.out.println(scouting.toString());

        // demo on Hamiltonian cycle
        scouting.scoutPath();
                
        // attempt on 2.4 best path to kill titan
        scouting.findTitan();
        
        // attempt GUI using javafx
        launch(args);

        //tester for titan
        boolean t;
        int a = 0;
        do {
            try {

                System.out.print("Number of Titans: ");
                a = s.nextInt();
                t = false;

                if (a < 0) {
                    System.out.println("Positive integer only");
                    t = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please key in an integer only......");
                t = true;
            }
        } while (t);

        System.out.println("");
        System.out.println("Generating " + a + " Titans ....");
        PriorityQueue<Titan> pq = new PriorityQueue<>();
        PriorityQueue<Titan> pqtmp = new PriorityQueue<>();
        for (int i = 1; i <= a; i++) {
            pqtmp.add(new Titan(i));
        }

        while (!pqtmp.isEmpty()) {
            pq.add(pqtmp.poll());
        }

        System.out.println("");
        System.out.print("Sequence to be killed: ");
        int initial = 0;
        int distance = 0;
        int sequence;

        int counter = 0;
        for (Titan titan : pq) {
            sequence = titan.getIndex();
            if (counter == pq.size() - 1) {
                System.out.print("Titan " + sequence);
            } else {
                System.out.print("Titan " + sequence + " --> ");
            }
            distance += abs(sequence - initial);
            initial = sequence;

            counter++;
        }

        System.out.println("");
        System.out.println("Total distance moved: " + distance);

    }

    // attempt GUI using javafx
    @Override
    public void start(Stage stage) {
        // label, titles etc
        Text text1 = new Text("Enter starting point: (Placeholder)");
        TextField textField1 = new TextField();
        Button button1 = new Button("Search (Placeholder)");
        // arrangment, layout etc
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 0, 2);
        // design, styling etc
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        gridPane.setStyle("-fx-background-color: BEIGE;");
        // event handler(accept input and process output)
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // demo on Hamiltonian cycle
                System.out.println("for now it only output back at console");
            }
        });
        // create object to be invoked
        Scene scene = new Scene(gridPane);
        stage.setTitle("World of Titan.exe");
        stage.setScene(scene);
        stage.show();
    }
    
    

}
