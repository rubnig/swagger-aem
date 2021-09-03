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

/*
* CqApiImpl.h
*
* 
*/

#ifndef CQ_API_IMPL_H_
#define CQ_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>

#include <CqApi.h>

#include <pistache/optional.h>

#include <string>

namespace org::openapitools::server::api
{



class CqApiImpl : public org::openapitools::server::api::CqApi {
public:
    explicit CqApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~CqApiImpl() override = default;

    void get_login_page(Pistache::Http::ResponseWriter &response);
    void post_cq_actions(const Pistache::Optional<std::string> &authorizableId, const Pistache::Optional<std::string> &changelog, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
