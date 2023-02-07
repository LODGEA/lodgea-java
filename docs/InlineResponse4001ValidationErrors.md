

# InlineResponse4001ValidationErrors

A Zod issue. More fields can be present depending on the issue type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | The ZodIssueCode describing the issue. | 
**message** | **String** | A message describing the error in a human readable way. | 
**path** | **List&lt;String&gt;** | An array describing the position of the faulty property. The first segment will always be either \&quot;body\&quot;, \&quot;pathParameters\&quot; or \&quot;queryParameters\&quot; indicating on which part of your request the error occurred. | 



## Enum: CodeEnum

Name | Value
---- | -----
INVALID_TYPE | &quot;invalid_type&quot;
INVALID_LITERAL | &quot;invalid_literal&quot;
CUSTOM | &quot;custom&quot;
INVALID_UNION | &quot;invalid_union&quot;
INVALID_UNION_DISCRIMINATOR | &quot;invalid_union_discriminator&quot;
INVALID_ENUM_VALUE | &quot;invalid_enum_value&quot;
UNRECOGNIZED_KEYS | &quot;unrecognized_keys&quot;
INVALID_ARGUMENTS | &quot;invalid_arguments&quot;
INVALID_RETURN_TYPE | &quot;invalid_return_type&quot;
INVALID_DATE | &quot;invalid_date&quot;
INVALID_STRING | &quot;invalid_string&quot;
TOO_SMALL | &quot;too_small&quot;
TOO_BIG | &quot;too_big&quot;
INVALID_INTERSECTION_TYPES | &quot;invalid_intersection_types&quot;
NOT_MULTIPLE_OF | &quot;not_multiple_of&quot;
NOT_FINITE | &quot;not_finite&quot;



