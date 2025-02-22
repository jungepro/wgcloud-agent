package com.wgcloud.entity;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class DbTableCount extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = 879979812204191283L;

    /**
     * 表id
     */
    private String dbTableId;

    /**
     * w数据量
     */
    private Long tableCount;

    /**
     * 添加时间
     * MM-dd hh:mm:ss
     */
    private String dateStr;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getDbTableId() {
        return dbTableId;
    }

    public void setDbTableId(String dbTableId) {
        this.dbTableId = dbTableId;
    }

    public Long getTableCount() {
        return tableCount;
    }

    public void setTableCount(Long tableCount) {
        this.tableCount = tableCount;
    }

    public String getDateStr() {
        if (!StringUtils.isEmpty(dateStr) && dateStr.length() > 16) {
            return dateStr.substring(5);
        }
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
