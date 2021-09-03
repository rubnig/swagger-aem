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



#include "SamlConfigurationInfo.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




SamlConfigurationInfo::SamlConfigurationInfo()
{
    m_Pid = utility::conversions::to_string_t("");
    m_PidIsSet = false;
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Bundle_location = utility::conversions::to_string_t("");
    m_Bundle_locationIsSet = false;
    m_Service_location = utility::conversions::to_string_t("");
    m_Service_locationIsSet = false;
    m_PropertiesIsSet = false;
}

SamlConfigurationInfo::~SamlConfigurationInfo()
{
}

void SamlConfigurationInfo::validate()
{
    // TODO: implement validation
}

web::json::value SamlConfigurationInfo::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_PidIsSet)
    {
        val[utility::conversions::to_string_t("pid")] = ModelBase::toJson(m_Pid);
    }
    if(m_TitleIsSet)
    {
        val[utility::conversions::to_string_t("title")] = ModelBase::toJson(m_Title);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t("description")] = ModelBase::toJson(m_Description);
    }
    if(m_Bundle_locationIsSet)
    {
        val[utility::conversions::to_string_t("bundle_location")] = ModelBase::toJson(m_Bundle_location);
    }
    if(m_Service_locationIsSet)
    {
        val[utility::conversions::to_string_t("service_location")] = ModelBase::toJson(m_Service_location);
    }
    if(m_PropertiesIsSet)
    {
        val[utility::conversions::to_string_t("properties")] = ModelBase::toJson(m_Properties);
    }

    return val;
}

bool SamlConfigurationInfo::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("pid")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("pid"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_pid;
            ok &= ModelBase::fromJson(fieldValue, refVal_pid);
            setPid(refVal_pid);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("title")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("title"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_title;
            ok &= ModelBase::fromJson(fieldValue, refVal_title);
            setTitle(refVal_title);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("description")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("description"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_description;
            ok &= ModelBase::fromJson(fieldValue, refVal_description);
            setDescription(refVal_description);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("bundle_location")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("bundle_location"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_bundle_location;
            ok &= ModelBase::fromJson(fieldValue, refVal_bundle_location);
            setBundleLocation(refVal_bundle_location);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("service_location")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("service_location"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_service_location;
            ok &= ModelBase::fromJson(fieldValue, refVal_service_location);
            setServiceLocation(refVal_service_location);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("properties")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("properties"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<SamlConfigurationProperties> refVal_properties;
            ok &= ModelBase::fromJson(fieldValue, refVal_properties);
            setProperties(refVal_properties);
        }
    }
    return ok;
}

void SamlConfigurationInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_PidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("pid"), m_Pid));
    }
    if(m_TitleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("title"), m_Title));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("description"), m_Description));
    }
    if(m_Bundle_locationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("bundle_location"), m_Bundle_location));
    }
    if(m_Service_locationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("service_location"), m_Service_location));
    }
    if(m_PropertiesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("properties"), m_Properties));
    }
}

bool SamlConfigurationInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("pid")))
    {
        utility::string_t refVal_pid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("pid")), refVal_pid );
        setPid(refVal_pid);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("title")))
    {
        utility::string_t refVal_title;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("title")), refVal_title );
        setTitle(refVal_title);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("description")))
    {
        utility::string_t refVal_description;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("description")), refVal_description );
        setDescription(refVal_description);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("bundle_location")))
    {
        utility::string_t refVal_bundle_location;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("bundle_location")), refVal_bundle_location );
        setBundleLocation(refVal_bundle_location);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("service_location")))
    {
        utility::string_t refVal_service_location;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("service_location")), refVal_service_location );
        setServiceLocation(refVal_service_location);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("properties")))
    {
        std::shared_ptr<SamlConfigurationProperties> refVal_properties;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("properties")), refVal_properties );
        setProperties(refVal_properties);
    }
    return ok;
}

utility::string_t SamlConfigurationInfo::getPid() const
{
    return m_Pid;
}

void SamlConfigurationInfo::setPid(const utility::string_t& value)
{
    m_Pid = value;
    m_PidIsSet = true;
}

bool SamlConfigurationInfo::pidIsSet() const
{
    return m_PidIsSet;
}

void SamlConfigurationInfo::unsetPid()
{
    m_PidIsSet = false;
}
utility::string_t SamlConfigurationInfo::getTitle() const
{
    return m_Title;
}

void SamlConfigurationInfo::setTitle(const utility::string_t& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}

bool SamlConfigurationInfo::titleIsSet() const
{
    return m_TitleIsSet;
}

void SamlConfigurationInfo::unsetTitle()
{
    m_TitleIsSet = false;
}
utility::string_t SamlConfigurationInfo::getDescription() const
{
    return m_Description;
}

void SamlConfigurationInfo::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool SamlConfigurationInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void SamlConfigurationInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}
utility::string_t SamlConfigurationInfo::getBundleLocation() const
{
    return m_Bundle_location;
}

void SamlConfigurationInfo::setBundleLocation(const utility::string_t& value)
{
    m_Bundle_location = value;
    m_Bundle_locationIsSet = true;
}

bool SamlConfigurationInfo::bundleLocationIsSet() const
{
    return m_Bundle_locationIsSet;
}

void SamlConfigurationInfo::unsetBundle_location()
{
    m_Bundle_locationIsSet = false;
}
utility::string_t SamlConfigurationInfo::getServiceLocation() const
{
    return m_Service_location;
}

void SamlConfigurationInfo::setServiceLocation(const utility::string_t& value)
{
    m_Service_location = value;
    m_Service_locationIsSet = true;
}

bool SamlConfigurationInfo::serviceLocationIsSet() const
{
    return m_Service_locationIsSet;
}

void SamlConfigurationInfo::unsetService_location()
{
    m_Service_locationIsSet = false;
}
std::shared_ptr<SamlConfigurationProperties> SamlConfigurationInfo::getProperties() const
{
    return m_Properties;
}

void SamlConfigurationInfo::setProperties(const std::shared_ptr<SamlConfigurationProperties>& value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}

bool SamlConfigurationInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}

void SamlConfigurationInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}
}
}
}
}


