package org.sunjian.graphdatabaseservice.stock.infrastructure.po.common;

import org.neo4j.driver.internal.InternalPath;

public class CustomInternalPath extends InternalPath {

    @Override
    public String toString() {
        return super.nodes().toString()+super.relationships().toString()+super.iterator().toString();
    }
}
