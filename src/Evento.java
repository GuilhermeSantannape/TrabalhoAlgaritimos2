
public class Evento {
	private final int Tam=5;
	Evento[] Event=  new Evento[Tam];
	
	private  void CriaEvento() {
		

	}

	public Object SelecionaParticipantes() {
		ListaParticipantes();
		
		return null;
	}


	private void ListaParticipantes() {
		for(int i=0;i<ImportaCSV.contato.length;i++) {
			
		 System.out.print(ImportaCSV.contato[i]);	
	}
	
	
	
	
	}
}
