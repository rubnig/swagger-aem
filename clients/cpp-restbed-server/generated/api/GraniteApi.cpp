/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "GraniteApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

GraniteApi::GraniteApi() {
}

GraniteApi::~GraniteApi() {}

void GraniteApi::startService(int const& port) {
	// A typical pattern is to derive a class from GraniteApi and allocate the shared pointers for restbed::Resource objects
	// and manipulate them (e.g. binding GET/POST handler functions) before this startService() gets called.
	// In such a case we want to use our m_spXXX variables.
	// However in case these shared pointers are nullptr, then allocate the restbed::Resources now:
	if (!m_spGraniteApiLibsGraniteSecurityPostSslSetup.htmlResource)
		m_spGraniteApiLibsGraniteSecurityPostSslSetup.htmlResource = std::make_shared<GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource>();
	this->publish(m_spGraniteApiLibsGraniteSecurityPostSslSetup.htmlResource);

	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void GraniteApi::stopService() {
	this->stop();
}

GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource::GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource()
{
	this->set_path("/libs/granite/security/post/sslSetup.html/");
	this->set_method_handler("POST",
		std::bind(&GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource::POST_method_handler, this,
			std::placeholders::_1));
}

GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource::~GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource()
{
}

void GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource::set_handler_POST(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
	)> handler) {
	handler_POST_ = std::move(handler);
}


void GraniteApiLibsGraniteSecurityPostSslSetup.htmlResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const std::string keystorePassword = request->get_query_parameter("keystorePassword", "");
			const std::string keystorePasswordConfirm = request->get_query_parameter("keystorePasswordConfirm", "");
			const std::string truststorePassword = request->get_query_parameter("truststorePassword", "");
			const std::string truststorePasswordConfirm = request->get_query_parameter("truststorePasswordConfirm", "");
			const std::string httpsHostname = request->get_query_parameter("httpsHostname", "");
			const std::string httpsPort = request->get_query_parameter("httpsPort", "");


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_POST_)
			{
				std::tie(status_code, result) = handler_POST_(
					keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile
				);
			}

			if (status_code == 0) {
				session->close(0, result.empty() ? "Default response" : std::move(result), { {"Connection", "close"} });
				return;
			}

}




}
}
}
}
