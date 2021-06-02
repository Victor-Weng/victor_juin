
import javafx.application.Application;
import javafx.beans.binding.StringBinding;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
* Author : victor
* Date : 6/2/21
* Description : Java class qui permet d'ajouter la binded somme de 2 labels sans utiliser une fichier fxml.
*/

public class ActionBtnTxt extends Application {

	
	@Override
	public void start(Stage primaryStage) {
			
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		
		// TextFields and their layout
		
		TextField txt = new TextField();
		txt.setLayoutX(20);
		txt.setLayoutY(20);
		
		TextField txt1 = new TextField();
		txt1.setLayoutX(txt.getLayoutX());
		txt1.setLayoutY(txt.getLayoutY()+40);
		
		Label prnum = new Label();
		prnum.setLayoutX(txt1.getLayoutX());
		prnum.setLayoutY(txt1.getLayoutY()+40);
		prnum.setText("0");
		
		Label add = new Label();
		add.setLayoutX(txt1.getLayoutX()+20);
		add.setLayoutY(txt1.getLayoutY()+40);
		add.setText("+");
		
		Label denum = new Label();
		denum.setLayoutX(txt1.getLayoutX()+40);
		denum.setLayoutY(txt1.getLayoutY()+40);
		denum.setText("0");
		
		Label eql = new Label();
		eql.setLayoutX(txt1.getLayoutX()+60);
		eql.setLayoutY(txt1.getLayoutY()+40);
		eql.setText("=");
		
		Label sum = new Label();
		sum.setLayoutX(txt1.getLayoutX()+80);
		sum.setLayoutY(txt1.getLayoutY()+40);
		
		// Bind numbers to Labels
		
		Nombre num=new Nombre();
		num.setNombre(0);
		prnum.textProperty().bind(num.nombreProperty().asString());
		
		Nombre1 num1=new Nombre1();
		num1.setNombre1(0);
		denum.textProperty().bind(num1.nombreProperty1().asString());
		
		
		// Try to add the binds together
		
		// Anonymous class (no name) of StringBinding
		sum.textProperty().bind(new StringBinding(){
				    {
				        // Initializer
				    	// Call twice to update the binded value
				    	super.bind(denum.textProperty());
				       super.bind(denum.textProperty());
				    }
				    @Override
				    public String computeValue(){
				    	// Ajoute les deux binded labels avec getText()
				        return String.valueOf(Double.parseDouble(denum.getText())+Double.parseDouble(prnum.getText()));
				    }
				});
		
	
		// Bind text field txt a label num

		txt.textProperty().addListener((observable,oldValue,newValue) ->
			{
				num.setNombre(Double.parseDouble(newValue));
				
			}
				
				);
		
		// Bind text field txt1 a label num1 
		
		txt1.textProperty().addListener((observable,oldValue,newValue) ->
			{
				num1.setNombre1(Double.parseDouble(newValue));
			}
				
				
				);
	

		// Add children to group
		
		group.getChildren().add(txt);
		group.getChildren().add(txt1);
		group.getChildren().add(prnum);
		group.getChildren().add(add);
		group.getChildren().add(denum);
		group.getChildren().add(eql);
		group.getChildren().add(sum);
		
			
	primaryStage.setScene(scene);
	primaryStage.show();
			
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
