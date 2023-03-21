public class MainClass 
{
	static String[][] pagella = new String[22][12];
	
	public static void main(String[] args) 
	{
		int i = 0;
		pagella[0][++i] = "Italiano";
		pagella[0][++i] = "Storia";
		pagella[0][++i] = "Ed. Civica";
		pagella[0][++i] = "Inglese";
		pagella[0][++i] = "Matematica";
		pagella[0][++i] = "Informatica";
		pagella[0][++i] = "TPSIT";
		pagella[0][++i] = "Sistemi e Reti";
		pagella[0][++i] = "Telecomunicazioni";
		pagella[0][++i] = "Scienze motorie";
		pagella[0][++i] = "Religione";
		
		int j = 0;
		pagella[++j][0] = "Bortoluzzi";
		pagella[++j][0] = "Cappelluti";
		pagella[++j][0] = "Casamento";
		pagella[++j][0] = "Di Benedetto";
		pagella[++j][0] = "Donizetti";
		pagella[++j][0] = "Durante";
		pagella[++j][0] = "Fiorenza";
		pagella[++j][0] = "Giannetti Di Nunzio";
		pagella[++j][0] = "Imboldi";
		pagella[++j][0] = "Marchesi";
		pagella[++j][0] = "Merlo";
		pagella[++j][0] = "Nessi";
		pagella[++j][0] = "Ottanà";
		pagella[++j][0] = "Paleari";
		pagella[++j][0] = "Pallavicini";
		pagella[++j][0] = "Procopio";
		pagella[++j][0] = "Righetto";
		pagella[++j][0] = "Riva";
		pagella[++j][0] = "Sgrigna";
		pagella[++j][0] = "Vavassori";
		pagella[++j][0] = "Venturelli";
		
		
		
		
	}
	
	void stampaMatrice(String[][] m)
	{
		for(int i = 0; i < m.length;i++)
		{
			for(int j = 0; j < m[0].length;j ++)
			{
				System.out.print(m[i][j]);
			}

		}
	}

}
