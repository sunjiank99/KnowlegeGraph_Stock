package org.sunjian.graphdatabaseservice.stock.infrastructure.dao.extension;

import org.sunjian.graphdatabaseservice.stock.infrastructure.po.node.StockNode;

import java.util.List;

public interface StockRepositoryExtension {
    /**
     * 接口多重集成方式
     * 实现自定义query语句查询
     *
     * @param query 查询语句
     * @return List<StockNode>
     */
    List<StockNode> getStockNodeByCustomQuery(String query);
}
