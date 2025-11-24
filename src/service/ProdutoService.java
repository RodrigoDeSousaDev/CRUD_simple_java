package service;

import model.Produto;
import repository.ProdutoRepository;

import java.util.Random;


public class ProdutoService {
    private ProdutoRepository repository = new ProdutoRepository();

    public void cadastrar(String nome, double preco){
        Random random = new Random();
        int id = random.nextInt(9000)+ 1000;

        Produto p = new Produto(id, nome, preco);
        repository.salvar(p);

        System.out.println("Produto cadastrado com sucesso");
    }

    public void listar(){
        System.out.println("-PRODUTOS-");
        if(repository.Listar().isEmpty()){
            System.out.println("Nenhum item cadastrado");
        }
        repository.Listar().forEach(System.out::println);
    }

    public void atualizar(int id, String novoNome, double novoPreco){
        Produto p = repository.buscarPorId(id);
        if(p == null){
            System.out.println("Produto não encontrado!");
            return;
        }
        p.setNome(novoNome);
        p.setPreco(novoPreco);
        System.out.println("Produto atualizado");
    }

    public void remover(int id){
        if(repository.remover(id)){
            System.out.println("produto removido");
        }else{
            System.out.println("Produto nao encontrado");
        }
    }
}
