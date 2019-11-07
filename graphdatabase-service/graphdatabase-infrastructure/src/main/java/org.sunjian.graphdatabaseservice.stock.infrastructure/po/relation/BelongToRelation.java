package org.sunjian.graphdatabaseservice.stock.infrastructure.po.relation;


import org.neo4j.ogm.annotation.*;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseNode;
import org.sunjian.graphdatabaseservice.stock.infrastructure.po.BaseRelation;

@RelationshipEntity(type="belong_to")
public class BelongToRelation <S extends BaseNode, E extends BaseNode> extends BaseRelation {

   @Id
   @GeneratedValue
   private Long id;

   @StartNode
   private S startNode;

   @EndNode
   private E endNode;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public S getStartNode() {
      return startNode;
   }

   public void setStartNode(S startNode) {
      this.startNode = startNode;
   }

   public E getEndNode() {
      return endNode;
   }

   public void setEndNode(E endNode) {
      this.endNode = endNode;
   }

   @Override
   public String toString() {
      return "BelongToRelation{" +
              "id=" + id +
              ", startNode=" + startNode +
              ", endNode=" + endNode +
              '}';
   }
}
