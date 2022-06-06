package allproject;

import java.awt.Color;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Allproject extends Application {
    
    MenuBar menuBar = new MenuBar();
    Menu menuFile = new Menu("email");
    Menu menuEdit = new Menu("Social Media");
    Menu menuView = new Menu("جامعة الاقصى");
    MenuItem itemNewFile = new MenuItem("Gmail");
    MenuItem itemOpen = new MenuItem("Drive");
    MenuItem itemSave = new MenuItem("Email");
    MenuItem itemExit = new MenuItem("Hotmail");
    MenuItem itemUndo = new MenuItem("YouTube");
    MenuItem itemCut = new MenuItem("FaceBook");
    MenuItem itemCopy = new MenuItem("Instagram");
    MenuItem itemPaste = new MenuItem("Twitch");
    MenuItem itemSelect = new MenuItem("WhatsApp");
    MenuItem itemAbout = new MenuItem("بوابة الطالب");
    MenuItem itemReport = new MenuItem("Model");
    @Override
    public void start(Stage primaryStage) {
        
        
        JFrame frame = new JFrame("JTabbedPane demo");         
        frame.setSize(320, 300);                              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setLayout(null);                                 
 
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();
        JPanel panel_5 = new JPanel();
 
        panel_1.setBackground(Color.white);
        panel_2.setBackground(Color.cyan);
        panel_3.setBackground(Color.yellow);
        panel_4.setBackground(Color.green);
        panel_5.setBackground(Color.red);
 
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane.setBounds(50, 30, 200, 200);
 
        tabbedPane.addTab("Tab 1", panel_1);
        tabbedPane.addTab("Tab 2", panel_2);
        tabbedPane.addTab("Tab 3", panel_3);
        tabbedPane.addTab("Tab 4", panel_4);
        tabbedPane.addTab("Tab 5", panel_5);
 
        frame.add(tabbedPane);
 
        frame.setVisible(true);
        
        
        
        Label label = new Label("Choose your favorite color:");
        ListView<String> listView = new ListView<>();
 
        ObservableList<String> items = FXCollections.observableArrayList(
            "red", "blue", "green", "yellow", "orange", "brown", "pink", "purple", "gray", "black", "white"
        );
 
        listView.setItems(items);
 
        label.setPrefSize(200, 30);
        listView.setPrefSize(120, 250);
 
        label.setTranslateX(150);
        label.setTranslateY(110);
        listView.setTranslateX(0);
        listView.setTranslateY(0);
 
        Group root2 = new Group();
        root2.getChildren().add(label);
        root2.getChildren().add(listView);
 
        Scene scene6 = new Scene(root2, 400, 250);
 
      
        listView.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends String> ov, String old_val, String new_val) -> {
            label.setText("Your favorite color is:   " + new_val);
        });
 
        listView.getSelectionModel().select(0);
 
        
        
        
        ScrollPane root1 = new ScrollPane();
        
        StackPane stackPane = new StackPane();
        Button button = new Button("click me");
        
        button.setPrefSize(300, 200);
        
        stackPane.minWidthProperty().bind(Bindings.createDoubleBinding(() -> 
        root1.getViewportBounds().getWidth(), root1.viewportBoundsProperty()));
        
        stackPane.minHeightProperty().bind(Bindings.createDoubleBinding(() -> 
        root1.getViewportBounds().getHeight(), root1.viewportBoundsProperty()));
        
        stackPane.getChildren().add(button);
        
        root1.setContent(stackPane);
        
        
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        menuFile.getItems().add(itemNewFile);
        menuFile.getItems().add(itemOpen);
        menuFile.getItems().add(itemSave);
        menuFile.getItems().add(new SeparatorMenuItem());   
        menuFile.getItems().add(itemExit);
        menuEdit.getItems().add(itemUndo);
        menuEdit.getItems().add(new SeparatorMenuItem());  
        menuEdit.getItems().add(itemCut);
        menuEdit.getItems().add(itemCopy);
        menuEdit.getItems().add(itemPaste);
        menuEdit.getItems().add(new SeparatorMenuItem());   
        menuEdit.getItems().add(itemSelect);
        
        menuView.getItems().add(itemAbout);
        menuView.getItems().add(itemReport);
        
        menuBar.setPrefWidth(400);
        Group root = new Group();
        root.getChildren().add(menuBar);
        Scene scene9 = new Scene(root, 400, 250);
        
        itemNewFile.setOnAction((ActionEvent e) -> {
        });
        
        itemOpen.setOnAction((ActionEvent e) -> {
        });
        
        itemSave.setOnAction((ActionEvent e) -> {
        });
        
        itemExit.setOnAction((ActionEvent e) -> {
        });
        
        itemUndo.setOnAction((ActionEvent e) -> {
        });
        
        itemCut.setOnAction((ActionEvent e) -> {
        });
        
        itemCopy.setOnAction((ActionEvent e) -> {
        });
        
        itemPaste.setOnAction((ActionEvent e) -> {
        });
        
        itemSelect.setOnAction((ActionEvent e) -> {
        });
        
        itemAbout.setOnAction((ActionEvent e) -> {
        });
        
        itemReport.setOnAction((ActionEvent e) -> {
        });
        
        CheckBox checkBox1 = new CheckBox("Green");
        HBox hbox = new HBox(checkBox1);
        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("Choice 1");
        choiceBox.getItems().add("Choice 2");
        choiceBox.getItems().add("Choice 3");
        HBox hbox1 = new HBox(choiceBox);

        RadioButton radioButton1 = new RadioButton("Left");
        RadioButton radioButton2 = new RadioButton("Right");
        RadioButton radioButton3 = new RadioButton("Up");
        RadioButton radioButton4 = new RadioButton("Down");

        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        HBox hbox2 = new HBox(radioButton1, radioButton2, radioButton3, radioButton4);

        TextField textField = new TextField();

        HBox hbox3 = new HBox(textField);

        ToggleButton toggleButton1 = new ToggleButton("click");

        HBox hbox4 = new HBox(toggleButton1);

        PasswordField passwordField = new PasswordField();

        HBox hbox5 = new HBox(passwordField);

         Slider slider = new Slider(0, 100, 0);
         slider.setShowTickLabels(true);
     
        Tooltip tooltip1 = new Tooltip("Creates a new file");

         Button button1 = new Button("New");
         button1.setTooltip(tooltip1);
       
          TreeItem rootItem = new TreeItem("Tutorials");

          TreeItem webItem = new TreeItem("Web Tutorials");
          webItem.getChildren().add(new TreeItem("HTML  Tutorial"));
          webItem.getChildren().add(new TreeItem("HTML5 Tutorial"));
          webItem.getChildren().add(new TreeItem("CSS Tutorial"));
          webItem.getChildren().add(new TreeItem("SVG Tutorial"));
          rootItem.getChildren().add(webItem);

          TreeItem javaItem = new TreeItem("Java Tutorials");
          javaItem.getChildren().add(new TreeItem("Java Language"));
          javaItem.getChildren().add(new TreeItem("Java Collections"));
          javaItem.getChildren().add(new TreeItem("Java Concurrency"));
          rootItem.getChildren().add(javaItem);

          TreeView treeView = new TreeView();
          treeView.setRoot(rootItem);
          treeView.setShowRoot(false);
          
         
        Scene scene = new Scene(hbox, 200, 100);
        Scene scene1 = new Scene(hbox1, 200, 100);
        Scene scene2 = new Scene(hbox2, 200, 100);
        Scene scene4 = new Scene(hbox3, 200, 100);
        Scene scene3 = new Scene(hbox4, 200, 100);
        Scene scene5 = new Scene(hbox5, 200, 100);
        
        VBox vbox = new VBox(checkBox1, choiceBox ,hbox2,toggleButton1,button1,treeView,menuBar,root1,listView);
        VBox vbox2 = new VBox(textField,passwordField,slider);
        VBox vbox10 = new VBox(vbox2,vbox); 
        Scene scene11 = new Scene(vbox10, 200, 100);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.setScene(scene1);
        primaryStage.setScene(scene2);
        primaryStage.setScene(scene3);
        primaryStage.setScene(scene4);
        primaryStage.setScene(scene5);
        primaryStage.setScene(scene6);
        primaryStage.setScene(scene9);
        primaryStage.setScene(scene11);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
