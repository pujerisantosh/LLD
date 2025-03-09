package com.scaler.buildingbueries;

public class QueryBuilder {

    protected String tables;
    protected String columns = "*";
    protected   String whereClause;
    protected   String orderByClause;
    protected   String groupByClause;
    protected  String joinClause;
    private   String grooupByClause;


    public QueryBuilder table(String table) {
        this.tables = table;
        return this;
    }

    public QueryBuilder columns(String columns) {
        this.columns = columns;
        return this;
    }

    public QueryBuilder where(String condition) {
        this.whereClause = condition;
        return this;
    }

    public QueryBuilder join(String join) {
        this.joinClause = join;
        return this;
    }

    public QueryBuilder orderBy(String orderBy) {
        this.orderByClause = orderBy;
        return this;
    }

    public QueryBuilder groupBy(String groupBy) {
        this.groupByClause = groupBy;
        return this;
    }

    public Query build() {
        return new Query(this);
    }
}

