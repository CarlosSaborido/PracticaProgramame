package F_Maquinista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws IOException  {
		String fich = "Prueba.txt";
		File prueba = new File (fich);
		Writer salida = null;
		Scanner s = null;
		long basura ;
		long toneladas ;
		long distancia ;
		long pago_milla;
		long costes_milla;
		long costes_mprima;
		long costes_peones;
		long ben_total;
		long cost_total;
		try {	
			salida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Resultado.txt")));
			s = new Scanner(prueba);
			basura = s.nextInt();
			int a = 0;
		while(a <= basura) {
			 toneladas = s.nextInt();
			 distancia = s.nextInt();
			 pago_milla = s.nextInt();
			 costes_milla = s.nextInt();
			 costes_mprima = s.nextInt();
			 costes_peones = s.nextInt();
			 ben_total = toneladas * distancia * pago_milla;
			 cost_total = costes_milla * distancia * 2 + (costes_mprima + costes_peones);
			 salida.write (ben_total-cost_total + "\n");
			 a++;
			 
		}
		}
		catch(Exception e ) {
		}
		finally
		{
			salida.close();
			try
			{
				if (s != null)
					s.close();
				
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
