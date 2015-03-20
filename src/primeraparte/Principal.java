/*
 * Clase Principal del la primera parte del proyecto
 */
package primeraparte;


import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Alejandra Martinez Cuevas
 * @author David Sanchez Almanza
 * @version 1.0.0
 * @since 14-03-2015
 */
public class Principal extends ArrayList<String>
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<String> estados = new ArrayList<>();
		ArrayList<String> ab = new ArrayList<>();
		ArrayList<String> ini = new ArrayList<>();
		ArrayList<String> fin = new ArrayList<>();
		char e1, e2, e3;
		BufferedReader reader = new BufferedReader(new FileReader("archivoprueba.txt"));
		while ((e1 = (char) reader.read()) != '\n')
		{
			if (e1 == 'q') {
				e2 = (char) reader.read();
				e3 = (char) reader.read();
				String e = new StringBuilder().append(e1).append(e2).toString();
				estados.add(e);
			}
		}
		while ((e1 = (char) reader.read()) != '\n')
		{
			if (e1 != 'q') {
				e2 = (char) reader.read();
				String e = new StringBuilder().append(e1).toString();
				ab.add(e);
			}
		}
		while ((e1 = (char) reader.read()) != '\n')
		{
			if (e1 == 'q') {
				e2 = (char) reader.read();
				reader.read();
				String e = new StringBuilder().append(e1).append(e2).toString();
				ini.add(e);
			}
		}
		while ((e1 = (char) reader.read()) != '\n')
		{
			if (e1 == 'q') {
				e2 = (char) reader.read();
				String e = new StringBuilder().append(e1).append(e2).toString();
				fin.add(e);
			}
		}

		ArrayList<String> tabla = new ArrayList<String>();
		int size = estados.size() * ab.size();
		while((e1 = (char) reader.read()) != '\n')
		{
			if (e1 == 'q')
			{
				e2 = (char) reader.read();
				String e = new StringBuilder().append(e1).append(e2).toString();
				tabla.add(e);
			}
			if (e1 == '=')
			{
				reader.read();
			}
			if (e1 != 'q')
			{
				String e = new StringBuilder().append(e1).toString();
			}
		}
		System.out.print(estados);
		System.out.println();
		System.out.print(ab);
		System.out.println();
		System.out.print(ini);
		System.out.println();
		System.out.print(fin);
		System.out.println();
		System.out.print(tabla);
		System.out.println();
	}
}