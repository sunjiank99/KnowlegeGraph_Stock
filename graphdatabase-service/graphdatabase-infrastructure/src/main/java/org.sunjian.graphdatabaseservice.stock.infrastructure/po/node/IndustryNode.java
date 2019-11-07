package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;


@NodeEntity(label = "行业")
public class IndustryNode extends BaseNode {
    @GeneratedValue
    @Id
    private Long id;

    @Property(name = "Industry")
    private String industryId;

    @Property(name="行业名称")
    private String industryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    @Override
    public String toString() {
        return "IndustryNode{" +
                "id=" + id +
                ", industryId='" + industryId + '\'' +
                ", industryName='" + industryName + '\'' +
                '}';
    }
}
