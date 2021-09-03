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

// InstallStatus struct for InstallStatus
type InstallStatus struct {
	Status *InstallStatusStatus `json:"status,omitempty"`
}

// NewInstallStatus instantiates a new InstallStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInstallStatus() *InstallStatus {
	this := InstallStatus{}
	return &this
}

// NewInstallStatusWithDefaults instantiates a new InstallStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInstallStatusWithDefaults() *InstallStatus {
	this := InstallStatus{}
	return &this
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *InstallStatus) GetStatus() InstallStatusStatus {
	if o == nil || o.Status == nil {
		var ret InstallStatusStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallStatus) GetStatusOk() (*InstallStatusStatus, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *InstallStatus) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given InstallStatusStatus and assigns it to the Status field.
func (o *InstallStatus) SetStatus(v InstallStatusStatus) {
	o.Status = &v
}

func (o InstallStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableInstallStatus struct {
	value *InstallStatus
	isSet bool
}

func (v NullableInstallStatus) Get() *InstallStatus {
	return v.value
}

func (v *NullableInstallStatus) Set(val *InstallStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableInstallStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableInstallStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInstallStatus(val *InstallStatus) *NullableInstallStatus {
	return &NullableInstallStatus{value: val, isSet: true}
}

func (v NullableInstallStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInstallStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


