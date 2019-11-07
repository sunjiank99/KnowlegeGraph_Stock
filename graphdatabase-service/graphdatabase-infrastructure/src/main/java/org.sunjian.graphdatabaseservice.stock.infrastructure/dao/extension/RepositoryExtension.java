package org.sunjian.graphdatabaseservice.stock.infrastructure.dao.extension;

import java.util.List;

public interface RepositoryExtension<T> {
    /**
     * 泛型方式实现pojo类的自定义查询
     * @param query
     * @return List<T>
     */
    List<T>  customQuery(String query);
}
