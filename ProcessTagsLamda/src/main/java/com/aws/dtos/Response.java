
package com.aws.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Response implements Serializable
{

    private ImagePropertiesAnnotation imagePropertiesAnnotation;
    private WebDetection webDetection;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5473098018166378690L;

    public ImagePropertiesAnnotation getImagePropertiesAnnotation() {
        return imagePropertiesAnnotation;
    }

    public void setImagePropertiesAnnotation(ImagePropertiesAnnotation imagePropertiesAnnotation) {
        this.imagePropertiesAnnotation = imagePropertiesAnnotation;
    }

    public WebDetection getWebDetection() {
        return webDetection;
    }

    public void setWebDetection(WebDetection webDetection) {
        this.webDetection = webDetection;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
