package org.aksw.kbox.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;

public class GzipUtils {

    public static void pack(File input, File output) throws IOException {
        try (GzipCompressorOutputStream out = new GzipCompressorOutputStream(new FileOutputStream(output))){
            IOUtils.copy(new FileInputStream(input), out);
        }
    }
    
    public static void pack(InputStream inputStream, File destPath) throws IOException {
        try (GzipCompressorOutputStream out = new GzipCompressorOutputStream(new FileOutputStream(destPath))){
            IOUtils.copy(inputStream, out);
        }
    }

    public static void unpack(InputStream inputStream, File output) throws IOException {
        try (GzipCompressorInputStream in = new GzipCompressorInputStream(inputStream)){
            IOUtils.copy(in, new FileOutputStream(output));
        }
    }
}

