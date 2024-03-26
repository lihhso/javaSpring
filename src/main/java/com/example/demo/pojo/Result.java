package com.example.demo.pojo;

public class Result {
    private Integer code;
    private String msg;
    private Object data;
    //声明无参构造函数和有参构造函数
    public Result() {}

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    //声明静态方法成功和失败
    public static Result success(Object data) {
        return new Result(400, "操作成功", data);
    }
    public static Result success() {
        return new Result(400, "操作成功",null);
    }

    public static Result error(String msg) {
        return new Result(500, msg, null);
    }
    //重写toString
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
