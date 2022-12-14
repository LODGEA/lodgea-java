/*
 * lodgea-java
 * LODGEA SDK for Java. Check out https://lodgea.redoc.ly for more information.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@lodgea.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lodgea.controllers;

import com.lodgea.ApiException;
import com.lodgea.model.LocationSearch;
import com.lodgea.model.V1LocationSearchPost200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationApi
 */
@Disabled
public class LocationApiTest {

    private final LocationApi api = new LocationApi();

    /**
     * Search for Location
     *
     * Get a location by search text in free from. This parameter is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1LocationSearchPostTest() throws ApiException {
        LocationSearch locationSearch = null;
        V1LocationSearchPost200Response response = api.v1LocationSearchPost(locationSearch);
        // TODO: test validations
    }

}
