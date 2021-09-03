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

.PARAMETER Id
Bundle ID
.PARAMETER Name
Bundle name
.PARAMETER Fragment
Is bundle a fragment
.PARAMETER StateRaw
Numeric raw bundle state value
.PARAMETER State
Bundle state value
.PARAMETER Version
Bundle version
.PARAMETER SymbolicName
Bundle symbolic name
.PARAMETER Category
Bundle category
.PARAMETER Props
No description available.
.OUTPUTS

BundleData<PSCustomObject>
#>

function Initialize-BundleData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Fragment},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${StateRaw},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${State},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Version},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SymbolicName},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Category},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Props}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BundleData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "fragment" = ${Fragment}
            "stateRaw" = ${StateRaw}
            "state" = ${State}
            "version" = ${Version}
            "symbolicName" = ${SymbolicName}
            "category" = ${Category}
            "props" = ${Props}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BundleData<PSCustomObject>

.DESCRIPTION

Convert from JSON to BundleData<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BundleData<PSCustomObject>
#>
function ConvertFrom-JsonToBundleData {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BundleData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BundleData
        $AllProperties = ("id", "name", "fragment", "stateRaw", "state", "version", "symbolicName", "category", "props")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fragment"))) { #optional property not found
            $Fragment = $null
        } else {
            $Fragment = $JsonParameters.PSobject.Properties["fragment"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stateRaw"))) { #optional property not found
            $StateRaw = $null
        } else {
            $StateRaw = $JsonParameters.PSobject.Properties["stateRaw"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "state"))) { #optional property not found
            $State = $null
        } else {
            $State = $JsonParameters.PSobject.Properties["state"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "version"))) { #optional property not found
            $Version = $null
        } else {
            $Version = $JsonParameters.PSobject.Properties["version"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbolicName"))) { #optional property not found
            $SymbolicName = $null
        } else {
            $SymbolicName = $JsonParameters.PSobject.Properties["symbolicName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "category"))) { #optional property not found
            $Category = $null
        } else {
            $Category = $JsonParameters.PSobject.Properties["category"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "props"))) { #optional property not found
            $Props = $null
        } else {
            $Props = $JsonParameters.PSobject.Properties["props"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "fragment" = ${Fragment}
            "stateRaw" = ${StateRaw}
            "state" = ${State}
            "version" = ${Version}
            "symbolicName" = ${SymbolicName}
            "category" = ${Category}
            "props" = ${Props}
        }

        return $PSO
    }

}

