package org.example.strategy_pattern.FileCompression;

public class RarCompression implements CompressionStrategy{
    public String compress(String filePath){
        System.out.println("RAR Compression");
        return filePath;
    }
}
