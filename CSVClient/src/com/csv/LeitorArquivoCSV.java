package com.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivoCSV {

    public static List<String> lerArquivo(String nomeDiretorio, String nomeArquivo) throws IOException {
        File arquivo = new File(nomeDiretorio + File.separator + nomeArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"));
        List<String> arrayLinhas = new ArrayList<String>();

        for (String linha = br.readLine(); linha != null; linha = br.readLine()) {
            arrayLinhas.add(linha);
        }

        br.close();
        return arrayLinhas;
    }

    public static String[] linhaToArray(String linha) throws IOException {
        String[] splitString = linha.split(";(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        int i = 0;

        for (String elemento : splitString) {
            elemento = elemento.trim();
            splitString[i] = elemento;
            i++;
        }

        return splitString;
    }

    public static void moverArquivoCSV(String nomeDiretorio, String nomeArquivo) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        File arquivoA = new File(nomeDiretorio + File.separator + nomeArquivo);
        File arquivoB = new File(nomeDiretorio + File.separator + "integrado" + File.separator + nomeArquivo);
        inStream = new FileInputStream(arquivoA);
        outStream = new FileOutputStream(arquivoB);
        byte[] buffer = new byte[1024];
        int length;

        while ((length = inStream.read(buffer)) > 0) {
            outStream.write(buffer, 0, length);
        }

        inStream.close();
        outStream.close();
        arquivoA.delete();
    }

    public static File[] filtrarArquivos(String nomeDiretorio, String nomeArquivo) {
        File dir = new File(nomeDiretorio + File.separator );
        File[] files = dir.listFiles(new FilenameFilter() {
          
            @Override
            public boolean accept(File dir, String nome) { 
                return nome.matches(nomeArquivo);
            }
            
        });

        return files;
    }

}