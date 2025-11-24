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

}
