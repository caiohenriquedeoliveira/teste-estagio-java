import java.util.Scanner;

class Imc {

	public static void main(String args[]) {
		try{
			float peso;
			float altura;
			float imc;
	 
			// Realizando a leitura dos dados
			Scanner leia = new Scanner (System.in);
			System.out.println("Entre com seu peso: ");
			peso = leia.nextFloat();
			System.out.println("Entre com sua altura: ");
			altura = leia.nextFloat();
			
			// Fazendo o cálculo do IMC
			imc=peso/(altura*altura);
			
			// Exibindo o IMC do usuário 
			System.out.printf("Seu IMC: %.2f \n" ,imc);
			
			// Exibindo situação do usuário
			if (imc < 17){
				System.out.println("Muito abaixo do peso");
			}else if (imc >= 17 && imc<= 18.49){
				System.out.println("Abaixo do peso");
			}else if (imc >= 18.5 && imc<= 24.99){
				System.out.println("Peso normal");
			}else if (imc >= 25 && imc<= 29.99){
				System.out.println("Acima do peso");
			}else if (imc >= 30 && imc<= 34.99){
				System.out.println("Obesidade grau I");
			}else if (imc >= 35 && imc<= 39.99){
				System.out.println("Obesidade grau II");
			}else {
				System.out.println("Obesidade grau III");
			}
		} catch (Exception error) {
			// Captura de erros de dados inválidos.
			System.out.println("Por favor digite os dados corretamente.");
		}
		
	}

}