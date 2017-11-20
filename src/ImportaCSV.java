 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
  import java.util.Scanner;
  
  public class ImportaCSV {

 	 static int tam=10;
 	 static Pessoas contato[]=new Pessoas[tam];
  	
  	private static File csv = new File("arquivo.csv");	
  	
 
 	  static void run() {
 		 String linha = "";
 	     try { Scanner ler = new Scanner(csv);
 	        String linhas = new String();
 	        for (int i =0;i<contato.length;i++) {	
 	        	contato[i]=new Pessoas();}
 
 		
             int contador=0;
             while(ler.hasNext()){
             	linhas = ler.nextLine();
                 String[] Divide = linhas.split(",");
                 contato[contador].setNome(Divide[0]);
               contato[contador].setEmail(Divide[1]);
                 contador++;}
                        
 	        
 	    
 	 } catch (IOException e) 
 	     { e.printStackTrace();  } finally {
 	        if (csv != null) {
 	        	
 	        }
 	    }
 	  }
 
 	public static void arquivo() {
 		run();}
 
 }