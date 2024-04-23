package models;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    
    @SerializedName("conversion_result")
    private String conversionResult;

    @SerializedName("conversion_rates")
    private Map<String, Double> comparisonResults;

    public String getConversionResult() {
        return conversionResult;
    }

    public Map<String, Double> getComparisonResults() {
        return comparisonResults;
    }

    @Override
    public String toString() {
        return "Moneda [conversionResult=" + conversionResult + ", comparisonResults=" + comparisonResults + "]";
    }

    

    
}