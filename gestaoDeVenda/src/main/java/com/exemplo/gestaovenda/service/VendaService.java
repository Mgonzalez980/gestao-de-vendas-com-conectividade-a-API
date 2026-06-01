package com.exemplo.gestaovenda.service;

import com.exemplo.gestaovenda.model.Funcionario;
import com.exemplo.gestaovenda.model.Venda;
import com.exemplo.gestaovenda.repository.FuncionarioRepository;
import com.exemplo.gestaovenda.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;


    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Venda registrarVenda(Venda venda) {
        // 1. Busca os dados do funcionário que realizou a venda
        if (venda.getFuncionario() != null && venda.getFuncionario().getId() != null) {
            Funcionario funcionarioCompleto = funcionarioRepository.findById(venda.getFuncionario().getId())
                    .orElseThrow(() -> new RuntimeException("Funcionário não encontrado no sistema!"));

            // Atrela os dados completos do funcionário à venda
            venda.setFuncionario(funcionarioCompleto);
        }


        double total = venda.getValorProduto() * venda.getQtd();
        venda.setValorTotalVenda(total);

        // 3. Salva a venda no banco de dados
        return vendaRepository.save(venda);
    }
}