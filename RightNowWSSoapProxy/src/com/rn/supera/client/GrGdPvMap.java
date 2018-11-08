package com.rn.supera.client;

import java.util.HashMap;
import java.util.Map;

public class GrGdPvMap {
    private static Map<String, String> grGdPvMap; 
    
    public static Map<String, String> getMap(){
        if(grGdPvMap == null){
            grGdPvMap  = new HashMap<String, String>();
            String[] chave = {"GR", "GD", "PV"};
            String[] valor = {"1", "2", "3"};
            
            for (int i = 0; i < chave.length; i++) {
                grGdPvMap.put(chave[i], valor[i]);
            }
            
        }
        
        return grGdPvMap;
    }
    
}