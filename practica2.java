import java.util.*;

import javax.swing.JOptionPane;
public class practica2
{


	public static void main(String[] args) 
	{
		
		int a,b,resul;
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("primer valor");
		a=Entrada.nextInt();
		
		System.out.println("segundo valor");
		b=Entrada.nextInt();
		
		resul=a+b;
		System.out.println("la suma es "+ resul);
		
		
		
		/*aux=JOptionPane.showInputDialog("primer valor");
		a=Integer.parseInt(aux);
		
		aux=JOptionPane.showInputDialog("segundo valor");
		b=Integer.parseInt(aux);
		
		resul=a+b;
		JOptionPane.showMessageDialog(null,"la suma es "+resul);
		*/
		
		
	}

}
