package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	int x=0;
	int y=0;
	int ans=0;
	char operator=' ';
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Calculator");
		Image image=new Image("file:///C:/Users/DELL/eclipse-workspace/Calculator2/comeOn.png");
		primaryStage.getIcons().add(image);
		Label label1=new Label("");
		label1.setAlignment(Pos.BASELINE_RIGHT);
		Label label2=new Label("");
		label2.getStyleClass().add("label-small");
		Button one=new Button("1");
		one.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'1';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'1';
			label2.setText(temp);
		});
		Button two=new Button("2");
		two.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'2';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'2';
			label2.setText(temp);
		});
		Button three=new Button("3");
		three.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'3';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'3';
			label2.setText(temp);
		});
		Button four=new Button("4");
		four.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'4';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'4';
			label2.setText(temp);
		});
		Button five=new Button("5");
		five.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'5';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'5';
			label2.setText(temp);
		});
		Button six=new Button("6");
		six.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'6';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'6';
			label2.setText(temp);
		});
		Button seven=new Button("7");
		seven.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'7';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'7';
			label2.setText(temp);
		});
		Button eight=new Button("8");
		eight.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'8';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'8';
			label2.setText(temp);
		});
		Button nine=new Button("9");
		nine.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'9';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'9';
			label2.setText(temp);
		});
		Button zero=new Button("0");
		zero.setOnAction(e->{
			String temp=label1.getText();
			temp=temp+'0';
			label1.setText(temp);
			temp=label2.getText();
			temp=temp+'0';
			label2.setText(temp);
		});
		Button del=new Button("<-");
		del.getStyleClass().add("button-misc");
		del.setOnAction(e->{
			String temp=label1.getText();
			if(temp.equals("")) {
				return;
			}
			temp = temp.substring(0, temp.length() - 1);
			label1.setText(temp);
			temp=label2.getText();
			if(temp.equals("")) {
				return;
			}
			temp = temp.substring(0, temp.length() - 1);
			label2.setText(temp);
		});
		Button clr=new Button("C");
		clr.getStyleClass().add("button-misc");
		clr.setStyle("-fx-text-fill:#ff3300");
		clr.setOnAction(e->{
			label1.setText("");
			label2.setText("");
		});
		Button equ=new Button("=");
		equ.getStyleClass().add("button-blue");
		equ.setOnAction(e->{
			y=Integer.parseInt(label1.getText());
			ans=Calculations.calc(operator,x,y);
			label1.setText(ans+"");
			label2.setText(ans+"");
			operator=' ';
			
		});
		Button plus=new Button("+");
		plus.getStyleClass().add("button-misc");
		plus.setOnAction(e->{
			if(operator==' ') {
				x=Integer.parseInt(label1.getText());
				operator='+';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'+';
				label2.setText(temp);
			}
			else {
				y=Integer.parseInt(label1.getText());
				x=Calculations.calc(operator,x,y);
				operator='+';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'+';
				label2.setText(temp);
			}
		});
		Button minus=new Button("-");
		minus.getStyleClass().add("button-misc");
		minus.setOnAction(e->{
			if(operator==' ') {
				x=Integer.parseInt(label1.getText());
				operator='-';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'-';
				label2.setText(temp);
			}
			else {
				y=Integer.parseInt(label1.getText());
				x=Calculations.calc(operator,x,y);
				operator='-';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'-';
				label2.setText(temp);
			}
		});
		Button mul=new Button("x");
		mul.getStyleClass().add("button-misc");
		mul.setOnAction(e->{
			if(operator==' ') {
				x=Integer.parseInt(label1.getText());
				operator='*';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'*';
				label2.setText(temp);
			}
			else {
				y=Integer.parseInt(label1.getText());
				x=Calculations.calc(operator,x,y);
				operator='*';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'*';
				label2.setText(temp);
			}
		});
		Button div=new Button("/");
		div.getStyleClass().add("button-misc");
		div.setOnAction(e->{
			if(operator==' ') {
				x=Integer.parseInt(label1.getText());
				operator='/';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'/';
				label2.setText(temp);
			}
			else {
				y=Integer.parseInt(label1.getText());
				x=Calculations.calc(operator,x,y);
				operator='/';
				label1.setText("");
				String temp=label2.getText();
				temp=temp+'/';
				label2.setText(temp);
			}
		});
		
		GridPane layout=new GridPane();
		GridPane.setConstraints(label2,0,0,5,1);
		GridPane.setConstraints(label1,0,1,5,1);
		GridPane.setConstraints(one,0,3);
		GridPane.setConstraints(two,1,3);
		GridPane.setConstraints(three,2,3);
		GridPane.setConstraints(del,3,3);
		GridPane.setConstraints(clr,4,3);
		GridPane.setConstraints(four,0,4);
		GridPane.setConstraints(five,1,4);
		GridPane.setConstraints(six,2,4);
		GridPane.setConstraints(plus,3,4);
		GridPane.setConstraints(minus,4,4);
		GridPane.setConstraints(seven,0,5);
		GridPane.setConstraints(eight,1,5);
		GridPane.setConstraints(nine,2,5);
		GridPane.setConstraints(mul,3,5);
		GridPane.setConstraints(div,4,5);
		GridPane.setConstraints(zero,1,6);
		GridPane.setConstraints(equ,3,6,2,1);
		layout.getChildren().addAll(label2,label1,one,two,three,del,clr,four,five,six,seven,eight,nine,zero,equ,plus,minus,mul,div);
		Scene scene=new Scene(layout,375,430);
		scene.getStylesheets().add(Main.class.getResource("DarkThemeDemo.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
