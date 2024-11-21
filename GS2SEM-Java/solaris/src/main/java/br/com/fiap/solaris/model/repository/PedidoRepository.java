/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris.model.repository;

import br.com.fiap.solaris.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidoRepository extends JpaRepository<Item, Long> {
}
