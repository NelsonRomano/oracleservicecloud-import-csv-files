package com.rn.supera.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SuperaLogger {
    private static SuperaLogger superaLogger = null;
    private static SimpleDateFormat sdfLog = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String nomeArquivo;    
    private File arquivoLog;
    private BufferedWriter logWriter;

    public SuperaLogger(String nomeDiretorio, String nomeCsv) throws IOException {
        nomeArquivo = nomeCsv + ".log";
        arquivoLog = new File(nomeDiretorio + "\\log\\" + nomeArquivo);
        this.arquivoLog.getParentFile().mkdirs();
        this.logWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.arquivoLog, true), "UTF-8"));
    }

    public static SuperaLogger getSuperaLogger(String nomeDiretorio, String nomeArquivo) throws IOException {
        
        if (superaLogger == null) {
            superaLogger = new SuperaLogger(nomeDiretorio, nomeArquivo);
        }
        
        return superaLogger;
    }

    public String info(String mensagem) {
        Date agora = new Date();
        String infoString = infoConsole(agora, mensagem);
        infoArquivo(agora, mensagem);
        return infoString;
    }

    public void infoArquivo(Date data, String mensagem) {
        
        try {
            this.logWriter.write(sdfLog.format(data) + " INFO: " + mensagem);
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public String infoConsole(String mensagem) {
        Date agora = new Date();
        return infoConsole(agora, mensagem);
    }

    public String infoConsole(Date data, String mensagem) {
        String infoString = sdfLog.format(data) + " INFO: " + mensagem;
        System.out.println(infoString);
        return infoString;
    }

    public String erro(String mensagem) {
        Date agora = new Date();
        String erroString = erroConsole(agora, mensagem);
        erroArquivo(agora, mensagem);
        return erroString;
    }

    public void erroArquivo(Date data, String mensagem) {
        
        try {
            this.logWriter.write(sdfLog.format(data) + " ERRO: " + mensagem);
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e2) {
            e2.printStackTrace();
        }
        
    }

    public void erroArquivo(Date data, String mensagem, Exception e) {
        try {
            this.logWriter.write(sdfLog.format(data) + " ERRO: " + mensagem + "\n" + stack2String(e));
            this.logWriter.flush();
        }
        
        catch (IOException e3) {
            e3.printStackTrace();
        }

        this.erroArquivo(data, mensagem + "\n" + stack2String(e));
    }

    public String erroConsole(Date data, String mensagem) {
        String erroString = sdfLog.format(data) + " ERRO: " + mensagem;
        System.out.println(erroString);
        return erroString;
    }

    public void erroConsole(Date data, String mensagem, Exception e) {
        System.out.println(sdfLog.format(data) + " ERRO: " + mensagem + "\n" + stack2String(e));
    }

    public void linha() {
        
        try {
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static String stack2String(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
    
}