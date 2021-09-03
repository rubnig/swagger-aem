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


#include "SamlConfigurationPropertyItemsArray.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

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

void SamlConfigurationPropertyItemsArray::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool SamlConfigurationPropertyItemsArray::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool SamlConfigurationPropertyItemsArray::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "SamlConfigurationPropertyItemsArray" : pathPrefix;

                         
    if (valuesIsSet())
    {
        const std::vector<std::string>& value = m_Values;
        const std::string currentValuePath = _pathPrefix + ".values";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
        
    return success;
}

bool SamlConfigurationPropertyItemsArray::operator==(const SamlConfigurationPropertyItemsArray& rhs) const
{
    return
    
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!optionalIsSet() && !rhs.optionalIsSet()) || (optionalIsSet() && rhs.optionalIsSet() && isOptional() == rhs.isOptional())) &&
    
    
    ((!isSetIsSet() && !rhs.isSetIsSet()) || (isSetIsSet() && rhs.isSetIsSet() && isIsSet() == rhs.isIsSet())) &&
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType())) &&
    
    
    ((!valuesIsSet() && !rhs.valuesIsSet()) || (valuesIsSet() && rhs.valuesIsSet() && getValues() == rhs.getValues())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription()))
    
    ;
}

bool SamlConfigurationPropertyItemsArray::operator!=(const SamlConfigurationPropertyItemsArray& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const SamlConfigurationPropertyItemsArray& o)
{
    j = nlohmann::json();
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.optionalIsSet())
        j["optional"] = o.m_Optional;
    if(o.isSetIsSet())
        j["is_set"] = o.m_Is_set;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    if(o.valuesIsSet() || !o.m_Values.empty())
        j["values"] = o.m_Values;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    
}

void from_json(const nlohmann::json& j, SamlConfigurationPropertyItemsArray& o)
{
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("optional") != j.end())
    {
        j.at("optional").get_to(o.m_Optional);
        o.m_OptionalIsSet = true;
    } 
    if(j.find("is_set") != j.end())
    {
        j.at("is_set").get_to(o.m_Is_set);
        o.m_Is_setIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    if(j.find("values") != j.end())
    {
        j.at("values").get_to(o.m_Values);
        o.m_ValuesIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
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
std::vector<std::string> SamlConfigurationPropertyItemsArray::getValues() const
{
    return m_Values;
}
void SamlConfigurationPropertyItemsArray::setValues(std::vector<std::string> const& value)
{
    m_Values = value;
    m_ValuesIsSet = true;
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


} // namespace org::openapitools::server::model

