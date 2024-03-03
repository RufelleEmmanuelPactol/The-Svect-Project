package com.svect.daemons;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

import java.net.InetSocketAddress;
import java.util.logging.SocketHandler;

/**
 * Spawns / accepts rooms (a.k.a., clients or connections)
 * This is where a client is spawned, handled, and cycled.
 */
public class RoomSpawner {
    EventLoopGroup bossGroup;
    EventLoopGroup workerGroup;
    ServerBootstrap serverBootstrap;

    public RoomSpawner(int port) {
        bossGroup = new NioEventLoopGroup();
        workerGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {


                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        // TODO: Implement this method
                    }
                });
    }

}
