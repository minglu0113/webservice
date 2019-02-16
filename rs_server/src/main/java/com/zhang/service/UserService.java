package com.zhang.service;

import com.zhang.bean.User;

import javax.ws.rs.*;

@Path("/userService")
@Produces("*/*")
public interface UserService {
    @Path("/user")
    @POST
    @Consumes()
    public void saveUser(User user);

    @GET
    @Path("/user/{id}")
    @Produces({"application/json"})
    public User getUser(@PathParam("id") Integer id);
}
