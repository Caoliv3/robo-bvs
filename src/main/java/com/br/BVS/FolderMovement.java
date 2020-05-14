package com.br.BVS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FolderMovement {
	
	public static boolean copysuccess;

	public static void moveFiles(File source, File destination) throws IOException, FileNotFoundException {

		if (destination.exists())
			destination.delete();

		FileChannel sourceChannel = null;
		FileChannel destinationChannel = null;

		try {
			sourceChannel = new FileInputStream(source).getChannel();
			destinationChannel = new FileOutputStream(destination).getChannel();
			sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
			copysuccess = true;
		} catch(IOException e) {
			System.out.println("Ocorreu um erro para realizar a copia do arquivo + " + e);
			copysuccess = false;
		} finally {
			if (sourceChannel != null && sourceChannel.isOpen())
				sourceChannel.close();
			if (destinationChannel != null && destinationChannel.isOpen())
				destinationChannel.close();
		}
		
		if(copysuccess) {
			source.delete();
		}
		
		sourceChannel.close();
		destinationChannel.close();
	}

}
