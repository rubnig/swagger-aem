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
 * SamlConfigurationPropertyItemsLong.h
 *
 * 
 */

#ifndef SamlConfigurationPropertyItemsLong_H_
#define SamlConfigurationPropertyItemsLong_H_



#include <string>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  SamlConfigurationPropertyItemsLong 
{
public:
    SamlConfigurationPropertyItemsLong();
    virtual ~SamlConfigurationPropertyItemsLong();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// SamlConfigurationPropertyItemsLong members

    /// <summary>
    /// property name
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// True if optional
    /// </summary>
    bool isOptional() const;
    void setOptional(bool value);

    /// <summary>
    /// True if property is set
    /// </summary>
    bool isIsSet() const;
    void setIsSet(bool value);

    /// <summary>
    /// Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
    /// </summary>
    int32_t getType() const;
    void setType(int32_t value);

    /// <summary>
    /// Property value
    /// </summary>
    int32_t getValue() const;
    void setValue(int32_t value);

    /// <summary>
    /// Property description
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);
protected:
    std::string m_Name;
    bool m_Optional;
    bool m_Is_set;
    int32_t m_Type;
    int32_t m_Value;
    std::string m_Description;
};

}
}
}
}

#endif /* SamlConfigurationPropertyItemsLong_H_ */
