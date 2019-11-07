package org.sunjian.graphdatabaseservice.stock.infrastructure.po.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Node implements Serializable {

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    private Long id;
    private List<String> labels;
    private Map<String,Object> properties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<String> getLabels() {
        return labels;
    }
}
