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



#include "InstallStatus.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




InstallStatus::InstallStatus()
{
    m_StatusIsSet = false;
}

InstallStatus::~InstallStatus()
{
}

void InstallStatus::validate()
{
    // TODO: implement validation
}

web::json::value InstallStatus::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t("status")] = ModelBase::toJson(m_Status);
    }

    return val;
}

bool InstallStatus::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("status")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("status"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<InstallStatus_status> refVal_status;
            ok &= ModelBase::fromJson(fieldValue, refVal_status);
            setStatus(refVal_status);
        }
    }
    return ok;
}

void InstallStatus::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("status"), m_Status));
    }
}

bool InstallStatus::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("status")))
    {
        std::shared_ptr<InstallStatus_status> refVal_status;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("status")), refVal_status );
        setStatus(refVal_status);
    }
    return ok;
}

std::shared_ptr<InstallStatus_status> InstallStatus::getStatus() const
{
    return m_Status;
}

void InstallStatus::setStatus(const std::shared_ptr<InstallStatus_status>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool InstallStatus::statusIsSet() const
{
    return m_StatusIsSet;
}

void InstallStatus::unsetStatus()
{
    m_StatusIsSet = false;
}
}
}
}
}


