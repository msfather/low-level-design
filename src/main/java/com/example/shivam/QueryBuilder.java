package com.example.shivam;
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;
    private QueryBuilder(Builder builder){
        this.select=builder.getSelect();
        this.from=builder.getFrom();
        this.where=builder.getWhere();
        this.join=builder.getJoin();
        this.orderBy=builder.getOrderBy();
        this.groupBy=builder.getGroupBy();
    }
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }
    public static Builder build(){
        return new Builder();
    }
    static class Builder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public String getFrom() {
            return from;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public String getWhere() {
            return where;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public String getJoin() {
            return join;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public QueryBuilder queryBuilder(){
            return new QueryBuilder(this);
        }
    }
}
