package kopo.poly.user.enumx;

public enum SessionEnum {
    USER_ID("SS_USER_ID"),
    USER_NAME("SS_USER_NAME"),
    USER_TYPE("SS_USER_TYPE");

    public final String STRING;

    SessionEnum(String string) {
        this.STRING = string;
    }
}
