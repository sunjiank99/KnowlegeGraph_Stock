package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;

@NodeEntity(label = "所属证监会行业")
public class SrcIndustryNode extends BaseNode {
    @GeneratedValue
    @Id
    private Long id;

    @Property(name = "CSRC")
    private String srcId;

    @Property(name ="所属证监会行业")
    private String srcName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    @Override
    public String toString() {
        return "SrcIndustryNode{" +
                "id=" + id +
                ", srcId='" + srcId + '\'' +
                ", srcName='" + srcName + '\'' +
                '}';
    }
}
