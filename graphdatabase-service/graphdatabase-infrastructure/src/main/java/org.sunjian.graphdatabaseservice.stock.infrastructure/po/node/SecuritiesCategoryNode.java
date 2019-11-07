package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;

@NodeEntity(label = "证券类别")
public class SecuritiesCategoryNode extends BaseNode {
    @GeneratedValue
    @Id
    private Long id;

    @Property(name = "Securities")
    private String securitiesId;

    @Property(name="证券类别")
    private String securitiesName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecuritiesId() {
        return securitiesId;
    }

    public void setSecuritiesId(String securitiesId) {
        this.securitiesId = securitiesId;
    }

    public String getSecuritiesName() {
        return securitiesName;
    }

    public void setSecuritiesName(String securitiesName) {
        this.securitiesName = securitiesName;
    }

    @Override
    public String toString() {
        return "SecuritiesCategoryNode{" +
                "id=" + id +
                ", securitiesId='" + securitiesId + '\'' +
                ", securitiesName='" + securitiesName + '\'' +
                '}';
    }
}
