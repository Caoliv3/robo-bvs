package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.io.File;

import org.json.simple.parser.ParseException;

import com.br.BVS.ExtractFile;
import com.br.BVS.FolderMovement;
import com.br.BVS.ModelCatorioBvs;
import com.br.BVS.ModelProtestoAS400;
import com.br.BVS.ReadFile;
import com.br.BVS.ReportExport;
import com.br.BVS.ValidateFile;
import com.br.BVS.WriteFile;
import com.br.BVS.ReportExport;

public class BoaVistaRPA {

	public static void main(String[] args)	throws Exception {
		//Método ChooseFolder
		//Parametros: 1 = Entrada, 2 = Processando, 3 = Processado, 4 = Excessão, 5 = Lote, 6 = Fontes
		/*
		String fileName = "";
		String fileNameTxt = "";
		String linha = "";
		
		Date date = new Date();
		
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		String dateFormated = formater.format(date);
			
		if (ValidateFile.CheckArchive()) {
		
		File file = new File(ValidateFile.ChooseFolder(1));
		File[] archives = file.listFiles();
		 for (File fileTmp : archives) {
			 fileName = fileTmp.getName();
		   }	
		 
		File inputFile = new File(ValidateFile.ChooseFolder(1) + fileName);
		File destinationFile = new File(ValidateFile.ChooseFolder(2) + fileName);
		
		File outputProcessing = new File(ValidateFile.ChooseFolder(2));
							
		ExtractFile.decompressGzip(inputFile, destinationFile);						
		ExtractFile.decompressTar(destinationFile, outputProcessing);
		
		HashMap<String, ModelCatorioBvs> cartoriosBvs = new HashMap<String, ModelCatorioBvs>();
		ReadFile leitorArqCartorios = new ReadFile(ValidateFile.ChooseFolder(6) + "CartorioBvs.csv");

		linha = leitorArqCartorios.lerLinha();
		ModelCatorioBvs model = new ModelCatorioBvs(linha);
		do {

			cartoriosBvs.put(model.getCodigoBusca, model);
			linha = leitorArqCartorios.lerLinha();
			if (linha != null) {
				model = new ModelCatorioBvs(linha);
			}
		} while (linha != null);
		
		File archive = new File(ValidateFile.ChooseFolder(2));
		File[] archivesTxt = archive.listFiles();
		 for (File fileTmp : archivesTxt) {
			 fileNameTxt = fileTmp.getName();
		   }
		 
		ReadFile leitorArqRobo = new ReadFile(ValidateFile.ChooseFolder(2) + fileNameTxt);
		
		File dateFolderProcessed = new File(ValidateFile.ChooseFolder(3) + dateFormated); 
		dateFolderProcessed.mkdir();
		
		WriteFile grava = new WriteFile(dateFolderProcessed + "/" + fileNameTxt);
		
		File dateFolderException = new File(ValidateFile.ChooseFolder(4) + dateFormated); 
		dateFolderException.mkdir();

		WriteFile gravaErro = new WriteFile(dateFolderException + "/" + fileNameTxt); 
		
		linha = leitorArqRobo.lerLinha();
		do {

			ModelProtestoAS400 protesto = new ModelProtestoAS400(linha);
			if (cartoriosBvs.containsKey(protesto.getCodigoBusca)) {
				model = cartoriosBvs.get(protesto.getCodigoBusca);
				protesto.setCodigoCartorio(model.codCartoiroBvs);
			} else {
				if (!protesto.getTelefone.equals("")) {
					gravaErro.registro(linha + "\n");
				}
			}
			grava.registro(protesto + "\n");
			linha = leitorArqRobo.lerLinha();

		} while (linha != null);

		grava.close();
		leitorArqRobo.close();
		
		File dateFolderBatch = new File(ValidateFile.ChooseFolder(5) + dateFormated); 
		dateFolderBatch.mkdir();
		
		File batchFile = new File(ValidateFile.ChooseFolder(5) + dateFormated + "/" + fileName);
		
		FolderMovement.moveFiles(inputFile, batchFile);
		
		File processingFile = new File(ValidateFile.ChooseFolder(2) + fileNameTxt);
		
		processingFile.delete();
		
		System.out.println("Termino de processamento");  
		
		} */
		
		ReportExport.Report();
	}
}
