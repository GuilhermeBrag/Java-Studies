import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                if (!clientes.contains(venda.getCliente().nome())) {
//                    clientes.add(venda.getCliente().nome());
//                }
//            }
//        }
//
//        Collections.sort(clientes);
//        System.out.println(clientes);



        List <String> clientes = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(clientes);



    }

}
