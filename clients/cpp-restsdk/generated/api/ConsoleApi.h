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
 * ConsoleApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_ConsoleApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_ConsoleApi_H_


#include "../ApiClient.h"

#include "BundleInfo.h"
#include "SamlConfigurationInfo.h"
#include <cpprest/details/basic_types.h>


#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  ConsoleApi 
{
public:

    explicit ConsoleApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~ConsoleApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<std::vector<utility::string_t>> getAemProductInfo(
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="name"></param>
    pplx::task<std::shared_ptr<BundleInfo>> getBundleInfo(
        utility::string_t name
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<utility::string_t> getConfigMgr(
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="name"></param>
    /// <param name="action"></param>
    pplx::task<void> postBundle(
        utility::string_t name,
        utility::string_t action
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="action"></param>
    pplx::task<void> postJmxRepository(
        utility::string_t action
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="post"> (optional, default to false)</param>
    /// <param name="apply"> (optional, default to false)</param>
    /// <param name="r_delete"> (optional, default to false)</param>
    /// <param name="action"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="Dollarlocation"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="path"> (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    /// <param name="servicePeriodranking"> (optional, default to 0)</param>
    /// <param name="idpUrl"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="idpCertAlias"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="idpHttpRedirect"> (optional, default to false)</param>
    /// <param name="serviceProviderEntityId"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="assertionConsumerServiceURL"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="spPrivateKeyAlias"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="keyStorePassword"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="defaultRedirectUrl"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="userIDAttribute"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="useEncryption"> (optional, default to false)</param>
    /// <param name="createUser"> (optional, default to false)</param>
    /// <param name="addGroupMemberships"> (optional, default to false)</param>
    /// <param name="groupMembershipAttribute"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="defaultGroups"> (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    /// <param name="nameIdFormat"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="synchronizeAttributes"> (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    /// <param name="handleLogout"> (optional, default to false)</param>
    /// <param name="logoutUrl"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="clockTolerance"> (optional, default to 0)</param>
    /// <param name="digestMethod"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="signatureMethod"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="userIntermediatePath"> (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="propertylist"> (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    pplx::task<std::shared_ptr<SamlConfigurationInfo>> postSamlConfiguration(
        boost::optional<bool> post,
        boost::optional<bool> apply,
        boost::optional<bool> r_delete,
        boost::optional<utility::string_t> action,
        boost::optional<utility::string_t> Dollarlocation,
        boost::optional<std::vector<utility::string_t>> path,
        boost::optional<int32_t> servicePeriodranking,
        boost::optional<utility::string_t> idpUrl,
        boost::optional<utility::string_t> idpCertAlias,
        boost::optional<bool> idpHttpRedirect,
        boost::optional<utility::string_t> serviceProviderEntityId,
        boost::optional<utility::string_t> assertionConsumerServiceURL,
        boost::optional<utility::string_t> spPrivateKeyAlias,
        boost::optional<utility::string_t> keyStorePassword,
        boost::optional<utility::string_t> defaultRedirectUrl,
        boost::optional<utility::string_t> userIDAttribute,
        boost::optional<bool> useEncryption,
        boost::optional<bool> createUser,
        boost::optional<bool> addGroupMemberships,
        boost::optional<utility::string_t> groupMembershipAttribute,
        boost::optional<std::vector<utility::string_t>> defaultGroups,
        boost::optional<utility::string_t> nameIdFormat,
        boost::optional<std::vector<utility::string_t>> synchronizeAttributes,
        boost::optional<bool> handleLogout,
        boost::optional<utility::string_t> logoutUrl,
        boost::optional<int32_t> clockTolerance,
        boost::optional<utility::string_t> digestMethod,
        boost::optional<utility::string_t> signatureMethod,
        boost::optional<utility::string_t> userIntermediatePath,
        boost::optional<std::vector<utility::string_t>> propertylist
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_ConsoleApi_H_ */

