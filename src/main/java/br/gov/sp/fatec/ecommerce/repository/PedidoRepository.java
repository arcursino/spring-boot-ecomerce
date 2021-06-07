package br.gov.sp.fatec.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

import br.gov.sp.fatec.ecommerce.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

    @Query("select p from Pedido p where p.id = ?1")
    public Pedido buscarPedidoPorId(Long id);

    @Query("select p from Pedido p where p.nome = ?2")
    public Pedido buscaPedidoPorNome(String nome);

    public Pedido findByNome(String nome);
    
    public Optional<Pedido> findById(Long id);

    
}