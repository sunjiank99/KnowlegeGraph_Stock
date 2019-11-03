package org.sunjian.graphdatabaseservice.po.common;

import java.io.Serializable;

public class Segment implements Serializable {
   private Node start;
   private Relationship relationship;
   private Node end;

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
}
