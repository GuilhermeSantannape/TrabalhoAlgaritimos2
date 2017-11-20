
public class Periodo {
	private static int Tam=3;
private static	int[] Inicio = new int[Tam];
private static	int[] Fim = new int[Tam];
	
	public static  void DeclaraTempo  () {
	int inti1=8;
	Inicio[0]=inti1;
	int inti2=13;
	Inicio[1]=inti2;
	int inti3=18;
	Inicio[2]=inti3;
	int fim1=12;
	Fim[0]=fim1;
	int fim2=17;
	Fim[1]=fim2;
	int fim3=23;
	Fim[2]=fim3;
	
	}
	
	public static void MostraTempo() {
		for(int i=0;i<Tam;i++){
			System.out.println("Horario do incio "+Inicio[i]+":00"+ " Horario do fim "+Fim[i]+":00");}

	}
	
	
	/*public static void CalculaEstadia() {
	int	Resultado=0;
	
	Resultado=inicio [];
		
		
	}
	*/
	}