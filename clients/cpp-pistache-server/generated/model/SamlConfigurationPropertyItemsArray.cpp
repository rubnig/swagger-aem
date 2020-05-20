/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* OpenAPI spec version: 3.2.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "SamlConfigurationPropertyItemsArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

SamlConfigurationPropertyItemsArray::SamlConfigurationPropertyItemsArray()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Optional = false;
    m_OptionalIsSet = false;
    m_Is_set = false;
    m_Is_setIsSet = false;
    m_Type = 0;
    m_TypeIsSet = false;
    m_ValuesIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    
}

SamlConfigurationPropertyItemsArray::~SamlConfigurationPropertyItemsArray()
{
}

void SamlConfigurationPropertyItemsArray::validate()
{
    // TODO: implement validation
}

nlohmann::json SamlConfigurationPropertyItemsArray::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_NameIsSet)
    {
        val["name"] = ModelBase::toJson(m_Name);
    }
    if(m_OptionalIsSet)
    {
        val["optional"] = m_Optional;
    }
    if(m_Is_setIsSet)
    {
        val["is_set"] = m_Is_set;
    }
    if(m_TypeIsSet)
    {
        val["type"] = m_Type;
    }
    {
        nlohmann::json jsonArray;
        for( auto& item : m_Values )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["values"] = jsonArray;
        }
    }
    if(m_DescriptionIsSet)
    {
        val["description"] = ModelBase::toJson(m_Description);
    }
    

    return val;
}

void SamlConfigurationPropertyItemsArray::fromJson(nlohmann::json& val)
{
    if(val.find("name") != val.end())
    {
        setName(val.at("name"));
    }
    if(val.find("optional") != val.end())
    {
        setOptional(val.at("optional"));
    }
    if(val.find("is_set") != val.end())
    {
        setIsSet(val.at("is_set"));
    }
    if(val.find("type") != val.end())
    {
        setType(val.at("type"));
    }
    {
        m_Values.clear();
        nlohmann::json jsonArray;
        if(val.find("values") != val.end())
        {
        for( auto& item : val["values"] )
        {
            m_Values.push_back(item);
            
        }
        }
    }
    if(val.find("description") != val.end())
    {
        setDescription(val.at("description"));
    }
    
}


std::string SamlConfigurationPropertyItemsArray::getName() const
{
    return m_Name;
}
void SamlConfigurationPropertyItemsArray::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool SamlConfigurationPropertyItemsArray::nameIsSet() const
{
    return m_NameIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetName()
{
    m_NameIsSet = false;
}
bool SamlConfigurationPropertyItemsArray::isOptional() const
{
    return m_Optional;
}
void SamlConfigurationPropertyItemsArray::setOptional(bool const value)
{
    m_Optional = value;
    m_OptionalIsSet = true;
}
bool SamlConfigurationPropertyItemsArray::optionalIsSet() const
{
    return m_OptionalIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetOptional()
{
    m_OptionalIsSet = false;
}
bool SamlConfigurationPropertyItemsArray::isIsSet() const
{
    return m_Is_set;
}
void SamlConfigurationPropertyItemsArray::setIsSet(bool const value)
{
    m_Is_set = value;
    m_Is_setIsSet = true;
}
bool SamlConfigurationPropertyItemsArray::isSetIsSet() const
{
    return m_Is_setIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetIs_set()
{
    m_Is_setIsSet = false;
}
int32_t SamlConfigurationPropertyItemsArray::getType() const
{
    return m_Type;
}
void SamlConfigurationPropertyItemsArray::setType(int32_t const value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool SamlConfigurationPropertyItemsArray::typeIsSet() const
{
    return m_TypeIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetType()
{
    m_TypeIsSet = false;
}
std::vector<std::string>& SamlConfigurationPropertyItemsArray::getValues()
{
    return m_Values;
}
bool SamlConfigurationPropertyItemsArray::valuesIsSet() const
{
    return m_ValuesIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetValues()
{
    m_ValuesIsSet = false;
}
std::string SamlConfigurationPropertyItemsArray::getDescription() const
{
    return m_Description;
}
void SamlConfigurationPropertyItemsArray::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool SamlConfigurationPropertyItemsArray::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void SamlConfigurationPropertyItemsArray::unsetDescription()
{
    m_DescriptionIsSet = false;
}

}
}
}
}
