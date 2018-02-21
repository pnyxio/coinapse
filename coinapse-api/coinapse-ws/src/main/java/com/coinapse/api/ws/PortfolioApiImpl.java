package com.coinapse.api.ws;

import com.coinapse.api.protocol.PortfolioApi;
import com.nominanuda.zen.obj.Obj;

public class PortfolioApiImpl implements PortfolioApi {

    @Override
    public Obj load() {
        return Obj.make("hello", "world");
    }
}
