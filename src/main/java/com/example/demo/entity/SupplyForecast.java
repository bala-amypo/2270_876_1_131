package com.example.demo.entity;

public class SupplyForecast {
    private Long id;
    private String zoneName;
    private Double forecastValue;

    public SupplyForecast() {}

    public SupplyForecast(Long id, String zoneName, Double forecastValue) {
        this.id = id;
        this.zoneName = zoneName;
        this.forecastValue = forecastValue;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }

    public Double getForecastValue() { return forecastValue; }
    public void setForecastValue(Double forecastValue) { this.forecastValue = forecastValue; }
}
