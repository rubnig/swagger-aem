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


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class GraniteApi {
    protected basePath = 'http://localhost';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = undefined;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1 extends object, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * 
     * @param keystorePassword 
     * @param keystorePasswordConfirm 
     * @param truststorePassword 
     * @param truststorePasswordConfirm 
     * @param httpsHostname 
     * @param httpsPort 
     * @param privatekeyFile 
     * @param certificateFile 
     */
    public sslSetup(keystorePassword: string, keystorePasswordConfirm: string, truststorePassword: string, truststorePasswordConfirm: string, httpsHostname: string, httpsPort: string, privatekeyFile?: any, certificateFile?: any, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: string;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/libs/granite/security/post/sslSetup.html';

        let queryParameters: any = {};
        let headerParams: any = {};
        let formParams = new FormData();
        let reqHasFile = false;

        // verify required parameter 'keystorePassword' is not null or undefined
        if (keystorePassword === null || keystorePassword === undefined) {
            throw new Error('Required parameter keystorePassword was null or undefined when calling sslSetup.');
        }

        // verify required parameter 'keystorePasswordConfirm' is not null or undefined
        if (keystorePasswordConfirm === null || keystorePasswordConfirm === undefined) {
            throw new Error('Required parameter keystorePasswordConfirm was null or undefined when calling sslSetup.');
        }

        // verify required parameter 'truststorePassword' is not null or undefined
        if (truststorePassword === null || truststorePassword === undefined) {
            throw new Error('Required parameter truststorePassword was null or undefined when calling sslSetup.');
        }

        // verify required parameter 'truststorePasswordConfirm' is not null or undefined
        if (truststorePasswordConfirm === null || truststorePasswordConfirm === undefined) {
            throw new Error('Required parameter truststorePasswordConfirm was null or undefined when calling sslSetup.');
        }

        // verify required parameter 'httpsHostname' is not null or undefined
        if (httpsHostname === null || httpsHostname === undefined) {
            throw new Error('Required parameter httpsHostname was null or undefined when calling sslSetup.');
        }

        // verify required parameter 'httpsPort' is not null or undefined
        if (httpsPort === null || httpsPort === undefined) {
            throw new Error('Required parameter httpsPort was null or undefined when calling sslSetup.');
        }

        if (keystorePassword !== null && keystorePassword !== undefined) {
            queryParameters['keystorePassword'] = <string><any>keystorePassword;
        }
        if (keystorePasswordConfirm !== null && keystorePasswordConfirm !== undefined) {
            queryParameters['keystorePasswordConfirm'] = <string><any>keystorePasswordConfirm;
        }
        if (truststorePassword !== null && truststorePassword !== undefined) {
            queryParameters['truststorePassword'] = <string><any>truststorePassword;
        }
        if (truststorePasswordConfirm !== null && truststorePasswordConfirm !== undefined) {
            queryParameters['truststorePasswordConfirm'] = <string><any>truststorePasswordConfirm;
        }
        if (httpsHostname !== null && httpsHostname !== undefined) {
            queryParameters['httpsHostname'] = <string><any>httpsHostname;
        }
        if (httpsPort !== null && httpsPort !== undefined) {
            queryParameters['httpsPort'] = <string><any>httpsPort;
        }

        localVarPath = localVarPath + "?" + $.param(queryParameters);
        reqHasFile = true;
        formParams.append("privatekeyFile", privatekeyFile);
        reqHasFile = true;
        formParams.append("certificateFile", certificateFile);
        // to determine the Content-Type header
        let consumes: string[] = [
            'multipart/form-data'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'text/plain'
        ];

        // authentication (aemAuth) required
        // http basic authentication required
        if (this.configuration.username || this.configuration.password) {
            headerParams['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        if (!reqHasFile) {
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }
        requestOptions.data = formParams;
        if (reqHasFile) {
            requestOptions.contentType = false;
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: string;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: string, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

}
