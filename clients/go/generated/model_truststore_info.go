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

// TruststoreInfo struct for TruststoreInfo
type TruststoreInfo struct {
	Aliases *[]TruststoreItems `json:"aliases,omitempty"`
	// False if truststore don't exist
	Exists *bool `json:"exists,omitempty"`
}

// NewTruststoreInfo instantiates a new TruststoreInfo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTruststoreInfo() *TruststoreInfo {
	this := TruststoreInfo{}
	return &this
}

// NewTruststoreInfoWithDefaults instantiates a new TruststoreInfo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTruststoreInfoWithDefaults() *TruststoreInfo {
	this := TruststoreInfo{}
	return &this
}

// GetAliases returns the Aliases field value if set, zero value otherwise.
func (o *TruststoreInfo) GetAliases() []TruststoreItems {
	if o == nil || o.Aliases == nil {
		var ret []TruststoreItems
		return ret
	}
	return *o.Aliases
}

// GetAliasesOk returns a tuple with the Aliases field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreInfo) GetAliasesOk() (*[]TruststoreItems, bool) {
	if o == nil || o.Aliases == nil {
		return nil, false
	}
	return o.Aliases, true
}

// HasAliases returns a boolean if a field has been set.
func (o *TruststoreInfo) HasAliases() bool {
	if o != nil && o.Aliases != nil {
		return true
	}

	return false
}

// SetAliases gets a reference to the given []TruststoreItems and assigns it to the Aliases field.
func (o *TruststoreInfo) SetAliases(v []TruststoreItems) {
	o.Aliases = &v
}

// GetExists returns the Exists field value if set, zero value otherwise.
func (o *TruststoreInfo) GetExists() bool {
	if o == nil || o.Exists == nil {
		var ret bool
		return ret
	}
	return *o.Exists
}

// GetExistsOk returns a tuple with the Exists field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TruststoreInfo) GetExistsOk() (*bool, bool) {
	if o == nil || o.Exists == nil {
		return nil, false
	}
	return o.Exists, true
}

// HasExists returns a boolean if a field has been set.
func (o *TruststoreInfo) HasExists() bool {
	if o != nil && o.Exists != nil {
		return true
	}

	return false
}

// SetExists gets a reference to the given bool and assigns it to the Exists field.
func (o *TruststoreInfo) SetExists(v bool) {
	o.Exists = &v
}

func (o TruststoreInfo) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Aliases != nil {
		toSerialize["aliases"] = o.Aliases
	}
	if o.Exists != nil {
		toSerialize["exists"] = o.Exists
	}
	return json.Marshal(toSerialize)
}

type NullableTruststoreInfo struct {
	value *TruststoreInfo
	isSet bool
}

func (v NullableTruststoreInfo) Get() *TruststoreInfo {
	return v.value
}

func (v *NullableTruststoreInfo) Set(val *TruststoreInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableTruststoreInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableTruststoreInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTruststoreInfo(val *TruststoreInfo) *NullableTruststoreInfo {
	return &NullableTruststoreInfo{value: val, isSet: true}
}

func (v NullableTruststoreInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTruststoreInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


