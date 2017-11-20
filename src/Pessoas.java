import java.util.Scanner;
public class Pessoas {
	private  String Nome;
	private String Email;
	private String Função;

	public static  void MostraParticiantes() {
		
		
		for(int i=0;i<ImportaCSV.contato.length;i++)
		System.out.println("Codigo da funcao"+"["+i+"]"+ImportaCSV.contato[i]);
		
	}
	public static void  SelecionaParticiapnte() {
		Scanner Dig = new Scanner(System.in);
		System.out.print("Selecione Participante");
		Pessoas itemSeleciona;
		String 	itemSelecionar;
		
		
	
		for(int i=0;i<ImportaCSV.contato.length;i++ ) {
			itemSelecionar=Dig.nextLine();
			if(itemSelecionar.equals(ImportaCSV.contato[i])) {
				
				itemSeleciona=ImportaCSV.contato[i];
				System.out.println(ImportaCSV.contato[i]);
				System.out.print(itemSeleciona);
			}
		}
		
		
		
	} 

	public  String getNome() {
		return Nome;
	}



	public void setNome(String Nome) {
		this.Nome = Nome;
	}



	public String getEmail() {
		return Email;
	}



	public String getFunção() {
		return Função;
	}



	public void setFunção(String função) {
		Função = função;
	}



	public void setEmail(String email) {
		this.Email = email;
	}



	@Override
	public String toString() {
		return "Contatos [ Nome= "+getNome() + " /Email= "  + getEmail() +"]"+"Funcão "+getFunção();
	}







	
	

}
