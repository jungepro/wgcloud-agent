package com.wgcloud.entity;

public class DashboardView extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = -1262528746414406709L;


    /**
     * host名称
     */
    private String hostname;

    /**
     * 系统版本信息
     */
    private String version;

    /**
     * 系统已经运行了多少天
     */
    private String yxDays;

    /**
     * 内存已使用百分比
     */
    private double memPer;

    /**
     * 更新时间
     */
    private String dateStr;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getYxDays() {
        return yxDays;
    }

    public void setYxDays(String yxDays) {
        this.yxDays = yxDays;
    }

    public double getMemPer() {
        return memPer;
    }

    public void setMemPer(double memPer) {
        this.memPer = memPer;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }
}
