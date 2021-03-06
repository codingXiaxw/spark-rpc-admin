package com.asa.spark.rpc.internalimp.netty.msg.in;

import com.asa.spark.rpc.internalimp.addr.RpcAddress;
import com.asa.spark.rpc.internalimp.netty.msg.InboxMessage;

/**
 * @author andrew_asa
 * @date 2018/8/5.
 */
public class RemoteProcessDisconnected implements InboxMessage {

    private RpcAddress remoteAddress;

    public RpcAddress getRemoteAddress() {

        return remoteAddress;
    }

    public void setRemoteAddress(RpcAddress remoteAddress) {

        this.remoteAddress = remoteAddress;
    }

    @Override
    public InboxMessageType getType() {

        return InboxMessageType.RemoteProcessDisconnected;
    }
}
