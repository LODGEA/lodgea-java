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
import com.lodgea.model.AvailabilitySearch;
import com.lodgea.model.V1AvailabilitySearchPost200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AvailabilityApi
 */
@Disabled
public class AvailabilityApiTest {

    private final AvailabilityApi api = new AvailabilityApi();

    /**
     * Search for Availability
     *
     * Get availability information based on search criteria. The possible values for the different content parameters are listed below. All parameters are optional.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AvailabilitySearchPostTest() throws ApiException {
        AvailabilitySearch availabilitySearch = null;
        V1AvailabilitySearchPost200Response response = api.v1AvailabilitySearchPost(availabilitySearch);
        // TODO: test validations
    }

}