package com.rn.supera.client;

import java.util.HashMap;
import java.util.Map;

public class StateOrProvinceMap {
    private static Map<String, String> stateOrProvinceMap; 
    
    public static Map<String, String> getMap(){
        if(stateOrProvinceMap == null){
            stateOrProvinceMap  = new HashMap<String, String>();
            String[] siglaEstadosEDF = { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS",
                    "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" };
            
            String[] idEstadosEDF = { "60", "61", "63", "62", "64", "65", "66", "67", "68", "69", "72", "71", "70",
                    "73", "74", "76", "77", "75", "78", "79", "81", "82", "80", "83", "85", "84", "86" };
            
            for (int i = 0; i < siglaEstadosEDF.length; i++) {
                stateOrProvinceMap.put(siglaEstadosEDF[i], idEstadosEDF[i]);
            }
            
        }
        
        return stateOrProvinceMap;
    }
    
}