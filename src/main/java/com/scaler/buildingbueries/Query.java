package com.scaler.buildingbueries;
public class Query {
    private final String table;
    private final String columns;
    private final String whereClause;
    private final String joinClause;
    private final String orderByClause;
    private final String groupByClause;

    // Private constructor to enforce the use of Builder
    Query(QueryBuilder builder) {
        this.table = builder.tables;
        this.columns = builder.columns;
        this.whereClause = builder.whereClause;
        this.joinClause = builder.joinClause;
        this.orderByClause = builder.orderByClause;
        this.groupByClause = builder.groupByClause;
    }

    public String getSQL() {
        StringBuilder sql = new StringBuilder("SELECT ").append(columns).append(" FROM ").append(table);

        if (joinClause != null) sql.append(" ").append(joinClause);
        if (whereClause != null) sql.append(" WHERE ").append(whereClause);
        if (groupByClause != null) sql.append(" GROUP BY ").append(groupByClause);
        if (orderByClause != null) sql.append(" ORDER BY ").append(orderByClause);

        return sql.toString();
    }
}