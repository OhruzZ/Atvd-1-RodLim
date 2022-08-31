import java.util.Scanner;

public class atvd1 {
	 public static void main(String[] args) {
	        int nota1, nota2, media; 
	        Scanner input = new Scanner(System.in);
	        System.out.println("Digite a nota do primeiro bimestre:");
	        nota1 = input.nextInt();
	        nota1= nota1*2;
	        System.out.println("Digite a nota do segundo bimestre:");
	        nota2 = input.nextInt();
	        nota2= nota2*3;
	        
	        media = ((nota1 + nota2)/2);
	        System.out.println("A media final e : " + media);
	        
	        
	        
	    }
	}


