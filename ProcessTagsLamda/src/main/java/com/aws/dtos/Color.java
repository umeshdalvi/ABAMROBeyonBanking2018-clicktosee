
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Color implements Serializable
{

    private Color_ color;
    private Double score;
    private Double pixelFraction;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3755005217523937640L;

    public Color_ getColor() {
        return color;
    }

    public void setColor(Color_ color) {
        this.color = color;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPixelFraction() {
        return pixelFraction;
    }

    public void setPixelFraction(Double pixelFraction) {
        this.pixelFraction = pixelFraction;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
