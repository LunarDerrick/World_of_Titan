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
        FriendList friendList = new FriendList();
        Scouting scouting = new Scouting();
        SoldierArrange soldierArrange = new SoldierArrange();

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
                Scanner s = new Scanner(System.in);

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
