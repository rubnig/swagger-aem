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

#include "CqApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



CqApiImpl::CqApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : CqApi(rtr)
{
}

void CqApiImpl::get_login_page(Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void CqApiImpl::post_cq_actions(const Pistache::Optional<std::string> &authorizableId, const Pistache::Optional<std::string> &changelog, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

