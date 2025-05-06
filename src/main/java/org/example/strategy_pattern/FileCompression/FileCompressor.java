package org.example.strategy_pattern.FileCompression;

public class FileCompressor {
    private CompressionStrategy strategy;

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeCompression(String filePath){
        strategy.compress(filePath);
        return filePath;
    }
}
