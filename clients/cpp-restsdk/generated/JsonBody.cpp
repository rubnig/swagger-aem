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

#include "JsonBody.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

JsonBody::JsonBody( const web::json::value& json)
    : m_Json(json)
{
}

JsonBody::~JsonBody()
{
}

void JsonBody::writeTo( std::ostream& target )
{
    m_Json.serialize(target);
}

}
}
}
}
