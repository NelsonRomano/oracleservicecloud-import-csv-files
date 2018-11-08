package com.rn.supera.client;

import java.util.HashMap;
import java.util.Map;

public class TipoContatoMap {
    private static Map<String, String> tipoContatoMap;

    public static Map<String, String> getMap() {
        if (tipoContatoMap == null) {
            tipoContatoMap = new HashMap<String, String>();
            String[] chave = { "Consumidor", "Profissional de Saúde", "Comprador", "Vendedor", "Secretária",
                    "Balconista", "Estoquista", "Assistente", "Analista", "Funcionario", "Outro", "Ex-Funcionario" };
            String[] valor = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

            for (int i = 0; i < chave.length; i++) {
                tipoContatoMap.put(chave[i], valor[i]);
            }

        }

        return tipoContatoMap;
    }

}