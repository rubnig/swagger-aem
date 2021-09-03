/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * API version: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"os"
	"os"
	"os"
)



// ConsoleApiRouter defines the required methods for binding the api requests to a responses for the ConsoleApi
// The ConsoleApiRouter implementation should parse necessary information from the http request, 
// pass the data to a ConsoleApiServicer to perform the required actions, then write the service results to the http response.
type ConsoleApiRouter interface { 
	GetAemProductInfo(http.ResponseWriter, *http.Request)
	GetBundleInfo(http.ResponseWriter, *http.Request)
	GetConfigMgr(http.ResponseWriter, *http.Request)
	PostBundle(http.ResponseWriter, *http.Request)
	PostJmxRepository(http.ResponseWriter, *http.Request)
	PostSamlConfiguration(http.ResponseWriter, *http.Request)
}
// CqApiRouter defines the required methods for binding the api requests to a responses for the CqApi
// The CqApiRouter implementation should parse necessary information from the http request, 
// pass the data to a CqApiServicer to perform the required actions, then write the service results to the http response.
type CqApiRouter interface { 
	GetLoginPage(http.ResponseWriter, *http.Request)
	PostCqActions(http.ResponseWriter, *http.Request)
}
// CrxApiRouter defines the required methods for binding the api requests to a responses for the CrxApi
// The CrxApiRouter implementation should parse necessary information from the http request, 
// pass the data to a CrxApiServicer to perform the required actions, then write the service results to the http response.
type CrxApiRouter interface { 
	GetCrxdeStatus(http.ResponseWriter, *http.Request)
	GetInstallStatus(http.ResponseWriter, *http.Request)
	GetPackageManagerServlet(http.ResponseWriter, *http.Request)
	PostPackageService(http.ResponseWriter, *http.Request)
	PostPackageServiceJson(http.ResponseWriter, *http.Request)
	PostPackageUpdate(http.ResponseWriter, *http.Request)
	PostSetPassword(http.ResponseWriter, *http.Request)
}
// CustomApiRouter defines the required methods for binding the api requests to a responses for the CustomApi
// The CustomApiRouter implementation should parse necessary information from the http request, 
// pass the data to a CustomApiServicer to perform the required actions, then write the service results to the http response.
type CustomApiRouter interface { 
	GetAemHealthCheck(http.ResponseWriter, *http.Request)
	PostConfigAemHealthCheckServlet(http.ResponseWriter, *http.Request)
	PostConfigAemPasswordReset(http.ResponseWriter, *http.Request)
}
// GraniteApiRouter defines the required methods for binding the api requests to a responses for the GraniteApi
// The GraniteApiRouter implementation should parse necessary information from the http request, 
// pass the data to a GraniteApiServicer to perform the required actions, then write the service results to the http response.
type GraniteApiRouter interface { 
	SslSetup(http.ResponseWriter, *http.Request)
}
// SlingApiRouter defines the required methods for binding the api requests to a responses for the SlingApi
// The SlingApiRouter implementation should parse necessary information from the http request, 
// pass the data to a SlingApiServicer to perform the required actions, then write the service results to the http response.
type SlingApiRouter interface { 
	DeleteAgent(http.ResponseWriter, *http.Request)
	DeleteNode(http.ResponseWriter, *http.Request)
	GetAgent(http.ResponseWriter, *http.Request)
	GetAgents(http.ResponseWriter, *http.Request)
	GetAuthorizableKeystore(http.ResponseWriter, *http.Request)
	GetKeystore(http.ResponseWriter, *http.Request)
	GetNode(http.ResponseWriter, *http.Request)
	GetPackage(http.ResponseWriter, *http.Request)
	GetPackageFilter(http.ResponseWriter, *http.Request)
	GetQuery(http.ResponseWriter, *http.Request)
	GetTruststore(http.ResponseWriter, *http.Request)
	GetTruststoreInfo(http.ResponseWriter, *http.Request)
	PostAgent(http.ResponseWriter, *http.Request)
	PostAuthorizableKeystore(http.ResponseWriter, *http.Request)
	PostAuthorizables(http.ResponseWriter, *http.Request)
	PostConfigAdobeGraniteSamlAuthenticationHandler(http.ResponseWriter, *http.Request)
	PostConfigApacheFelixJettyBasedHttpService(http.ResponseWriter, *http.Request)
	PostConfigApacheHttpComponentsProxyConfiguration(http.ResponseWriter, *http.Request)
	PostConfigApacheSlingDavExServlet(http.ResponseWriter, *http.Request)
	PostConfigApacheSlingGetServlet(http.ResponseWriter, *http.Request)
	PostConfigApacheSlingReferrerFilter(http.ResponseWriter, *http.Request)
	PostConfigProperty(http.ResponseWriter, *http.Request)
	PostNode(http.ResponseWriter, *http.Request)
	PostNodeRw(http.ResponseWriter, *http.Request)
	PostPath(http.ResponseWriter, *http.Request)
	PostQuery(http.ResponseWriter, *http.Request)
	PostTreeActivation(http.ResponseWriter, *http.Request)
	PostTruststore(http.ResponseWriter, *http.Request)
	PostTruststorePKCS12(http.ResponseWriter, *http.Request)
}


