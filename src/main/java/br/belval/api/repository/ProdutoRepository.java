package br.belval.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.belval.api.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	//Importar no STS = Ctrl + Shift + O
	
	//Procurar o produto por nome ou decrição buscando por texto, "encontrar em qualquer lugar"
	 List<Produto> findByNomeContainingOrDescricaoContaining(String texto1, String texto2);

}
