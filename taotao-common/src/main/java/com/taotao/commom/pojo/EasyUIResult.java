package com.taotao.commom.pojo;

import java.util.List;

public class EasyUIResult {

    private Integer total;
    private List<?> rows;

    public EasyUIResult() {
    }

    public EasyUIResult(Integer total, List<?> rows) {
        this.rows=rows;
        this.total=total;
    }

    public int getTatol() {
        return total;
    }

    public void setTatol(int tatol) {
        this.total = tatol;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
