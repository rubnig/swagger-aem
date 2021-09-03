#
# Adobe Experience Manager (AEM) API
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
# Version: 3.5.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Alias
Keystore alias name
.PARAMETER EntryType
e.g. ""privateKey""
.PARAMETER Algorithm
e.g. ""RSA""
.PARAMETER Format
e.g. ""PKCS#8""
.PARAMETER Chain
No description available.
.OUTPUTS

KeystoreItems<PSCustomObject>
#>

function Initialize-KeystoreItems {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Alias},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${EntryType},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Algorithm},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Format},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Chain}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => KeystoreItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "alias" = ${Alias}
            "entryType" = ${EntryType}
            "algorithm" = ${Algorithm}
            "format" = ${Format}
            "chain" = ${Chain}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to KeystoreItems<PSCustomObject>

.DESCRIPTION

Convert from JSON to KeystoreItems<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

KeystoreItems<PSCustomObject>
#>
function ConvertFrom-JsonToKeystoreItems {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => KeystoreItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in KeystoreItems
        $AllProperties = ("alias", "entryType", "algorithm", "format", "chain")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "alias"))) { #optional property not found
            $Alias = $null
        } else {
            $Alias = $JsonParameters.PSobject.Properties["alias"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entryType"))) { #optional property not found
            $EntryType = $null
        } else {
            $EntryType = $JsonParameters.PSobject.Properties["entryType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "algorithm"))) { #optional property not found
            $Algorithm = $null
        } else {
            $Algorithm = $JsonParameters.PSobject.Properties["algorithm"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "format"))) { #optional property not found
            $Format = $null
        } else {
            $Format = $JsonParameters.PSobject.Properties["format"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "chain"))) { #optional property not found
            $Chain = $null
        } else {
            $Chain = $JsonParameters.PSobject.Properties["chain"].value
        }

        $PSO = [PSCustomObject]@{
            "alias" = ${Alias}
            "entryType" = ${EntryType}
            "algorithm" = ${Algorithm}
            "format" = ${Format}
            "chain" = ${Chain}
        }

        return $PSO
    }

}

