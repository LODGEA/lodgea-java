/*
 * lodgea-java
 * LODGEA SDK for java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.controllers;

import com.lodgea.ApiException;
import com.lodgea.model.InlineObject;
import com.lodgea.model.InlineObject1;
import com.lodgea.model.InlineResponse200;
import com.lodgea.model.InlineResponse2001;
import com.lodgea.model.InlineResponse2002;
import com.lodgea.model.InlineResponse2003;
import com.lodgea.model.InlineResponse2004;
import com.lodgea.model.InlineResponse400;
import com.lodgea.model.InlineResponse4001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Search for availability
     *
     * Get availability information based on search criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void availabilitySearchPostTest() throws ApiException {
        InlineObject1 inlineObject1 = null;
                InlineResponse2001 response = api.availabilitySearchPost(inlineObject1);
        // TODO: test validations
    }
    
    /**
     * Search for location
     *
     * Get a list of locations and their lowest available rate related to a given keyword.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locationSearchPostTest() throws ApiException {
        InlineObject inlineObject = null;
                InlineResponse200 response = api.locationSearchPost(inlineObject);
        // TODO: test validations
    }
    
    /**
     * List (filtered) properties
     *
     * List properties, optionally filtered by a keyword.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void propertiesGetTest() throws ApiException {
        String keyword = null;
        String pageToken = null;
                InlineResponse2002 response = api.propertiesGet(keyword, pageToken);
        // TODO: test validations
    }
    
    /**
     * Get a properties availability
     *
     * Get detailed availability information for a specific property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void propertiesPropertyIdAvailabilityGetTest() throws ApiException {
        String propertyId = null;
        String currencyCode = null;
                InlineResponse2004 response = api.propertiesPropertyIdAvailabilityGet(propertyId, currencyCode);
        // TODO: test validations
    }
    
    /**
     * Get a properties details
     *
     * Get all information about a specific property by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void propertiesPropertyIdGetTest() throws ApiException {
        String propertyId = null;
                InlineResponse2003 response = api.propertiesPropertyIdGet(propertyId);
        // TODO: test validations
    }
    
}
