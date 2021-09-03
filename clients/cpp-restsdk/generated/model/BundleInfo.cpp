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



#include "BundleInfo.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




BundleInfo::BundleInfo()
{
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
    m_sIsSet = false;
    m_DataIsSet = false;
}

BundleInfo::~BundleInfo()
{
}

void BundleInfo::validate()
{
    // TODO: implement validation
}

web::json::value BundleInfo::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t("status")] = ModelBase::toJson(m_Status);
    }
    if(m_sIsSet)
    {
        val[utility::conversions::to_string_t("s")] = ModelBase::toJson(m_s);
    }
    if(m_DataIsSet)
    {
        val[utility::conversions::to_string_t("data")] = ModelBase::toJson(m_Data);
    }

    return val;
}

bool BundleInfo::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("status")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("status"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_status;
            ok &= ModelBase::fromJson(fieldValue, refVal_status);
            setStatus(refVal_status);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("s")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("s"));
        if(!fieldValue.is_null())
        {
            std::vector<int32_t> refVal_s;
            ok &= ModelBase::fromJson(fieldValue, refVal_s);
            setS(refVal_s);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("data")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("data"));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<BundleData>> refVal_data;
            ok &= ModelBase::fromJson(fieldValue, refVal_data);
            setData(refVal_data);
        }
    }
    return ok;
}

void BundleInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_sIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("s"), m_s));
    }
    if(m_DataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("data"), m_Data));
    }
}

bool BundleInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("status")))
    {
        utility::string_t refVal_status;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("status")), refVal_status );
        setStatus(refVal_status);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("s")))
    {
        std::vector<int32_t> refVal_s;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("s")), refVal_s );
        setS(refVal_s);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("data")))
    {
        std::vector<std::shared_ptr<BundleData>> refVal_data;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("data")), refVal_data );
        setData(refVal_data);
    }
    return ok;
}

utility::string_t BundleInfo::getStatus() const
{
    return m_Status;
}

void BundleInfo::setStatus(const utility::string_t& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool BundleInfo::statusIsSet() const
{
    return m_StatusIsSet;
}

void BundleInfo::unsetStatus()
{
    m_StatusIsSet = false;
}
std::vector<int32_t>& BundleInfo::getS()
{
    return m_s;
}

void BundleInfo::setS(std::vector<int32_t> value)
{
    m_s = value;
    m_sIsSet = true;
}

bool BundleInfo::SIsSet() const
{
    return m_sIsSet;
}

void BundleInfo::unsets()
{
    m_sIsSet = false;
}
std::vector<std::shared_ptr<BundleData>>& BundleInfo::getData()
{
    return m_Data;
}

void BundleInfo::setData(const std::vector<std::shared_ptr<BundleData>>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool BundleInfo::dataIsSet() const
{
    return m_DataIsSet;
}

void BundleInfo::unsetData()
{
    m_DataIsSet = false;
}
}
}
}
}


