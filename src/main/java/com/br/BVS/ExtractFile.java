package com.br.BVS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class ExtractFile {
	
    public static void decompressGzip(File input, File output) throws IOException {
        try (GZIPInputStream in = new GZIPInputStream(new FileInputStream(input))){
            try (FileOutputStream out = new FileOutputStream(output)){
                byte[] buffer = new byte[1024];
                int len;
                while((len = in.read(buffer)) != -1){
                    out.write(buffer, 0, len);
                }
            }
        }
    }
    
    public static void decompressTar(File in, File out) throws IOException, InterruptedException {
        try (TarArchiveInputStream fin = new TarArchiveInputStream(new FileInputStream(in))){
            TarArchiveEntry entry;
            while ((entry = fin.getNextTarEntry()) != null) {
            	File entryFile = new File(out + File.separator + entry.getName());
            	FileOutputStream entryFileStream = new FileOutputStream(entryFile);
                IOUtils.copy(fin, entryFileStream);
                entryFileStream.flush();
                entryFileStream.close();
                
            }
            fin.close();
            in.delete();
        }
       
    }
       
}
