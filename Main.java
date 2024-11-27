import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome de usuário:");
		String nomeDeUsuario = sc.nextLine();
		System.out.print("Digite sua senha:");
		String senha = sc.nextLine();
		Usuario us = new Usuario(nomeDeUsuario, senha);
		System.out.println("O que deseja fazer:");
		System.out.println("1-Insira dados pessoais(login necessário)");
		System.out.println("2-Ver assinaturas e conteúdos");
		System.out.println("3-Sair");
		int n = sc.nextInt();
		sc.nextLine();
		if (n == 1) {
			System.out.println("Login:");
			System.out.print("Digite seu nome de usuário: ");
			nomeDeUsuario = sc.nextLine();
			System.out.print("Digite sua senha: ");
			senha = sc.nextLine();

			if (us.autenticao(nomeDeUsuario, senha) == true) {
				System.out.println("Digite seu nome completo:");
				String nomeCompleto = sc.nextLine();
				us.setNomeCompleto(nomeCompleto);
				System.out.println("Digite seu email para contato:");
				String email = sc.nextLine();
				us.setEmail(email);
				System.out.println("Digite seu número de telefone para contato:");
				String numeroCelular = sc.nextLine();
				us.setNumeroCelular(numeroCelular);
				System.out.println("Digite seu Cpf:");
				String cpf = sc.nextLine();
				us.setCpf(cpf);
				System.out.println("Digite sua idade:");
				int idade = sc.nextInt();
				us.setIdade(idade);
				System.out.println("Dados preenchidos!");
			} else {
				System.out.println("Tente novamente mais uma vez:");
				System.out.print("Digite seu nome de usuário: ");
				nomeDeUsuario = sc.nextLine();
				System.out.print("Digite sua senha: ");
				senha = sc.nextLine();
				us.autenticao(nomeDeUsuario, senha);
			}
		} else if (n == 2) {
			Assinatura as = new Assinatura("Premium", "Luxuosa", 69.99, 6, "4k, conteúdos exclusivos e sem anúncios");
			System.out.println(as.toString());
			as.setNomeDaAssinatura("Individual");
			as.setDescricaoDaAssinatura("Básica");
			as.setPrecoAssinatura(29.99);
			as.setQtdTelas(2);
			as.setConteudoAdicional("Dowloads com anúncios");
			System.out.println(as.toString());
		} else if (n == 3) {

		} else {
			System.out.println("ERROR");
		}
		sc.close();
	}
}

