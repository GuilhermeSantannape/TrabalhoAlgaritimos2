import java.io.FileNotFoundException;
import java.text.ParseException;

public class Principal {

	
	public static void main(String[] args) throws FileNotFoundException, ParseException {
			ImportaCSV.run();
		
			Funcao.DeclaraFuncao();
			//Funcao.MostraFuncao();
			//Periodo.DeclaraTempo();
			//Periodo.MostraTempo();
		//	Pessoas.MostraParticiantes();
		//	Pessoas.SelecionaParticiapnte();
		
			//Funcao.EscolhePalestrante();
			//Funcao.EscolheOrganizador();
			Funcao.EscolheParticipantes();
			
		//	System.out.println(ImportaCSV.contato[1]);
	//		ImportaCSV.contato[1].setFunção("Palestrantes");
		 //System.out.print(ImportaCSV.contato[1]+ImportaCSV.contato[1].getFunção());
		// 	
		 
	}




}
