/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequisicaoNovoPedido(
        @NotBlank @Size(min = 5, max=250, message = "quantidade minima de 5 caracteres e máxima de 250 caracteres")
        String nomeProduto,
        @NotBlank
        String urlProduto,
        @NotBlank
        String urlImagem,
        String descricao) {

}
