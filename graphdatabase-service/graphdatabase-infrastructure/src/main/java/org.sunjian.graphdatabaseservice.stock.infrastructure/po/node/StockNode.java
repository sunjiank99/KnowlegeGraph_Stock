package org.sunjian.graphdatabaseservice.stock.infrastructure.po.node;
import org.neo4j.ogm.annotation.*;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;


@NodeEntity(label = "股票")
public class StockNode extends BaseNode{
    @GeneratedValue
    @Id
    private Long nodeId;

    @Property(name = "法人代表")
    private String legalRepresent;

    @Property(name = "证券事务代表")
    private String securityThingsRepresent;

    @Property(name = "董秘")
    private String secretary;

    @Property(name = "公司名称")
    private String companyName;

    @Property(name="A股名称")
    private String AShareName;

    @Property(name="总经理")
    private String manager;

    @Property(name="董事长")
    private String chairman;

    @Property(name="独立董事")
    private String independentDirector;

    @Property(name="A股简称")
    private String AShareShortName;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getLegalRepresent() {
        return legalRepresent;
    }

    public void setLegalRepresent(String legalRepresent) {
        this.legalRepresent = legalRepresent;
    }

    public String getSecurityThingsRepresent() {
        return securityThingsRepresent;
    }

    public void setSecurityThingsRepresent(String securityThingsRepresent) {
        this.securityThingsRepresent = securityThingsRepresent;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAShareName() {
        return AShareName;
    }

    public void setAShareName(String AShareName) {
        this.AShareName = AShareName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getIndependentDirector() {
        return independentDirector;
    }

    public void setIndependentDirector(String independentDirector) {
        this.independentDirector = independentDirector;
    }

    public String getAShareShortName() {
        return AShareShortName;
    }

    public void setAShareShortName(String AShareShortName) {
        this.AShareShortName = AShareShortName;
    }

    @Override
    public String toString() {
        return "StockNode{" +
                "nodeId=" + nodeId +
                ", legalRepresent='" + legalRepresent + '\'' +
                ", securityThingsRepresent='" + securityThingsRepresent + '\'' +
                ", secretary='" + secretary + '\'' +
                ", companyName='" + companyName + '\'' +
                ", AShareName='" + AShareName + '\'' +
                ", manager='" + manager + '\'' +
                ", chairman='" + chairman + '\'' +
                ", independentDirector='" + independentDirector + '\'' +
                ", AShareShortName='" + AShareShortName + '\'' +
                '}';
    }
}

