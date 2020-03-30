package com.guhao.test;

/**
 * @Author guhao
 * @DateTime 2019-12-09 8:51
 * @Description
 **/
public class History {
    private String fromName;
    private String fromLev;
    private String toName;
    private String toLev;

    public History() {
    }

    public History(String fromName, String fromLev, String toName, String toLev) {
        this.fromName = fromName;
        this.fromLev = fromLev;
        this.toName = toName;
        this.toLev = toLev;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromLev() {
        return fromLev;
    }

    public void setFromLev(String fromLev) {
        this.fromLev = fromLev;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToLev() {
        return toLev;
    }

    public void setToLev(String toLev) {
        this.toLev = toLev;
    }

    @Override
    public String toString() {
        return "History{" +
                "fromName='" + fromName + '\'' +
                ", fromLev='" + fromLev + '\'' +
                ", toName='" + toName + '\'' +
                ", toLev='" + toLev + '\'' +
                '}';
    }
}
