import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class GUIMAinPage extends Application {

        public void start(Stage stage) throws Exception {

                Stage window = new Stage();
                window.setTitle("Financial Calculator");



        ImageView iv = new ImageView();
        iv.setFitHeight(500);
        iv.setFitWidth(550);

        Font font = new Font("serif", 35);//font for the heading
        Font font2 = new Font("serif", 15);//font for the buttons
        Font font3 = new Font("serif", 17);//font for the text

        Label lb1 = new Label("HOME PAGE");//main heading
        lb1.setLayoutX(185);
        lb1.setLayoutY(45);

        Button mbt1 = new Button("Fixed Deposits");//fixed deposit button
        mbt1.setLayoutX(210);
        mbt1.setLayoutY(150);
        mbt1.setPrefWidth(150);
        mbt1.setOnAction(e -> {
            window.close();

        });

        Button mbt2 = new Button("Savings");//savings button
        mbt2.setLayoutX(210);
        mbt2.setLayoutY(210);
        mbt2.setPrefWidth(150);
        mbt2.setOnAction(e -> {
            window.close();

                });

        }


}



