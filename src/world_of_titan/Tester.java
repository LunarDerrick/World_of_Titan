package world_of_titan;

// GUI libraries
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.*; // Button, TextField
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.geometry.*; // Insets, Pos
import javafx.event.*; // ActionEvent, EventHandler

public class Tester extends Application {

    public static void main(String[] args) {
        // Test codes in this main class
        FriendList friendList = new FriendList();
        Evaluation evaluation = new Evaluation();

        //Allies (Now under FriendList.java)
        friendList.loadAllies("Allies.txt");

        //Sorting attribute
        friendList.sortAttribute();
        System.out.println("");

        //Finding ability
        friendList.findAbility();
        System.out.println("");

        //tester for titan (Now under Evaluation.java)
        evaluation.findKillPriority();

        // attempt GUI using javafx
        launch(args);
        System.out.println("");

        //Wall of maria (Now under Evaluation.java)
        evaluation.findWeakWall();
    }

    // attempt GUI using javafx
    @Override
    public void start(Stage stage) {
        // label, titles etc
        Text text1 = new Text("Scouting.java demo");
        TextField textField1 = new TextField();
        textField1.setPromptText("type here...");
        Button button1 = new Button("Show map data");
        Button button2 = new Button("scoutPath");
        Button button3 = new Button("findTitan");
        Button button4 = new Button("Clear");
        // arrangment, layout etc
        textField1.setMaxWidth(100);
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 0, 2);
        gridPane.add(button1, 0, 4);
        gridPane.add(button2, 2, 4);
        gridPane.add(button3, 4, 4);
        gridPane.add(button4, 6, 4);
        // design, styling etc
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button4.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        gridPane.setStyle("-fx-background-color: BEIGE;");
        // declare Scouting
        Scouting scouting = new Scouting();
        // load map data
        scouting.loadMap("mapData.txt");
        // event handler(accept input and process output)
        // button1 = show map data
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // display map data
                System.out.println(scouting.toString() + "\n");;

                System.out.println("Please close the pop-out window for the code to resume");
            }
        });
        // button2 = scoutPath
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // demo on Hamiltonian cycle
                // scouting.scoutPath();
                String text = textField1.getText();
                if (scouting.isNumeric(text) && scouting.withinRange(text)) {
                    int value = Integer.parseInt(text);
                    scouting.findCycle(value);
                } else {
                    System.out.println("\n" + scouting.getErrorMessage());
                }

                System.out.println("\nPlease close the pop-out window for the code to resume");
            }
        });
        // button3 = findTitan
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // attempt on 2.4 best path to kill titan
                // scouting.findTitan();
                String text = textField1.getText();
                if (scouting.isNumeric(text) && scouting.withinRange(text)) {
                    int value = Integer.parseInt(text);
                    System.out.println("");
                    scouting.BFS(value);
                } else {
                    System.out.println("\n" + scouting.getErrorMessage() + "\n");
                }                

                System.out.println("Please close the pop-out window for the code to resume");
            }
        });
        // button4 = clear(textField)
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField1.clear();
            }
        });
        // create object to be invoked
        Scene scene = new Scene(gridPane);
        stage.setTitle("World of Titan.exe");
        stage.setScene(scene);
        stage.show();
    }
}
