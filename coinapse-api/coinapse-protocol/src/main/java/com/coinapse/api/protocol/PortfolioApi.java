package com.coinapse.api.protocol;

import com.nominanuda.hyperapi.HyperApi;
import com.nominanuda.zen.obj.Obj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@HyperApi
public interface PortfolioApi {

    @GET @Path("/portfolio.load")
    Obj load();

}
