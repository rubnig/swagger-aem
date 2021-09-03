/*
Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

API version: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// BundleDataProp struct for BundleDataProp
type BundleDataProp struct {
	// Bundle data key
	Key *string `json:"key,omitempty"`
	// Bundle data value
	Value *string `json:"value,omitempty"`
}

// NewBundleDataProp instantiates a new BundleDataProp object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBundleDataProp() *BundleDataProp {
	this := BundleDataProp{}
	return &this
}

// NewBundleDataPropWithDefaults instantiates a new BundleDataProp object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBundleDataPropWithDefaults() *BundleDataProp {
	this := BundleDataProp{}
	return &this
}

// GetKey returns the Key field value if set, zero value otherwise.
func (o *BundleDataProp) GetKey() string {
	if o == nil || o.Key == nil {
		var ret string
		return ret
	}
	return *o.Key
}

// GetKeyOk returns a tuple with the Key field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleDataProp) GetKeyOk() (*string, bool) {
	if o == nil || o.Key == nil {
		return nil, false
	}
	return o.Key, true
}

// HasKey returns a boolean if a field has been set.
func (o *BundleDataProp) HasKey() bool {
	if o != nil && o.Key != nil {
		return true
	}

	return false
}

// SetKey gets a reference to the given string and assigns it to the Key field.
func (o *BundleDataProp) SetKey(v string) {
	o.Key = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *BundleDataProp) GetValue() string {
	if o == nil || o.Value == nil {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleDataProp) GetValueOk() (*string, bool) {
	if o == nil || o.Value == nil {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *BundleDataProp) HasValue() bool {
	if o != nil && o.Value != nil {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *BundleDataProp) SetValue(v string) {
	o.Value = &v
}

func (o BundleDataProp) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Key != nil {
		toSerialize["key"] = o.Key
	}
	if o.Value != nil {
		toSerialize["value"] = o.Value
	}
	return json.Marshal(toSerialize)
}

type NullableBundleDataProp struct {
	value *BundleDataProp
	isSet bool
}

func (v NullableBundleDataProp) Get() *BundleDataProp {
	return v.value
}

func (v *NullableBundleDataProp) Set(val *BundleDataProp) {
	v.value = val
	v.isSet = true
}

func (v NullableBundleDataProp) IsSet() bool {
	return v.isSet
}

func (v *NullableBundleDataProp) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBundleDataProp(val *BundleDataProp) *NullableBundleDataProp {
	return &NullableBundleDataProp{value: val, isSet: true}
}

func (v NullableBundleDataProp) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBundleDataProp) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


