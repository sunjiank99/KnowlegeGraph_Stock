package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;

@NodeEntity(label = "关系人")
public class RelationPersonNode extends BaseNode {

    @GeneratedValue
    @Id
    private Long id;

    @Property(name="股票名称")
    private String stockName;

    @Property(name="关系人名称")
    private String relationPersonName;

    @Property(name="PersonId")
    private String persionId;

    @Property(name="职位")
    private String position;

    @Property(name="股票代码")
    private  String stockId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getRelationPersonName() {
        return relationPersonName;
    }

    public void setRelationPersonName(String relationPersonName) {
        this.relationPersonName = relationPersonName;
    }

    public String getPersionId() {
        return persionId;
    }

    public void setPersionId(String persionId) {
        this.persionId = persionId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    @Override
    public String toString() {
        return "RelationPersonNode{" +
                "id=" + id +
                ", stockName='" + stockName + '\'' +
                ", relationPersonName='" + relationPersonName + '\'' +
                ", persionId='" + persionId + '\'' +
                ", position='" + position + '\'' +
                ", stockId='" + stockId + '\'' +
                '}';
    }
}
