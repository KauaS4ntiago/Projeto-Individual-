import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				usuario us1 = new usuario();
					System.out.print("Digite seu nome de usuário:");
		String nomeDeUsuario = sc.nextLine();
				us1.setNomeUser(nomeDeUsuario);
					System.out.printf("Digite seu email %s: ",us1.getNomeUser());
		String email = sc.nextLine();
				us1.setEmail(email);
					System.out.printf("Digite sua senha %s: ",us1.getNomeUser());
		String senha = sc.nextLine();
				us1.setSenha(senha);
					System.out.printf("Digite seu número de telefone %s: ",us1.getNomeUser());
		String numeroCelular = sc.nextLine();
					System.out.println("Agora nos informe seus dados pessoais.");
					System.out.println("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine();			
				us1.setNomeCompleto(nomeCompleto);
					System.out.println("Digite seu cpf: ");
		String cpf = sc.nextLine();
				us1.setCpf(cpf);
					System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
				us1.setIdade(idade);
					conteudo co1 = new conteudo();
				co1.setTitulo ("Vingadores: Ultimato");
		        co1.setGenero ("Ação/Ficção científica");
		        co1.setClassificacaoIndicada (12);
		        co1.setIdioma ("Portugues-Brasil");
		        co1.setLegenda (null);
		        	Assinatura as1 = new Assinatura();
		        as1.setConteudoAdicional(null );
		        as1.setDescricaoDaAssinatura(null);
		        as1.setNomeDaAssinatura("Premium");
		        as1.setPrecoAssinatura(59.90);
		        as1.setQtdTelas(4);
		sc.close();
	}
}
