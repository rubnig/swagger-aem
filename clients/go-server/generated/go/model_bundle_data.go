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

type BundleData struct {

	// Bundle ID
	Id int32 `json:"id,omitempty"`

	// Bundle name
	Name string `json:"name,omitempty"`

	// Is bundle a fragment
	Fragment bool `json:"fragment,omitempty"`

	// Numeric raw bundle state value
	StateRaw int32 `json:"stateRaw,omitempty"`

	// Bundle state value
	State string `json:"state,omitempty"`

	// Bundle version
	Version string `json:"version,omitempty"`

	// Bundle symbolic name
	SymbolicName string `json:"symbolicName,omitempty"`

	// Bundle category
	Category string `json:"category,omitempty"`

	Props []BundleDataProp `json:"props,omitempty"`
}

// AssertBundleDataRequired checks if the required fields are not zero-ed
func AssertBundleDataRequired(obj BundleData) error {
	for _, el := range obj.Props {
		if err := AssertBundleDataPropRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRecurseBundleDataRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of BundleData (e.g. [][]BundleData), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseBundleDataRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aBundleData, ok := obj.(BundleData)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertBundleDataRequired(aBundleData)
	})
}
