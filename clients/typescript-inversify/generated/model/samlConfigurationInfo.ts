/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { SamlConfigurationProperties } from './samlConfigurationProperties';


export interface SamlConfigurationInfo { 
    /**
     * Persistent Identity (PID)
     */
    pid?: string;
    /**
     * Title
     */
    title?: string;
    /**
     * Title
     */
    description?: string;
    /**
     * needed for configuration binding
     */
    bundle_location?: string;
    /**
     * needed for configuraiton binding
     */
    service_location?: string;
    properties?: SamlConfigurationProperties;
}
