package org.testcontainers.containers;

import org.testcontainers.containers.jdbc.JdbcDatabaseContainer;
import org.testcontainers.containers.jdbc.JdbcDatabaseContainerProvider;

public class ClickHouseProvider extends JdbcDatabaseContainerProvider {
    @Override
    public boolean supports(String databaseType) {
        return databaseType.equals(ClickHouseContainer.NAME);
    }

    @Override
    public JdbcDatabaseContainer newInstance(String tag) {
        return new ClickHouseContainer(ClickHouseContainer.IMAGE + ":" + tag);
    }
}
