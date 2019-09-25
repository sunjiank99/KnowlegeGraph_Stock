package org.sunjian.graphdatabaseservice.dao.extension;

import org.springframework.stereotype.Repository;
import org.sunjian.graphdatabaseservice.po.node.StockNode;

import java.util.List;

public interface StockRepositoryExtension {
    /**
     * 自定义query语句查询
     * @param query 查询语句
     * @return List<StockNode>
     */
    List<StockNode> getStockNodeByCustomQuery(String query);
}
