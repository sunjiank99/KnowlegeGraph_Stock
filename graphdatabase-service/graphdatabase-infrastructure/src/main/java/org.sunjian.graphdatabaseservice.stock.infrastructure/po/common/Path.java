package org.sunjian.graphdatabaseservice.stock.infrastructure.po.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Path implements Serializable {
    List<Node> nodes;
    List<Relationship> relationships;
    List<Segment> segments;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public void buildSegments()
    {
        this.segments=new ArrayList<>();
        for ( int i = 0; i < relationships.size(); i++ )
        {

            Segment segment=new Segment();
            segment.setStart(nodes.get(i));
            segment.setRelationship(relationships.get(i));
            segment.setEnd(nodes.get(i+1));
            segments.add(segment);
        }
    }
}
