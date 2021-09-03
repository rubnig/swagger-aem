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

// BundleData struct for BundleData
type BundleData struct {
	// Bundle ID
	Id *int32 `json:"id,omitempty"`
	// Bundle name
	Name *string `json:"name,omitempty"`
	// Is bundle a fragment
	Fragment *bool `json:"fragment,omitempty"`
	// Numeric raw bundle state value
	StateRaw *int32 `json:"stateRaw,omitempty"`
	// Bundle state value
	State *string `json:"state,omitempty"`
	// Bundle version
	Version *string `json:"version,omitempty"`
	// Bundle symbolic name
	SymbolicName *string `json:"symbolicName,omitempty"`
	// Bundle category
	Category *string `json:"category,omitempty"`
	Props *[]BundleDataProp `json:"props,omitempty"`
}

// NewBundleData instantiates a new BundleData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBundleData() *BundleData {
	this := BundleData{}
	return &this
}

// NewBundleDataWithDefaults instantiates a new BundleData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBundleDataWithDefaults() *BundleData {
	this := BundleData{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *BundleData) GetId() int32 {
	if o == nil || o.Id == nil {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetIdOk() (*int32, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BundleData) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *BundleData) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *BundleData) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *BundleData) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *BundleData) SetName(v string) {
	o.Name = &v
}

// GetFragment returns the Fragment field value if set, zero value otherwise.
func (o *BundleData) GetFragment() bool {
	if o == nil || o.Fragment == nil {
		var ret bool
		return ret
	}
	return *o.Fragment
}

// GetFragmentOk returns a tuple with the Fragment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetFragmentOk() (*bool, bool) {
	if o == nil || o.Fragment == nil {
		return nil, false
	}
	return o.Fragment, true
}

// HasFragment returns a boolean if a field has been set.
func (o *BundleData) HasFragment() bool {
	if o != nil && o.Fragment != nil {
		return true
	}

	return false
}

// SetFragment gets a reference to the given bool and assigns it to the Fragment field.
func (o *BundleData) SetFragment(v bool) {
	o.Fragment = &v
}

// GetStateRaw returns the StateRaw field value if set, zero value otherwise.
func (o *BundleData) GetStateRaw() int32 {
	if o == nil || o.StateRaw == nil {
		var ret int32
		return ret
	}
	return *o.StateRaw
}

// GetStateRawOk returns a tuple with the StateRaw field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetStateRawOk() (*int32, bool) {
	if o == nil || o.StateRaw == nil {
		return nil, false
	}
	return o.StateRaw, true
}

// HasStateRaw returns a boolean if a field has been set.
func (o *BundleData) HasStateRaw() bool {
	if o != nil && o.StateRaw != nil {
		return true
	}

	return false
}

// SetStateRaw gets a reference to the given int32 and assigns it to the StateRaw field.
func (o *BundleData) SetStateRaw(v int32) {
	o.StateRaw = &v
}

// GetState returns the State field value if set, zero value otherwise.
func (o *BundleData) GetState() string {
	if o == nil || o.State == nil {
		var ret string
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetStateOk() (*string, bool) {
	if o == nil || o.State == nil {
		return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *BundleData) HasState() bool {
	if o != nil && o.State != nil {
		return true
	}

	return false
}

// SetState gets a reference to the given string and assigns it to the State field.
func (o *BundleData) SetState(v string) {
	o.State = &v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *BundleData) GetVersion() string {
	if o == nil || o.Version == nil {
		var ret string
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetVersionOk() (*string, bool) {
	if o == nil || o.Version == nil {
		return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *BundleData) HasVersion() bool {
	if o != nil && o.Version != nil {
		return true
	}

	return false
}

// SetVersion gets a reference to the given string and assigns it to the Version field.
func (o *BundleData) SetVersion(v string) {
	o.Version = &v
}

// GetSymbolicName returns the SymbolicName field value if set, zero value otherwise.
func (o *BundleData) GetSymbolicName() string {
	if o == nil || o.SymbolicName == nil {
		var ret string
		return ret
	}
	return *o.SymbolicName
}

// GetSymbolicNameOk returns a tuple with the SymbolicName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetSymbolicNameOk() (*string, bool) {
	if o == nil || o.SymbolicName == nil {
		return nil, false
	}
	return o.SymbolicName, true
}

// HasSymbolicName returns a boolean if a field has been set.
func (o *BundleData) HasSymbolicName() bool {
	if o != nil && o.SymbolicName != nil {
		return true
	}

	return false
}

// SetSymbolicName gets a reference to the given string and assigns it to the SymbolicName field.
func (o *BundleData) SetSymbolicName(v string) {
	o.SymbolicName = &v
}

// GetCategory returns the Category field value if set, zero value otherwise.
func (o *BundleData) GetCategory() string {
	if o == nil || o.Category == nil {
		var ret string
		return ret
	}
	return *o.Category
}

// GetCategoryOk returns a tuple with the Category field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetCategoryOk() (*string, bool) {
	if o == nil || o.Category == nil {
		return nil, false
	}
	return o.Category, true
}

// HasCategory returns a boolean if a field has been set.
func (o *BundleData) HasCategory() bool {
	if o != nil && o.Category != nil {
		return true
	}

	return false
}

// SetCategory gets a reference to the given string and assigns it to the Category field.
func (o *BundleData) SetCategory(v string) {
	o.Category = &v
}

// GetProps returns the Props field value if set, zero value otherwise.
func (o *BundleData) GetProps() []BundleDataProp {
	if o == nil || o.Props == nil {
		var ret []BundleDataProp
		return ret
	}
	return *o.Props
}

// GetPropsOk returns a tuple with the Props field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleData) GetPropsOk() (*[]BundleDataProp, bool) {
	if o == nil || o.Props == nil {
		return nil, false
	}
	return o.Props, true
}

// HasProps returns a boolean if a field has been set.
func (o *BundleData) HasProps() bool {
	if o != nil && o.Props != nil {
		return true
	}

	return false
}

// SetProps gets a reference to the given []BundleDataProp and assigns it to the Props field.
func (o *BundleData) SetProps(v []BundleDataProp) {
	o.Props = &v
}

func (o BundleData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Fragment != nil {
		toSerialize["fragment"] = o.Fragment
	}
	if o.StateRaw != nil {
		toSerialize["stateRaw"] = o.StateRaw
	}
	if o.State != nil {
		toSerialize["state"] = o.State
	}
	if o.Version != nil {
		toSerialize["version"] = o.Version
	}
	if o.SymbolicName != nil {
		toSerialize["symbolicName"] = o.SymbolicName
	}
	if o.Category != nil {
		toSerialize["category"] = o.Category
	}
	if o.Props != nil {
		toSerialize["props"] = o.Props
	}
	return json.Marshal(toSerialize)
}

type NullableBundleData struct {
	value *BundleData
	isSet bool
}

func (v NullableBundleData) Get() *BundleData {
	return v.value
}

func (v *NullableBundleData) Set(val *BundleData) {
	v.value = val
	v.isSet = true
}

func (v NullableBundleData) IsSet() bool {
	return v.isSet
}

func (v *NullableBundleData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBundleData(val *BundleData) *NullableBundleData {
	return &NullableBundleData{value: val, isSet: true}
}

func (v NullableBundleData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBundleData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

