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

            int opcoes = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
