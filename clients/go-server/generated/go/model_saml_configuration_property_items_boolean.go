/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * API version: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type SamlConfigurationPropertyItemsBoolean struct {

	// property name
	Name string `json:"name,omitempty"`

	// True if optional
	Optional bool `json:"optional,omitempty"`

	// True if property is set
	IsSet bool `json:"is_set,omitempty"`

	// Property type, 1=String, 3=long, 11=boolean, 12=Password
	Type int32 `json:"type,omitempty"`

	// Property value
	Value bool `json:"value,omitempty"`

	// Property description
	Description string `json:"description,omitempty"`
}

// AssertSamlConfigurationPropertyItemsBooleanRequired checks if the required fields are not zero-ed
func AssertSamlConfigurationPropertyItemsBooleanRequired(obj SamlConfigurationPropertyItemsBoolean) error {
	return nil
}

// AssertRecurseSamlConfigurationPropertyItemsBooleanRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of SamlConfigurationPropertyItemsBoolean (e.g. [][]SamlConfigurationPropertyItemsBoolean), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseSamlConfigurationPropertyItemsBooleanRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aSamlConfigurationPropertyItemsBoolean, ok := obj.(SamlConfigurationPropertyItemsBoolean)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertSamlConfigurationPropertyItemsBooleanRequired(aSamlConfigurationPropertyItemsBoolean)
	})
}
