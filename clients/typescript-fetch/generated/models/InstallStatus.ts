/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    InstallStatusStatus,
    InstallStatusStatusFromJSON,
    InstallStatusStatusFromJSONTyped,
    InstallStatusStatusToJSON,
} from './';

/**
 * 
 * @export
 * @interface InstallStatus
 */
export interface InstallStatus {
    /**
     * 
     * @type {InstallStatusStatus}
     * @memberof InstallStatus
     */
    status?: InstallStatusStatus;
}

export function InstallStatusFromJSON(json: any): InstallStatus {
    return InstallStatusFromJSONTyped(json, false);
}

export function InstallStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallStatus {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': !exists(json, 'status') ? undefined : InstallStatusStatusFromJSON(json['status']),
    };
}

export function InstallStatusToJSON(value?: InstallStatus | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': InstallStatusStatusToJSON(value.status),
    };
}


