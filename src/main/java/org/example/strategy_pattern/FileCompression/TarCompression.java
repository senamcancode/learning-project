package org.example.strategy_pattern.FileCompression;

public class TarCompression implements CompressionStrategy{
    public String compress(String filePath){
        System.out.println("TAR Compression");
        return filePath;
    }
}
