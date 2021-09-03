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

/*
 * GraniteApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_GraniteApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_GraniteApi_H_


#include "../ApiClient.h"

#include "HttpContent.h"
#include <cpprest/details/basic_types.h>
#include "../ModelBase.h"

#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  GraniteApi 
{
public:

    explicit GraniteApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~GraniteApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="keystorePassword"></param>
    /// <param name="keystorePasswordConfirm"></param>
    /// <param name="truststorePassword"></param>
    /// <param name="truststorePasswordConfirm"></param>
    /// <param name="httpsHostname"></param>
    /// <param name="httpsPort"></param>
    /// <param name="privatekeyFile"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="certificateFile"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<utility::string_t> sslSetup(
        utility::string_t keystorePassword,
        utility::string_t keystorePasswordConfirm,
        utility::string_t truststorePassword,
        utility::string_t truststorePasswordConfirm,
        utility::string_t httpsHostname,
        utility::string_t httpsPort,
        boost::optional<std::shared_ptr<HttpContent>> privatekeyFile,
        boost::optional<std::shared_ptr<HttpContent>> certificateFile
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_GraniteApi_H_ */
