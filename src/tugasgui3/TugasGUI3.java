/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgui3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TugasGUI3 extends Application {
    @Override
    public void start(final Stage primaryStage) {
        Text label1 = new Text("Nama");
        Text label2 = new Text("Telepon");
        Text label3 = new Text("Alamat");
        final TextField textField1 = new TextField();
        final TextField textField2 = new TextField();
        final TextArea alamat = new TextArea();
        final Text nama = new Text();
        final Text telepon = new Text();
        final Text alamatnya = new Text();
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 375);

        gridPane.setPadding(new Insets(50, 50, 50, 50));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(label3, 0,2);
        gridPane.add(alamat,1,2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3); 
        gridPane.add(nama, 1,4);
        gridPane.add(telepon, 1,5);
        gridPane.add(alamatnya, 1,6);
        
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                    
                nama.setText("Username          : " + textField1.getText());
                telepon.setText("Telepon              : " + textField2.getText());
                alamatnya.setText("Alamat               : " + alamat.getText());
            }
        });  
        
        Scene scene = new Scene(gridPane);

        primaryStage.setTitle("Syahputra Rahman Ramadhan - 19201265");
        primaryStage.setScene(scene);
        primaryStage.show();
}
    public static void main(String[] args) {
        launch(args);
    }
}

