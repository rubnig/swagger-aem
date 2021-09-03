/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CqApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 * Version: 3.5.0-pre.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.CqApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.CqApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CqApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CqApiBasePath')) :
                   'http://localhost';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CqApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CqApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CqApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.CqApi.prototype.getLoginPage = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/libs/granite/core/content/login.html';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * 
 * @param {!string} authorizableId 
 * @param {!string} changelog 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CqApi.prototype.postCqActions = function(authorizableId, changelog, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/.cqactions.html';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorizableId' is set
  if (!authorizableId) {
    throw new Error('Missing required parameter authorizableId when calling postCqActions');
  }
  // verify required parameter 'changelog' is set
  if (!changelog) {
    throw new Error('Missing required parameter changelog when calling postCqActions');
  }
  if (authorizableId !== undefined) {
    queryParameters['authorizableId'] = authorizableId;
  }

  if (changelog !== undefined) {
    queryParameters['changelog'] = changelog;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
