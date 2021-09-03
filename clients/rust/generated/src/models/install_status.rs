/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InstallStatus {
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<Box<crate::models::InstallStatusStatus>>,
}

impl InstallStatus {
    pub fn new() -> InstallStatus {
        InstallStatus {
            status: None,
        }
    }
}


