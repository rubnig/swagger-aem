#
# Adobe Experience Manager (AEM) API
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
# Version: 3.5.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

#region Import functions

# define the following classes in PowerShell
try {
    Add-Type -AssemblyName System.Web -ErrorAction Ignore | Out-Null
    Add-Type -AssemblyName System.Net -ErrorAction Ignore | Out-Null
} catch {
    Write-Verbose $_
}

# set $ErrorActionPreference to 'Stop' globally
$ErrorActionPreference = 'Stop'

# store the API client's configuration
$Script:Configuration = [System.Collections.HashTable]@{}

$Script:CmdletBindingParameters = @('Verbose','Debug','ErrorAction','WarningAction','InformationAction','ErrorVariable','WarningVariable','InformationVariable','OutVariable','OutBuffer','PipelineVariable')

'Api', 'Model', 'Client', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Debug "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Error -Message "Failed to import function $($_.Fullname): $_"
    }
}

#endregion
