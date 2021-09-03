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


#include "BundleInfo.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

BundleInfo::BundleInfo()
{
    m_Status = "";
    m_StatusIsSet = false;
    m_sIsSet = false;
    m_DataIsSet = false;
    
}

void BundleInfo::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool BundleInfo::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool BundleInfo::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "BundleInfo" : pathPrefix;

             
    if (SIsSet())
    {
        const std::vector<int32_t>& value = m_s;
        const std::string currentValuePath = _pathPrefix + ".S";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const int32_t& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (dataIsSet())
    {
        const std::vector<BundleData>& value = m_Data;
        const std::string currentValuePath = _pathPrefix + ".data";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const BundleData& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".data") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool BundleInfo::operator==(const BundleInfo& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!SIsSet() && !rhs.SIsSet()) || (SIsSet() && rhs.SIsSet() && getS() == rhs.getS())) &&
    
    
    ((!dataIsSet() && !rhs.dataIsSet()) || (dataIsSet() && rhs.dataIsSet() && getData() == rhs.getData()))
    
    ;
}

bool BundleInfo::operator!=(const BundleInfo& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const BundleInfo& o)
{
    j = nlohmann::json();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.SIsSet() || !o.m_s.empty())
        j["s"] = o.m_s;
    if(o.dataIsSet() || !o.m_Data.empty())
        j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, BundleInfo& o)
{
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("s") != j.end())
    {
        j.at("s").get_to(o.m_s);
        o.m_sIsSet = true;
    } 
    if(j.find("data") != j.end())
    {
        j.at("data").get_to(o.m_Data);
        o.m_DataIsSet = true;
    } 
    
}

std::string BundleInfo::getStatus() const
{
    return m_Status;
}
void BundleInfo::setStatus(std::string const& value)
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
std::vector<int32_t> BundleInfo::getS() const
{
    return m_s;
}
void BundleInfo::setS(std::vector<int32_t> const value)
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
std::vector<BundleData> BundleInfo::getData() const
{
    return m_Data;
}
void BundleInfo::setData(std::vector<BundleData> const& value)
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


} // namespace org::openapitools::server::model

