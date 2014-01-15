/*
 * Copyright Tidemark Systems, Inc. All rights reserved.
 * Tidemark Systems Confidential and Proprietary Information. Not for external distribution, use or sale.
 * Tidemark Systems software is exclusively licensed according to the terms of our Software License and Services Agreement.
 */
package app.tomcat.api;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author "Nick Hristov" <nhristov@tidemark.net>
 */
@Path("LoginService")
public interface LoginService {
    @Path("login/{username}")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    String login(LoginForm form);

}
