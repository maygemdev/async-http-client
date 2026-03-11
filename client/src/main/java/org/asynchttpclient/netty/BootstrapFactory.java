package org.asynchttpclient.netty;

import io.netty.bootstrap.Bootstrap;

public interface BootstrapFactory {

    Bootstrap create();
}
