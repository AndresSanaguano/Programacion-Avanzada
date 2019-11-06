/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Util.product;
import Util.report;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author SonyVaio
 */
@Path("report")
public class Report {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Report
     */
    public Report() {
    }

    /**
     * Retrieves representation of an instance of Services.Report
     * @return an instance of java.lang.String
     */
  @Path("product")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String  getProduct() {
          product pdc=new product();
          
        return pdc.ListproductData();
    }
    
   
    
     @Path("provider")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public ArrayList  getProvider() {
          product pdc=new product();
        return pdc.ListProviderData();
    }
     @Path("{id}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public report  getReport(@PathParam("id") int id) {
          product pdc=new product();
          report r=new report();
          r=pdc.SearchProduct(id);
        return r;
    }
    /**
     * PUT method for updating or creating an instance of Report
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
