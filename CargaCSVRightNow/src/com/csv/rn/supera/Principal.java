package com.csv.rn.supera;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            JOptionPane.showMessageDialog(new JPanel(), "A aplicação não pôde ser executada porque não foi enviado o"
                    + " parâmetro correto. Verifique-o e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        else {
            
            try {
                Carregador.carregarOrganizacao(args[0]);
                Carregador.carregarContato(args[0]);
                Carregador.carregarLote(args[0]);
                Carregador.carregarProduto(args[0]);
                Carregador.carregarNota(args[0]);
            }

            catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}