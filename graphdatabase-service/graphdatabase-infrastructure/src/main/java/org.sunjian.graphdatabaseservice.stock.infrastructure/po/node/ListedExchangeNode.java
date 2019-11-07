package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;

@NodeEntity(label = "上市交易所")
public class ListedExchangeNode extends BaseNode {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name="Listxg")
    private String listedExgId;

    @Property(name="上市交易所名称")
    private String listedExgName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListedExgId() {
        return listedExgId;
    }

    public void setListedExgId(String listedExgId) {
        this.listedExgId = listedExgId;
    }

    public String getListedExgName() {
        return listedExgName;
    }

    public void setListedExgName(String listedExgName) {
        this.listedExgName = listedExgName;
    }

    @Override
    public String toString() {
        return "ListedExchangeNode{" +
                "id=" + id +
                ", listedExgId='" + listedExgId + '\'' +
                ", listedExgName='" + listedExgName + '\'' +
                '}';
    }
}
