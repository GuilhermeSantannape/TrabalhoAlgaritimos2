import java.util.Scanner;

public class Funcao {
	
	private static int Tam=3;
	private static	String[] Funcao = new String[Tam];
	private static  void DeclaraFuncao  () {
		String inti1="palestrante";
		Funcao[0]=inti1;
		String inti2="organizador";
		Funcao[1]=inti2;
		String inti3="participante";
		Funcao[2]=inti3;
	
		
		}
	
	private static void MostraFuncao() {
		for(int i=0;i<Tam;i++){
			System.out.println("Cod Funcao= "+"["+i+"]"+"Funcão "+Funcao[i]);}

	}
	
	private static void EscolhePalestrante() {

		Scanner dig= new Scanner(System.in);
		int codfuncao=1;
		boolean condicao=true;
		String NomeParticipante="";
		int CodParticipante=0;
		
	
		do {
			System.out.println("Seleciona pessoa que sera Palestrante do Evento:  ");
			Pessoas.MostraParticiantes();
			NomeParticipante=dig.nextLine();
		
			for(int i=0;i<ImportaCSV.contato.length;i++) {
				if(NomeParticipante.equals(ImportaCSV.contato[i].getNome())) {
					ImportaCSV.contato[i].setFunção(Funcao[codfuncao]);
					condicao=false;
					}else {System.out.print("\n\n não foi selecionado um Palestrante\n\n");}
				}
				}while(condicao);
			
		
	
		Pessoas.MostraParticiantes();
		
		
	}
	
	private static void EscolheOrganizador() {

		
		Scanner dig= new Scanner(System.in);
		int codfuncao=1;
		boolean condicao=true;
		String NomeParticipante="";
		
		
	
		do {
			System.out.println("Seleciona pessoa que sera Organizador do Evento:  ");
			Pessoas.MostraParticiantes();
			NomeParticipante=dig.nextLine();
		
			for(int i=0;i<ImportaCSV.contato.length;i++) {
				if(NomeParticipante.equals(ImportaCSV.contato[i].getNome())) {
					ImportaCSV.contato[i].setFunção(Funcao[codfuncao]);
					condicao=false;
					}
			}
				}while(condicao);
			Pessoas.MostraParticiantes();
		}

	private static void EscolheParticipantes() {
		Scanner dig= new Scanner(System.in);
		int codfuncao=2;
		boolean condicao=true;
		boolean condicao2=true;
		String NomeParticipante="";
		int contadorPart=0;
		int Quantpartic=0;
		
		System.out.print("Quantos Pessoas vão assitir a palestra? ");
		contadorPart=dig.nextInt();
		if(contadorPart<0 || contadorPart >=ImportaCSV.contato.length-2) {
			while(condicao2 ){
				System.out.println("valor de participantes invalido favor digite novamente");
				contadorPart=dig.nextInt();
				if(contadorPart>0 || contadorPart <ImportaCSV.contato.length-2) {
					condicao2=false;
				}
			}
				
		}
	
		do {
			
			System.out.println("Seleciona pessoa que sera participante do Evento:  ");
			Pessoas.MostraParticiantes();
			NomeParticipante=dig.nextLine();
		
			for(int i=0;i<ImportaCSV.contato.length;i++) {
				if(NomeParticipante.equals(ImportaCSV.contato[i].getNome())) {
					ImportaCSV.contato[i].setFunção(Funcao[codfuncao]);
					Quantpartic++;
					if(Quantpartic==contadorPart) {
					condicao=false;
					}
				}
			}
				}while(condicao);
			Pessoas.MostraParticiantes();
		}
	
	
	public static void  getMostraFuncao() {
		MostraFuncao();
	}
	public static void  getDeclaraFuncao() {
		DeclaraFuncao();
	}
		
	public static void  getEscolhePalestrante() {
		EscolhePalestrante();
	}
		
	public static void  getEscolheOrganizador() {
		EscolheOrganizador();
	}
	public static void  getEscolheParticipantes() {
		EscolheParticipantes();
	}
	
		
		
	}
	
	


