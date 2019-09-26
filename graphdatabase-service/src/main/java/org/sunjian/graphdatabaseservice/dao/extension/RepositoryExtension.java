package org.sunjian.graphdatabaseservice.dao.extension;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface RepositoryExtension<T> {
    /**
     * 泛型方式实现pojo类的自定义查询
     * @param query
     * @return List<T>
     */
    List<T>  customQuery(String query);
}
