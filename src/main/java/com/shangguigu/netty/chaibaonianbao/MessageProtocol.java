package com.shangguigu.netty.chaibaonianbao;

/**
 * 协议包：解决TCP粘包和拆包解决方案
 */
public class MessageProtocol {
    /**
     * 关键，定长
     */
    private int len;
    /**
     * 内容
     */
    private byte[] content;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
