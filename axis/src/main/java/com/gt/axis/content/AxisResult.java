package com.gt.axis.content;

/**
 * axis统一返回类
 * Created by psr on 2017/9/8 0008.
 */
public class AxisResult<T> {

    private int code;

    private String msg;

    private T data;

    /* 构造器 */
    protected AxisResult(int code){
        this.code = code;
    }

    protected AxisResult(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    protected AxisResult(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 生成AxisResult对象
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxisResult<T> create(int code, String msg, T data){
        return new AxisResult<T>(code, msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
