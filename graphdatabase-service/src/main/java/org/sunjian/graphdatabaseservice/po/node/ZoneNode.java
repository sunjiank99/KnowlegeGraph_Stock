package org.sunjian.graphdatabaseservice.po.node;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.sunjian.graphdatabaseservice.po.BaseNode;


@NodeEntity(label = "所属证监会行业")
public class ZoneNode  extends BaseNode {

    @GeneratedValue
    @Id
    private Long id;

    @Property(name="zoneId")
    private String zoneId;

    @Property(name="区域名称")
    private String zoneName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public String toString() {
        return "ZoneNode{" +
                "id=" + id +
                ", zoneId='" + zoneId + '\'' +
                ", zoneName='" + zoneName + '\'' +
                '}';
    }
}
