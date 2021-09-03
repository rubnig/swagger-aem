# SamlConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**ServiceRanking** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**IdpUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**IdpCertAlias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**IdpHttpRedirect** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**ServiceProviderEntityId** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**AssertionConsumerServiceURL** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SpPrivateKeyAlias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**KeyStorePassword** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**DefaultRedirectUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UserIDAttribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UseEncryption** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**CreateUser** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**AddGroupMemberships** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**GroupMembershipAttribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**DefaultGroups** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**NameIdFormat** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SynchronizeAttributes** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**HandleLogout** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**LogoutUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**ClockTolerance** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**DigestMethod** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**SignatureMethod** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**UserIntermediatePath** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SamlConfigurationProperties = Initialize-PSOpenAPIToolsSamlConfigurationProperties  -Path null `
 -ServiceRanking null `
 -IdpUrl null `
 -IdpCertAlias null `
 -IdpHttpRedirect null `
 -ServiceProviderEntityId null `
 -AssertionConsumerServiceURL null `
 -SpPrivateKeyAlias null `
 -KeyStorePassword null `
 -DefaultRedirectUrl null `
 -UserIDAttribute null `
 -UseEncryption null `
 -CreateUser null `
 -AddGroupMemberships null `
 -GroupMembershipAttribute null `
 -DefaultGroups null `
 -NameIdFormat null `
 -SynchronizeAttributes null `
 -HandleLogout null `
 -LogoutUrl null `
 -ClockTolerance null `
 -DigestMethod null `
 -SignatureMethod null `
 -UserIntermediatePath null
```

- Convert the resource to JSON
```powershell
$SamlConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

