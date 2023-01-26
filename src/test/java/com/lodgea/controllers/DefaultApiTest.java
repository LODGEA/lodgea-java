/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://docs.lodgea.io for more information.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.controllers;

import com.lodgea.ApiException;
import com.lodgea.model.AvailabilitySearchPost200Response;
import com.lodgea.model.AvailabilitySearchPostRequest;
import com.lodgea.model.LocationSearchPost200Response;
import com.lodgea.model.LocationSearchPost400Response;
import com.lodgea.model.LocationSearchPostRequest;
import com.lodgea.model.PropertiesGet200Response;
import com.lodgea.model.PropertiesPropertyIdAvailabilityGet200Response;
import com.lodgea.model.PropertiesPropertyIdGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Search for availability
     *
     * Get availability information based on search criteria.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void availabilitySearchPostTest() throws ApiException {
        AvailabilitySearchPostRequest availabilitySearchPostRequest = null;
        AvailabilitySearchPost200Response response = api.availabilitySearchPost(availabilitySearchPostRequest);
        // TODO: test validations
    }

    /**
     * Search for location
     *
     * Get a list of locations and their lowest available rate related to a given keyword.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void locationSearchPostTest() throws ApiException {
        LocationSearchPostRequest locationSearchPostRequest = null;
        LocationSearchPost200Response response = api.locationSearchPost(locationSearchPostRequest);
        // TODO: test validations
    }

    /**
     * List (filtered) properties
     *
     * List properties, optionally filtered by a keyword.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertiesGetTest() throws ApiException {
        String keyword = null;
        String pageToken = null;
        PropertiesGet200Response response = api.propertiesGet(keyword, pageToken);
        // TODO: test validations
    }

    /**
     * Get a properties availability
     *
     * Get detailed availability information for a specific property.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertiesPropertyIdAvailabilityGetTest() throws ApiException {
        String propertyId = null;
        String currencyCode = null;
        PropertiesPropertyIdAvailabilityGet200Response response = api.propertiesPropertyIdAvailabilityGet(propertyId, currencyCode);
        // TODO: test validations
    }

    /**
     * Get a properties details
     *
     * Get all information about a specific property by its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void propertiesPropertyIdGetTest() throws ApiException {
        String propertyId = null;
        PropertiesPropertyIdGet200Response response = api.propertiesPropertyIdGet(propertyId);
        // TODO: test validations
    }

}
