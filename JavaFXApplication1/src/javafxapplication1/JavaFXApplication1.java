/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javafx.scene.control.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javafx.beans.value.ChangeListener;
import javafx.scene.effect.DropShadow;
import static javafx.stage.StageStyle.TRANSPARENT;
import javax.swing.*;
import static javax.swing.Spring.width;

public class JavaFXApplication1 extends Application {
    
    
    
    
    public static String Result(String searchedInput,ResultList[] hashtable)
    {
        
        
        
        //Here find the input key hahaha
        
        String inputWord = searchedInput; 
        int hash = inputWord.hashCode()%34;
                                if(hash < 0)
                              hash = -hash;
                                System.out.println(hash);
        
                                
             ResultList ResultListFromHashTable = hashtable[hash];
                           
              
        //    
String oneObjectResultString = "";        
        int counter=0;
        ResultList.Node ME =     ResultListFromHashTable.head;
        while (ME != null) { 
        
            if (inputWord.equals(ME.filename.getWord()))
            {
                counter++;
            
            System.out.println("File Name is : "+ ME.filename.getFileName());
            System.out.println("Line no : "+ME.filename.getFileLineNO());
            
            System.out.println("Search Input is : " +ME.filename.getWord());
            
                    
           oneObjectResultString =  oneObjectResultString + "\nFile Name : " +ME.filename.getFileName()
      + "\n Line number : " + ME.filename.getFileLineNO();
      
            }
     ME = ME.next;
            }  
        
        oneObjectResultString= oneObjectResultString   +"\n Total Words : " +Integer.toString(counter);
   oneObjectResultString = oneObjectResultString + "Happy Coding :)";
          System.out.println("Total Words in all Files : "+counter);
          System.out.println("Happy Coding :)");
     
        
                
         
        
        
        
        
        
        
        
        
        
        return oneObjectResultString;
    
    
    
    
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        Application.launch(args);
        
         
           
              
              
              
              
              
              
              
              
              
              
              
              
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException, IOException {
        
        
        Button indexfile = new Button("Start Indexing");
        
        
         ResultList[] hashtable = new ResultList[34];
        for(int i=0; i<hashtable.length; i++)
    {
    hashtable[i] = new ResultList();
              // System.out.println(i);
    }
          // TODO code application logic here
//    //Module 1
        File directoryPath = new File("E:\\Study\\smester 4\\DSA\\DSA Proj\\dictionary project\\src\\dictionary\\project");
        System.out.println("\n------------Text files------------");
		File[] files=directoryPath.listFiles(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
        
             LinkList FileNameList = new LinkList(); 

                      
               
              for (File file : files) {
			
                      FileNameList.insert(FileNameList,file.getName() ); 
                       // System.out.println(file.getName());               
		}
        
                    
              // Method to print the LinkedList. 
        
              
              //ResultLinkList SearchResult =  new ResultLinkList();
            ResultList SearchResult = new ResultList();
            
////    
        LinkList.Node currNode = FileNameList.head; 
 ////           
        while (currNode != null) { 
            //System.out.print( + "\n"); 
            
                  FileInputStream fstream = new FileInputStream("E:\\Study\\smester 4\\DSA\\DSA Proj\\dictionary project\\src\\dictionary\\project\\"+currNode.filename);
           
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
               // Jarvis new object created 
            
            String strLine;
            int counter = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                counter++;
              // Print the content on the console
              //System.out.println (strLine);
              strLine.split(" ");  //Split the word using space
                for (String word :  strLine.split(" ")) 
                {
                    try{
                        Jarvise objectJarvis = new Jarvise();
                            //store data word , filename, line no = counter
                            objectJarvis.setWord(word);
                            objectJarvis.setFileName(currNode.filename);
                            objectJarvis.setFileLineNO(counter);
                            //getword from object jarvise
                            objectJarvis.getWord();
                            //hash function
                            
                          //Object Creation completed 
                             int hash = word.hashCode()%34;
                                if(hash < 0)
                              hash = -hash;
                                //System.out.println(hash);
    
                                objectJarvis.setHashValue(hash);
                                ResultList hashTableJarvisList = hashtable[objectJarvis.getHashValue()];
                               // if (hashTableJarvisList != null)
                                //{
                                hashTableJarvisList.insert(hashTableJarvisList,objectJarvis);
                    
                                //}
                                }catch(Exception ex)
                    {
                    System.out.println (ex);
              
                    
                    }
           
                 }// For loop end of line split 
                }//Line Loop end  
            currNode = currNode.next; 
        
        }
        
        
        
        
        
        
        
        
        Label nameLbl = new Label("Jarvis Search Engine:");
        nameLbl.setEffect(new DropShadow());
        //nameLbl.setFont(new Font("Arial", 30 , 30));

       
       

           
        nameLbl.setStyle("-fx-text-fill: MINTCREAM;");

       
        TextField nameFld = new TextField();
       //nameFld.setStyle("-fx-text-fill:red; -fx-font-size:hanh12px;");
        //nameFld.setPromptText("Enter Word here that you want to search."); 
        // nameFld.relocate(50,50);
         nameFld.setPromptText("Enter Word here that you want to search.");
         nameFld.setFocusTraversable(false);
      
       nameFld.setStyle("-fx-background-color:OLDLACE");
        nameFld.setPrefSize(0, 13);
        nameFld.setEffect(new DropShadow());
                nameFld.setMinWidth(50);
        nameFld.setPrefWidth(50);
        nameFld.setMaxWidth(450);
        
        
        Label msg = new Label();
        msg.setStyle("-fx-text-fill: OLDLACE;");
      
        
        Button sayHelloBtn = new Button("Search");
        sayHelloBtn.setAlignment(Pos.BASELINE_CENTER);  
        sayHelloBtn.setPrefSize(150, 3);
       sayHelloBtn.setStyle("-fx-background-color: SEASHELL;"); 
       sayHelloBtn.setEffect(new DropShadow());
        
        Button exitBtn = new Button("Exit");
          exitBtn.setStyle("-fx-background-color: WHEAT;"); 
        exitBtn.setPrefSize(75,2);
        exitBtn.setEffect(new DropShadow());
         
          
        sayHelloBtn.setOnAction(e -> { 
            
            String searchedInput = nameFld.getText();
                
                msg.setText(Result(searchedInput,hashtable));
      
		             
           
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        exitBtn.setOnAction(e -> Platform.exit());
                    
                
        VBox root = new VBox();
        
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);

        Scene scene = new Scene(root, 600, 600);
         root.setStyle("-fx-background-color: SIENNA");
         
        stage.setScene(scene);
        stage.show();
        
    }
    
   
   
    
}