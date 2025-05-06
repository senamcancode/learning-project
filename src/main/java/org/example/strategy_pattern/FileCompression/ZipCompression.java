package org.example.strategy_pattern.FileCompression;

public class ZipCompression implements CompressionStrategy{
    public String compress(String filePath){
        System.out.println("ZIP Compression");
        return filePath;
    };
}
