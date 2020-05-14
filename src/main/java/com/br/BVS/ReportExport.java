package com.br.BVS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.br.BVS.*;
//import java.util.Scanner;

public class ReportExport {
	
	public static void Report() throws IOException {
	
		
		FileReader file = new FileReader("C:/Users/guilherme.janczak/Desktop/Arquivos/Processado/11-05-2020/PRI_CNPJPROT_236969_20200507_processed.txt");
		BufferedReader linhas = new BufferedReader(file);
		FileWriter arq = new FileWriter("C:/Users/guilherme.janczak/Desktop/Arquivos/Relatorio/teste.txt");
		ArrayList<String> lista = new ArrayList<String>();
		
		String linha = null;
		while((linha = linhas.readLine()) != null) {  
			   lista.add(linha);
			   System.out.println(lista.remove(0));
			} 
		
		
		/*
		while(file.readLine()) {
			lista.add(file.lerLinha());
			System.out.println();*/
			
			
			//if(file.lerLinha() == null) {
			//	stop = false;
			//}
		
		

		//System.out.println(lista.get(0));
		

	
	}

}
