package com.br.BVS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ValidateFile {
	public static String inputfolder;
	public static JSONObject jsonObject;
	public static JSONParser parser = new JSONParser();
	public static String fileConfig;
	public static String fileValidate;
	public static String inputProcessing;
	public static String inputProcessed;
	public static String inputExcpetion;
	public static String inputBatch;
	public static String inputFonts;
	
	public static String ChooseFolder(Integer choiceFolder) throws FileNotFoundException, IOException, ParseException {
		File file = new File("C:/Users/guilherme.janczak/eclipse-workspace/RoboBVS/jsonlib");
		File[] archives = file.listFiles();
		 for (File fileTmp : archives) {
			 fileConfig = fileTmp.getName();
		   }		 
		jsonObject = (JSONObject) parser.parse(new FileReader("jsonlib/" + fileConfig));
	
		inputfolder = (String) jsonObject.get("inputfolder");		
		inputProcessing = (String) jsonObject.get("processingfolder");
		inputProcessed = (String) jsonObject.get("processedfolder");
		inputExcpetion = (String) jsonObject.get("exceptionfolder");
		inputBatch = (String) jsonObject.get("batchfolder");
		inputFonts = (String) jsonObject.get("fontfolder");
		
		if(choiceFolder == 1) {
			return inputfolder;
		}
		else if(choiceFolder == 2) {
			return inputProcessing;
		}
		else if(choiceFolder == 3) {
			return inputProcessed;
		}
		else if(choiceFolder == 4) {
			return inputExcpetion;
		}
		else if(choiceFolder == 5) {
			return inputBatch;
		}
		else if(choiceFolder == 6) {
			return inputFonts;
		}
		
		return fileConfig;
		
	}
	
	public static boolean CheckArchive() throws Exception {
		File file = new File(ChooseFolder(1));
		File[] archives = file.listFiles();
		for(File fileTmp : archives) {
			fileValidate = fileTmp.getName();
		}
		
		if(fileValidate == null || fileValidate == "") {
			throw new Exception("Não existe arquivo para ser processado");
		}	
		
		else return true;
		
	}

}
