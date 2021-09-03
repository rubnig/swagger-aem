<?php
/**
 * GraniteApiInterface
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;

/**
 * GraniteApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface GraniteApiInterface
{

    /**
     * Sets authentication method aemAuth
     *
     * @param string $value Value of the aemAuth authentication method.
     *
     * @return void
     */
    public function setaemAuth($value);

    /**
     * Operation sslSetup
     *
     * @param  \string $keystorePassword   (required)
     * @param  \string $keystorePasswordConfirm   (required)
     * @param  \string $truststorePassword   (required)
     * @param  \string $truststorePasswordConfirm   (required)
     * @param  \string $httpsHostname   (required)
     * @param  \string $httpsPort   (required)
     * @param  \UploadedFile $privatekeyFile   (optional)
     * @param  \UploadedFile $certificateFile   (optional)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function sslSetup($keystorePassword, $keystorePasswordConfirm, $truststorePassword, $truststorePasswordConfirm, $httpsHostname, $httpsPort, UploadedFile $privatekeyFile = null, UploadedFile $certificateFile = null, &$responseCode, array &$responseHeaders);
}
