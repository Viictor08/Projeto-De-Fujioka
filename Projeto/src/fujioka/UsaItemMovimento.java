package fujioka;

import java.util.Scanner;

public class UsaItemMovimento {
	public static void main(String[] args) {
		ItemMovimento item = new ItemMovimento();
		Scanner scan = new Scanner(System.in);
		boolean achou;
		String a, b, c;
		int i, j, k, l, produtos = 0, categorias = 0, clientes = 0, fornecedores = 0;
		System.out.println("nenhum usuario encontrado...");
		System.out.println("criando usuario agora:");
		System.out.println("informe login:");
		item.m.u.setLogin(scan.next());
		System.out.println("informe senha:");
		item.m.u.setSenha(scan.next());
		System.out.println("informe nome:");
		item.m.u.setNome(scan.next());
		System.out.println("informe matricula:");
		item.m.u.setMatricula(scan.next());
		do {
			System.out.println("O que deseja fazer:\n1:sair do programa\n2:fazer login");
			i = scan.nextInt();
			if (i != 1 && i != 2) {
				System.out.println("comando invalido tente novamente");
			}
		} while (i != 1 && i != 2);
		if (i == 2) {
			do {
				System.out.println("informe login:");
				a = scan.next();
				System.out.println("informe senha:");
				b = scan.next();
				if (!(item.m.u.getLogin().equals(a) && item.m.u.getSenha().equals(b))) {
					System.out.println("login ou senha incorretas");
				}
			} while (!(item.m.u.getLogin().equals(a) && item.m.u.getSenha().equals(b)));
		}
		while (i != 1) {
			System.out.println(
					"bem-vindo ao menu,opçoes:\n1:sair\n2:cadastrar produtos\n3:cadastrar categorias\n4:cadastrar clientes\n5:cadastrar fornecedores\n6:efetuar compras\n7:efetuar vendas");
			i = scan.nextInt();
			switch (i) {
			case 1:
				break;
			case 2:
				do {
					System.out.println("o que deseja?\n1-Listagem\n2-Inserção\n3-Alteração");
					j = scan.nextInt();
					if (j < 1 || j > 3) {
						System.out.println("comando invalido, tente novamente");
					}
				} while (j < 1 || j > 3);
				switch (j) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				}
				break;
			case 3:
				do {
					System.out.println("o que deseja?\n1-Listagem\n2-Inserção\n3-Alteração");
					j = scan.nextInt();
					if (j < 1 || j > 3) {
						System.out.println("comando invalido, tente novamente");
					}
				} while (j < 1 || j > 3);
				switch (j) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				}
				break;
			case 4:
				do {
					System.out.println("o que deseja?\n1-Listagem\n2-Inserção\n3-Alteração");
					j = scan.nextInt();
					if (j < 1 || j > 3) {
						System.out.println("comando invalido, tente novamente");
					}
				} while (j < 1 || j > 3);
				switch (j) {
				case 1:
					if (clientes == 0) {
						System.out.println("lista vazia");
					} else {
						for (k = 0; k < clientes; k++) {
							System.out.println("Nome:" + item.m.fis[k].getNome());
							System.out.println("Id:" + item.m.fis[k].getId());
							System.out.println("email:" + item.m.fis[k].getEmail());
							System.out.println("telefone:" + item.m.fis[k].getTelefone());
							System.out.println("celular:" + item.m.fis[k].getCelular());
							System.out.println("cpf:" + item.m.fis[k].getCpf()+"\n");
						}
					}
					break;
				case 2:
					item.m.fis[clientes]=new PessoaFísica();
					System.out.println("informe o id:");
					item.m.fis[clientes].setId(scan.next());
					System.out.println("informe o nome:");
					item.m.fis[clientes].setNome(scan.next());
					System.out.println("informe o email:");
					item.m.fis[clientes].setEmail(scan.next());
					System.out.println("informe o telefone:");
					item.m.fis[clientes].setTelefone(scan.next());
					System.out.println("informe o celular:");
					item.m.fis[clientes].setCelular(scan.next());
					System.out.println("informe o cpf:");
					item.m.fis[clientes].setCpf(scan.next());
					clientes++;
					break;
				case 3:
					System.out.println("qual cliente deseja alterar?(informe o id)");
					c = scan.next();
					achou = false;
					for (k = 0; k < clientes; k++) {
						if (item.m.fis[k].getId().equals(c) == true) {
							achou=true;
							do {
								System.out.println(
										"o que deseja alterar?\n1-Id\n2-Nome\n3-Email\n4-telefone\n5-celular\n6-cpf");
								l = scan.nextInt();
								if (l < 1 || l > 6) {
									System.out.println("comando invalido, tente novamente");
								}
							} while (l < 1 || l > 6);

							System.out.println("qual devera ser o novo valor para aquele dado?");
							c = scan.next();
							switch (l) {
							case (1):
								item.m.fis[k].setId(c);
								break;
							case (2):
								item.m.fis[k].setNome(c);
								break;
							case (3):
								item.m.fis[k].setEmail(c);
								break;
							case (4):
								item.m.fis[k].setTelefone(c);
								break;
							case (5):
								item.m.fis[k].setCelular(c);
								break;
							case (6):
								item.m.fis[k].setCpf(c);
								break;
							}
						}
					}
					if (achou == false) {
						System.out.println("cliente nao encontrado.");
					}
					break;
				}
				break;
			case 5:
				do {
					System.out.println("o que deseja?\n1-Listagem\n2-Inserção\n3-Alteração");
					j = scan.nextInt();
					if (j < 1 || j > 3) {
						System.out.println("comando invalido, tente novamente");
					}
				} while (j < 1 || j > 3);
				switch (j) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				}
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				System.out.println("comando inválido, tente novamente");
				break;
			}
		}
		System.out.println("obrigado por usar nosso programa");
		scan.close();
	}
}