// ConsoleApiServicer defines the api actions for the ConsoleApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type ConsoleApiServicer interface { 
	GetAemProductInfo(context.Context) (ImplResponse, error)
	GetBundleInfo(context.Context, string) (ImplResponse, error)
	GetConfigMgr(context.Context) (ImplResponse, error)
	PostBundle(context.Context, string, string) (ImplResponse, error)
	PostJmxRepository(context.Context, string) (ImplResponse, error)
	PostSamlConfiguration(context.Context, bool, bool, bool, string, string, []string, int32, string, string, bool, string, string, string, string, string, string, bool, bool, bool, string, []string, string, []string, bool, string, int32, string, string, string, []string) (ImplResponse, error)
}


// CqApiServicer defines the api actions for the CqApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type CqApiServicer interface { 
	GetLoginPage(context.Context) (ImplResponse, error)
	PostCqActions(context.Context, string, string) (ImplResponse, error)
}


// CrxApiServicer defines the api actions for the CrxApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type CrxApiServicer interface { 
	GetCrxdeStatus(context.Context) (ImplResponse, error)
	GetInstallStatus(context.Context) (ImplResponse, error)
	GetPackageManagerServlet(context.Context) (ImplResponse, error)
	PostPackageService(context.Context, string) (ImplResponse, error)
	PostPackageServiceJson(context.Context, string, string, string, string, string, string, bool, bool, *os.File) (ImplResponse, error)
	PostPackageUpdate(context.Context, string, string, string, string, string, string) (ImplResponse, error)
	PostSetPassword(context.Context, string, string, string) (ImplResponse, error)
}


// CustomApiServicer defines the api actions for the CustomApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type CustomApiServicer interface { 
	GetAemHealthCheck(context.Context, string, bool) (ImplResponse, error)
	PostConfigAemHealthCheckServlet(context.Context, []string, string) (ImplResponse, error)
	PostConfigAemPasswordReset(context.Context, []string, string) (ImplResponse, error)
}


// GraniteApiServicer defines the api actions for the GraniteApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type GraniteApiServicer interface { 
	SslSetup(context.Context, string, string, string, string, string, string, *os.File, *os.File) (ImplResponse, error)
}


// SlingApiServicer defines the api actions for the SlingApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type SlingApiServicer interface { 
	DeleteAgent(context.Context, string, string) (ImplResponse, error)
	DeleteNode(context.Context, string, string) (ImplResponse, error)
	GetAgent(context.Context, string, string) (ImplResponse, error)
	GetAgents(context.Context, string) (ImplResponse, error)
	GetAuthorizableKeystore(context.Context, string, string) (ImplResponse, error)
	GetKeystore(context.Context, string, string) (ImplResponse, error)
	GetNode(context.Context, string, string) (ImplResponse, error)
	GetPackage(context.Context, string, string, string) (ImplResponse, error)
	GetPackageFilter(context.Context, string, string, string) (ImplResponse, error)
	GetQuery(context.Context, string, float32, string, string) (ImplResponse, error)
	GetTruststore(context.Context) (ImplResponse, error)
	GetTruststoreInfo(context.Context) (ImplResponse, error)
	PostAgent(context.Context, string, string, bool, string, string, string, bool, string, string, string, string, string, string, bool, bool, float32, bool, string, []string, string, string, bool, string, float32, string, string, string, string, string, float32, string, float32, string, float32, string, bool, string, string, string, string, string, string, string, string, bool, bool, bool, bool, bool, string, string, string) (ImplResponse, error)
	PostAuthorizableKeystore(context.Context, string, string, string, string, string, string, string, string, string, string, string, *os.File, *os.File, *os.File) (ImplResponse, error)
	PostAuthorizables(context.Context, string, string, string, string, string, string) (ImplResponse, error)
	PostConfigAdobeGraniteSamlAuthenticationHandler(context.Context, string, string, int32, string, bool, string, bool, string, string, string, string, string, []string, string, string, string, bool, string, []string, string, []string, string, int32, string, string, string, string, string, string, string, string, string, string, string, bool, string, string, string, bool, string, string, string, string, string, string, string, string, string) (ImplResponse, error)
	PostConfigApacheFelixJettyBasedHttpService(context.Context, bool, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, bool, string, string, string) (ImplResponse, error)
	PostConfigApacheHttpComponentsProxyConfiguration(context.Context, string, string, int32, string, []string, string, bool, string, string, string, string, string) (ImplResponse, error)
	PostConfigApacheSlingDavExServlet(context.Context, string, string, bool, string) (ImplResponse, error)
	PostConfigApacheSlingGetServlet(context.Context, string, string, bool, string, bool, string, bool, string) (ImplResponse, error)
	PostConfigApacheSlingReferrerFilter(context.Context, bool, string, string, string, string, string, string, string) (ImplResponse, error)
	PostConfigProperty(context.Context, string) (ImplResponse, error)
	PostNode(context.Context, string, string, string, string, *os.File) (ImplResponse, error)
	PostNodeRw(context.Context, string, string, string) (ImplResponse, error)
	PostPath(context.Context, string, string, string) (ImplResponse, error)
	PostQuery(context.Context, string, float32, string, string) (ImplResponse, error)
	PostTreeActivation(context.Context, bool, bool, string) (ImplResponse, error)
	PostTruststore(context.Context, string, string, string, string, string, *os.File) (ImplResponse, error)
	PostTruststorePKCS12(context.Context, *os.File) (ImplResponse, error)
}
