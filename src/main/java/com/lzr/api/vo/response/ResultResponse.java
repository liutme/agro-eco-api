package com.lzr.api.vo.response;

public class ResultResponse<T> {

    /**
     * 返回状态码，0失败，1成功
     */
    private int state;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 返回参数
     */
    private T data;

    public ResultResponse(int state, String msg, T data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public ResultResponse(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
