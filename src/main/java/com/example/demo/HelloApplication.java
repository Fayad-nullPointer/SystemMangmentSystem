package com.example.demo;
//made with Software Engineer:Ahmed Ashraf Fayad
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.ImageInput;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import javax.imageio.stream.FileImageInputStream;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class HelloApplication extends Application {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    ObservableList<Student> data;
    TableView<Student> table;

    @Override
    public void start(Stage primaryStage) {
        //start grid pane of insert student
        Button btn1 = new Button();
        btn1.setText("Add");
        Button btn2 = new Button();
        btn2.setText("Clear");
        Text txt1 = new Text("Add New Student");
        Label l1 = new Label("ID");
        Label l2 = new Label("Name");
        Label l3 = new Label("Major");
        Label l4 = new Label("Minor");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        GridPane g1 = new GridPane();
        g1.add(txt1, 0, 0, 2, 1);
        g1.add(l1, 0, 1);
        g1.add(t1, 1, 1);
        g1.add(l2, 0, 2);
        g1.add(t2, 1, 2);
        g1.add(l3, 0, 3);
        g1.add(t3, 1, 3);
        g1.add(l4, 0, 4);
        g1.add(t4, 1, 4);
        g1.add(btn1, 0, 6);
        g1.add(btn2, 1, 6);
        g1.setVgap(10);
        g1.setHgap(10);
        //g1.setAlignment(Pos.CENTER);
        Label l5 = new Label("Update Student's Major by ID: ");
        Label l6 = new Label("ID");
        TextField t5 = new TextField();
        Label l7 = new Label("Major");
        TextField t6 = new TextField();
        Button btn3 = new Button("Update");
        GridPane g2 = new GridPane();
        g2.add(l5, 0, 0, 2, 1);
        g2.add(l6, 0, 1);
        g2.add(t5, 1, 1);
        g2.add(l7, 0, 2);
        g2.add(t6, 1, 2);
        g2.add(btn3, 0, 3, 2, 1);
        g2.setVgap(15);
        g2.setHgap(15);
        Label l8 = new Label("Delete Student by ID: ");
        Label l9 = new Label("ID");
        TextField t7 = new TextField();
        Button btn4 = new Button("Delete");
        GridPane g3 = new GridPane();
        g3.add(l8, 0, 0, 2, 1);
        g3.add(l9, 0, 1);
        g3.add(t7, 1, 1);
        g3.add(btn4, 0, 2, 2, 1);
        g3.setVgap(15);
        g3.setHgap(15);
        //Label cc = new Label("BY:Ahmed Ashraf Fayad");
        Button btn5 = new Button("Courses");
        Button btn6 = new Button("Show Data");
        Button btn10 = new Button("Show Course Data");
        Button table = new Button("Table View");
        //cc.setId("one");
        GridPane g4 = new GridPane();
        //g4.add(cc, 1, 3);
        g4.setVgap(15);
        g4.setHgap(15);
        g4.add(btn5, 1, 4);
        g4.add(btn6, 1, 5);
        g4.add(btn10, 1, 6);
        g4.add(table, 2, 6);
        VBox vbox = new VBox(g1, g2, g3, g4);
        //now start to make a sing in sene
        Label emailLabel;
        Label passwordLabel;
        TextField emailTextField;
        PasswordField passwordField;
        Button signInButton, signUpButton;
        emailLabel = new Label("Email");
        passwordLabel = new Label("Password");
        emailTextField = new TextField();
        passwordField = new PasswordField();
        signInButton = new Button("Sign In");
        signUpButton = new Button("Sign Up");
       ImageView logo=new ImageView("qq.jpeg");
       logo.setFitHeight(100);
       logo.setFitWidth(100);
        /* passwordfield uses to hide pass till writing */
        GridPane gridPane = new GridPane();
        gridPane.add(emailLabel,0,0);
        gridPane.add(emailTextField,1,0);
        gridPane.add(passwordLabel,0,1);
        gridPane.add(passwordField,1,1);
        gridPane.add(signInButton,0,2);
        gridPane.add(signUpButton,1,2);
        //gridPane.add(logo,1,3);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        //JUST.....//JUST.....
        Label nameLabel;
        Label emailLabel2;
        Label passwordLabel2;
        TextField nameField;
        TextField emailTextField2;
        PasswordField passwordField2;
        ToggleButton femaleToggleButton,maleToggleButton;
        ToggleGroup genderToggleGroup;
        DatePicker datePicker;
        CheckBox termsCheckBox;
        Button signUpButton2;
        Button back=new Button("Back");
        nameLabel =  new Label("Name");
        emailLabel2 = new Label("Email");
        nameField = new TextField();
        passwordLabel2 = new Label("Password");
        emailTextField2 = new TextField();
        passwordField2 = new PasswordField();
        femaleToggleButton = new ToggleButton("Female");
        maleToggleButton = new ToggleButton("Male");
        genderToggleGroup = new ToggleGroup();
        genderToggleGroup.getToggles().addAll(femaleToggleButton,maleToggleButton);
        genderToggleGroup.selectToggle(maleToggleButton);
        datePicker  = new DatePicker();
        datePicker.setPromptText("DD/MM/YY");
        termsCheckBox = new CheckBox("I agree to the terms and conditions");
        signUpButton2 = new Button("Sign Up");

        GridPane gridPane2 = new GridPane();

        gridPane2.add(nameLabel,0,0);
        gridPane2.add(nameField,1,0);
        gridPane2.add(passwordLabel2,0,1);
        gridPane2.add(passwordField2,1,1);
        gridPane2.add(emailLabel2,0,2);
        gridPane2.add(emailTextField2,1,2);
        gridPane2.add(femaleToggleButton,0,3);
        gridPane2.add(maleToggleButton,1,3);
        gridPane2.add(datePicker,0,4,2,1);
        gridPane2.add(termsCheckBox,0,5,2,1);
        gridPane2.add(signUpButton2,0,6,2,1);
        gridPane2.add(back,1,7);
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        gridPane2.setAlignment(Pos.CENTER);

        signInButton.setOnAction(e->{
            String email = emailTextField.getText();
            String password = passwordField.getText();

            if (email.equals("admin") && password.equals("admin")) {
                Scene scene = new Scene(vbox, 600, 600);
                String css = Objects.requireNonNull(getClass().getResource("Style.css")).toExternalForm();
                scene.getStylesheets().add(css);
                primaryStage.setTitle("Student Mangment System Welcome........");
                primaryStage.setScene(scene);
                primaryStage.show();
                Alert alert  = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sign In");
                alert.setHeaderText("Sing In Successful");
                alert.setContentText("Welcome " + email);
                alert.showAndWait();
            }
            else {
                Alert alert  = new Alert(Alert.AlertType.WARNING);
                //alert.setAlertType(Alert.AlertType.ERROR);
                alert.setTitle("Sign In");
                alert.setHeaderText("Sing In Faild");
                alert.setContentText("Invalid email or password");
                alert.showAndWait();
            }
        });
        signUpButton.setOnAction(e->{
           StackPane root=new StackPane(gridPane2);
            Scene scene2 = new Scene(root,600,600);
            primaryStage.setTitle("Sign Up");
            primaryStage.setWidth(700);
            primaryStage.setHeight(500);
            primaryStage.show();
            String csss = Objects.requireNonNull(getClass().getResource("Style.css")).toExternalForm();
            scene2.getStylesheets().add(csss);
            primaryStage.setScene(scene2);
        });
        back.setOnAction((ActionEvent)->{
            StackPane st2=new StackPane(gridPane);
            Scene scene = new Scene(st2, 600, 600);
            String css = getClass().getResource("Style.css").toExternalForm();
            scene.getStylesheets().add(css);
            primaryStage.setTitle("Hello!");
            primaryStage.setScene(scene);
            primaryStage.show();

        });
        btn1.setOnAction((ActionEvent e) -> {
            try {
                conn = database.DBconnect();
                String sql = "INSERT into STUDATA (id,name,major,minor) VALUES(?,?,?,?) ";
                pst = conn.prepareStatement(sql);
                pst.setString(2, t2.getText());
                pst.setString(1, t1.getText());
                pst.setString(3, t3.getText());
                pst.setString(4, t4.getText());
                int i = pst.executeUpdate();
                if (i == 1) {
                    System.out.println("done");
                } else {
                    System.out.println("no");
                }
                pst.close();
                conn.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        });
        btn2.setOnAction((ActionEvant) -> {
            t1.clear();
            t2.clear();
            t3.clear();
            t4.clear();

        });
        btn3.setOnAction((ActionEvant) -> {
            try {
                conn = database.DBconnect();
                String sql = "UPDATE STUDATA set major=?  WHERE id=?  ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, t6.getText());
                pst.setString(2, t5.getText());
                int i = pst.executeUpdate();
                if (i == 1) {
                    System.out.println("done");
                } else {
                    System.out.println("NO");
                }
                pst.close();
                conn.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        });
        btn4.setOnAction((ActionEvent) -> {
            try {
                conn = database.DBconnect();
                String sql = "DELETE from STUDATA WHERE id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, t7.getText());
                int i = pst.executeUpdate();
                if (i == 1) {
                    System.out.println("done");
                } else {
                    System.out.println("NO");
                }
                pst.close();
                conn.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        });
        //Going To Coureses sene
        btn5.setOnAction((ActionEvent) -> {
            Button addc = new Button();
            addc.setText("Add Couese");
            Button clear = new Button();
            clear.setText("Clear");
            Text mainLabelscene = new Text("Add New Course");
            mainLabelscene.setId("text2");
            Label code = new Label("Course code");
            Label title = new Label("Title");
            Label num = new Label("Course Number");
            Button last = new Button("Last");
            TextField codet = new TextField();
            TextField titlet = new TextField();
            TextField numt = new TextField();
            GridPane news = new GridPane();
            news.add(mainLabelscene, 0, 0);
            news.add(code, 0, 1);
            news.add(codet, 1, 1);
            news.add(title, 0, 2);
            news.add(titlet, 1, 2);
            news.add(num, 0, 3);
            news.add(numt, 1, 3);
            news.add(addc, 0, 4);
            news.add(last, 0, 5);
            last.setOnAction((ActionEvent x) -> {
                StackPane root = new StackPane();
                root.getChildren().add(vbox);
                Scene scene = new Scene(root, 650, 650);
                String css = getClass().getResource("Style.css").toExternalForm();
                scene.getStylesheets().add(css);
                primaryStage.setTitle("Student System mangment..Welcome");
                primaryStage.setScene(scene);
                primaryStage.show();
            });
            news.setVgap(10);
            news.setHgap(10);
            news.setAlignment(Pos.CENTER);
            addc.setOnAction((ActionEvent e) -> {
                try {
                    conn = database.DBconnect();
                    String sql = "INSERT into STUDENTCOURSES (COURSECODE,COURSETITLE,COURSENUM) VALUES(?,?,?) ";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, codet.getText());
                    pst.setString(2, titlet.getText());
                    pst.setString(3, numt.getText());
                    int i = pst.executeUpdate();
                    if (i == 1) {
                        System.out.println("DONE");
                    } else {
                        System.out.println("no");
                    }
                    pst.close();
                    conn.close();

                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            });
            StackPane root2 = new StackPane();
            root2.getChildren().add(news);
            Scene scene = new Scene(root2, 700, 700);
            String css = getClass().getResource("Style.css").toExternalForm();
            scene.getStylesheets().add(css);
            primaryStage.setTitle("Course Rigseration System");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        btn10.setOnAction((ActionEvent) -> {
            try {
                conn = database.DBconnect();
                String sql = "SELECT* from STUDENTCOURSES";
                pst = conn.prepareStatement(sql);
                res = pst.executeQuery();
                while (res.next()) {
                    Label show2 = new Label(res.getString(1) + "  " + res.getString(2) + "  " + res.getString(3));
                    GridPane gf = new GridPane();
                    gf.add(show2, 1, 1);
                    gf.setAlignment(Pos.CENTER);
                    StackPane root4 = new StackPane();
                    root4.getChildren().add(gf);
                    Scene scene = new Scene(root4, 700, 700);
                    primaryStage.setTitle("Student System mangment..Welcome");
                    String css = getClass().getResource("Style.css").toExternalForm();
                    scene.getStylesheets().add(css);
                    primaryStage.setScene(scene);
                    primaryStage.show();

                }
                int i = pst.executeUpdate();
                if (i == 1) {
                    System.out.println("Done");
                } else {
                    System.out.println("no");
                }
                pst.close();
                conn.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        });
        btn6.setOnAction((ActionEvent e) -> {
            try {
                conn = database.DBconnect();
                String sql = "SELECT*from STUDATA";
                pst = conn.prepareStatement(sql);
                res = pst.executeQuery();
                while (res.next()) {
                    Label sh2 = new Label(res.getNString(1) + "  " + res.getNString(2) + "  " + res.getNString(3) + "   " + res.getNString(4));
                    System.out.println();
                    GridPane show = new GridPane();
                    show.add(sh2, 0, 1);
                    show.setAlignment(Pos.CENTER);
                    show.setVgap(0);
                    show.setHgap(10);
                    StackPane root = new StackPane();
                    root.getChildren().add(show);
                    Scene scene22 = new Scene(root, 700, 700);
                    String css = getClass().getResource("Style.css").toExternalForm();
                    scene22.getStylesheets().add(css);
                    primaryStage.setTitle("Data");
                    primaryStage.setScene(scene22);
                    primaryStage.show();
                }

                int i = pst.executeUpdate();
                if (i == 1) {
                    System.out.println("Done");
                } else {
                    System.out.println("no");
                }
                pst.close();
                conn.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }

        });
//table seen
        table.setOnAction((ActionEvent)-> {
            TableView<Student> r1;
            Label l= new Label("Student Information: ");
            l.getStyleClass().add("labl");
            Label id= new Label("ID");
            TextField idTextField= new TextField();
            Label firstName= new Label("FirstName");
            TextField firsNameTextField= new TextField();
            Label lastName= new Label("LastName");
            TextField lastNameTextField= new TextField();
            Label gpa= new Label("GPA");
            TextField gpaTextField= new TextField();

            Label major= new Label("Major");
            TextField majorTextField= new TextField();
            Label minor= new Label("Minor");
            TextField minorTextField= new TextField();

            Button btnAdd= new Button("Add");
            Button btnClear= new Button("clear");

            Label search= new Label("Search");
            TextField srch= new TextField();
            srch.setPrefWidth(300);
            Button courseView=new Button("courses");
            Button last1=new Button("Back");
            GridPane g= new GridPane();
            g.add(l, 0, 0, 2, 1);
            g.add(id, 0, 1);
            g.add(idTextField, 1, 1);
            g.add(firstName, 0, 2);
            g.add(firsNameTextField, 1, 2);
            g.add(lastName, 0, 3);
            g.add(lastNameTextField, 1, 3);
            g.add(gpa, 0, 4);
            g.add(gpaTextField, 1, 4);
            g.add(major, 0, 5);
            g.add(majorTextField, 1, 5);
            g.add(minor, 0, 6);
            g.add(minorTextField, 1, 6);
            g.add(btnAdd, 0, 7);
            g.add(btnClear, 1, 7);
            g.add(courseView, 0, 8);
            g.add(last1,0,9);
            g.setVgap(20);
            g.setHgap(20);
            //g.setPadding(new Insets(20));

            HBox h= new HBox(search, srch);
            //h.setPadding(new Insets(20, 0 ,20, 100));
            h.setSpacing(50);
            last1.setOnAction((ActionEvent event2)->{
              StackPane s1=new StackPane();
              s1.getChildren().add(vbox);
                Scene scene = new Scene(s1, 700, 700);
                String css = getClass().getResource("Style.css").toExternalForm();
                scene.getStylesheets().add(css);
                primaryStage.setTitle("Hello!");
                primaryStage.setScene(scene);
                primaryStage.show();
                    });

            r1=new TableView<>();
            r1.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            r1.setPlaceholder(new Label("No rows to display"));

            TableColumn<Student,Long> c1 =new TableColumn<>("ID");
            c1.setMinWidth(100);
            c1.setCellValueFactory(new PropertyValueFactory<>("Id"));

            TableColumn<Student,String> c2 =new TableColumn<>("FirstName");
            c2.setMinWidth(100);
            c2.setCellValueFactory(new PropertyValueFactory<>("firstName"));

            TableColumn<Student,String> c3 =new TableColumn<>("SecondName");
            c3.setMinWidth(100);
            c3.setCellValueFactory(new PropertyValueFactory<>("secondName"));

            TableColumn<Student,String> c4 =new TableColumn<>("GPA");
            c4.setMinWidth(100);
            c4.setCellValueFactory(new PropertyValueFactory<>("GPA"));

            TableColumn<Student,String> c5 =new TableColumn<>("Major");
            c5.setMinWidth(100);
            c5.setCellValueFactory(new PropertyValueFactory<>("major"));

            TableColumn<Student,String> c6 =new TableColumn<>("Minor");
            c6.setMinWidth(100);
            c6.setCellValueFactory(new PropertyValueFactory<>("minor"));

            r1.getColumns().addAll(c1,c2,c3,c4,c5,c6);

            Student stu1 = new Student(2001, "Fade", "ehab", "cs", "stat", 3.14);
            Student stu2 = new Student(2002, "ramy", "ahmed", "cs", "cs", 3.14);
            Student stu3 = new Student(2003, "Ahamed", "ashraf", "cs", "math", 3.7);
            Student stu4 = new Student(2004, "Ibrahim", "soliman", "cs", "cs", 3.5);
            Student stu5 = new Student(2004, "Ahmed", "Fayad", "cs", "Stat", 3.5);
            ObservableList<Student> data = FXCollections.observableArrayList();
            data.addAll(stu1,stu2,stu3,stu4);
            try {
                conn = database.DBconnect();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                pst = conn.prepareStatement("SELECT id,name,major,minor from STUDATA ");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                res = pst.executeQuery();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            while (true) {
                try {
                    if (!res.next()) break;
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    data.add(new Student(res.getInt(1), res.getString(2), res.getString(3), res.getString(4)));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                pst.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            r1.setItems(data);
            //Wrap the ObservableList in a FilteredList (initially display all data).
            FilteredList<Student> filter= new FilteredList<>(data, e-> true);

            //Will be notified whenever the value of the ObservableValue changes.
            srch.textProperty().addListener((ObsValue, oldValue, newValue)->{
                filter.setPredicate(st ->{
                    // If filter text is empty, display all students.
                    if(newValue == null || newValue.isEmpty())
                        return true;
                    String s= newValue.toLowerCase();
                    if(Integer.toString(st.getId()).contains(s))
                        return true;
                    else if(st.getFirstName().toLowerCase().contains(s))
                        return true;
//                    else if(stu.getSecondName().toLowerCase().contains(s))
//                        return true;
                    else if(st.getMajor().toLowerCase().contains(s))
                        return true;
                    else if(st.getMinor().toLowerCase().contains(s))
                        return true;
//                    else if(Double.toString(stu.getGPA()).contains(newValue))
//                        return true;
                    return false;
                });
                //Wrap the FilteredList in a SortedList.
                SortedList <Student> sort= new SortedList<>(filter);
                sort.comparatorProperty().bind(r1.comparatorProperty());
                r1.setItems(sort);
            });


            btnAdd.setOnAction((ActionEvent event) -> {

                int vid= Integer.parseInt(idTextField.getText());
                String vname1= firsNameTextField.getText();
                String vname2= lastNameTextField.getText();
                double vcgpa= Double.parseDouble(gpaTextField.getText());
                String vmajor= majorTextField.getText();
                String vminor= minorTextField.getText();

                r1.getItems().add(new Student(vid, vname1,vname2 ,vmajor,vminor,vcgpa));


            });

            btnClear.setOnAction((ActionEvent event) -> {

                idTextField.clear();
                firsNameTextField.clear();
                lastNameTextField.clear();
                gpaTextField.clear();
                majorTextField.clear();
                minorTextField.clear();
            });
            VBox v= new VBox(r1);
            //v.setPadding(new Insets(20));
            FlowPane root= new FlowPane(g,v,h);
            Scene scene3 = new Scene(root, 650, 650);
            String css3 = getClass().getResource("Style.css").toExternalForm();
            scene3.getStylesheets().add(css3);
            primaryStage.setTitle("Student System mangment..Welcome");
            primaryStage.setScene(scene3);
            primaryStage.show();
            //new table button start from here
            courseView.setOnAction((ActionEvent b)->{
                Label iz= new Label("Course Information: ");
                l2.getStyleClass().add("labl");
                Label coursename= new Label("Course Name");
                TextField coursenameTextField= new TextField("");
                Label coursecode= new Label("Course Code");
                TextField coursecodeTextField= new TextField("");
                Label coursetitle= new Label("Course Title");
                TextField coursetitleTextField= new TextField("");
                Button btnAdd2= new Button("Add");
                Button btnClear2= new Button("clear");
                Button last=new Button("Back");
                Label search1=new Label("search");
                TextField srch1=new TextField();
                VBox v3=new VBox(search1,srch1);
                ImageInput o=new ImageInput();
                GridPane gs= new GridPane();
                gs.add(iz, 0, 0, 2, 1);
                gs.add(coursename, 0, 1);
                gs.add(coursenameTextField, 1, 1);
                gs.add(coursecode, 0, 2);
                gs.add(coursecodeTextField, 1, 2);
                gs.add(coursetitle, 0, 3);
                gs.add(coursetitleTextField, 1, 3);
                gs.add(btnAdd2, 0, 7);
                gs.add(btnClear2, 1, 7);
                gs.add(last,1,8);
                gs.add(v3,6,1,3,1);
               // gs.add(o,1,8);
                gs.setVgap(20);
                gs.setHgap(20);
                TableView<Courses> r2 = new TableView();
                r2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                r2.setPlaceholder(new Label("No rows to display"));
                TableColumn<Courses,String> c11 =new TableColumn<>("Course Name");
                c11.setMinWidth(100);
                c11.setCellValueFactory(new PropertyValueFactory<>("Coursename"));
                TableColumn<Courses,String> c22 =new TableColumn<>("Course Code");
                c22.setMinWidth(100);
                c22.setCellValueFactory(new PropertyValueFactory<>("Coursecode"));
                TableColumn<Courses,String> c33 =new TableColumn<>("Course Title");
                c33.setMinWidth(100);
                c33.setCellValueFactory(new PropertyValueFactory<>("Coursetitle"));
                r2.getColumns().addAll(c11, c22, c33);
                ObservableList<Courses> data1 = FXCollections.observableArrayList();
                Courses co=new Courses("ph207","#234&5","Physiscs");
                Courses co1=new Courses("Electronics","#2393&5","Physiscs");
                Courses co2=new Courses("ph210","#234&5mn","Physiscs10");
                data1.addAll(co,co1,co2);
                try {
                    conn = database.DBconnect();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    pst = conn.prepareStatement("SELECT COURSETITLE,COURSECODE,COURSENUM from STUDENTCOURSES");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    res = pst.executeQuery();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                while (true) {
                    try {
                        if (!res.next()) break;
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        data1.add(new Courses( res.getString(1), res.getString(2), res.getString(3)));
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    pst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                r2.setItems(data1);
                FilteredList<Courses> filter1= new FilteredList<>(data1, e-> true);

                //Will be notified whenever the value of the ObservableValue changes.
                srch1.textProperty().addListener((ObsValue, oldValue, newValue)->{
                    filter1.setPredicate(cor ->{
                        // If filter text is empty, display all students.
                        if(newValue == null || newValue.isEmpty())
                            return true;
                        String s1= newValue.toLowerCase();
                        if(cor.getCoursecode().toLowerCase().contains(s1))
                            return true;
                    else if(cor.getCoursename().toLowerCase().contains(s1))
                        return true;
                        else if(cor.getCoursetitle().toLowerCase().contains(s1))
                            return true;
                        return false;
                    });
                    //Wrap the FilteredList in a SortedList.
                    SortedList <Courses> sort1= new SortedList<>(filter1);
                    sort1.comparatorProperty().bind(r2.comparatorProperty());
                    r2.setItems(sort1);
                });

                btnAdd2.setOnAction((ActionEvent even) -> {
                    r2.getItems().add(new Courses(coursenameTextField.getText(),coursecodeTextField.getText() ,coursetitleTextField.getText()));
                });
                btnClear2.setOnAction((ActionEvent event2) -> {
                    coursenameTextField.clear();
                    coursecodeTextField.clear();
                    coursetitleTextField.clear();
                });

                VBox v2= new VBox(r2);
                FlowPane root11 = new FlowPane(gs, v2);
                Scene scene122 = new Scene(root11, 700, 700);
                String css1 = getClass().getResource("Style.css").toExternalForm();
                scene122.getStylesheets().add(css1);
                primaryStage.setTitle("Courses Table..Welcome");
                primaryStage.setScene(scene122);
                primaryStage.show();
                last.setOnAction((ActionEvent event33)->{
                    StackPane s=new StackPane();
                    s.getChildren().add(vbox);
                    Scene scene = new Scene(s, 700, 700);
                    String css = getClass().getResource("Style.css").toExternalForm();
                    scene.getStylesheets().add(css);
                    primaryStage.setTitle("Hello!");
                    primaryStage.setScene(scene);
                    primaryStage.show();
                });
            });

        });


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(gridPane, 600, 600);
        String css = getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//    public void show() throws SQLException {
//        data = FXCollections.observableArrayList();
//        conn = datebase.DBConnect();
//        pst = conn.prepareStatement("select * from studata");
//        res = pst.executeQuery();
//        while (res.next()) {
//            data.add(new Student(res.getInt(1), res.getString(2), res.getDouble(3), res.getString(4)));
//        }
//        pst.close();
//        conn.close();
//        table.setItems(data);
//    }

    public static void main(String[] args) {
        launch();
    }
}