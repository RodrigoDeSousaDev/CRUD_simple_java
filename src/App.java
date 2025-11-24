import service.ProdutoService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        while(true){
            System.out.println("--------CRUD--------");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.println("--------------------");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1){
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("Preço: ");
                double preco = scanner.nextDouble();

                service.cadastrar(nome, preco);

            }else if(opcao == 2){
                service.listar();

            }else if (opcao == 3){
                System.out.println("ID do produto: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Novo nome: ");
                String novoNome = scanner.nextLine();

                System.out.println("Novo preco: ");
                double novoPreco = scanner.nextDouble();

                service.atualizar(id, novoNome, novoPreco);
            }else if(opcao == 4){
                System.out.println("Id do produto: ");
                int id = scanner.nextInt();

                service.remover(id);
            }else if(opcao == 5){
                System.out.println("FIM DO MEU CRUD");
                break;
            }else{
                System.out.println("Opção invalida");
            }
        }
        scanner.close();
    }
}
