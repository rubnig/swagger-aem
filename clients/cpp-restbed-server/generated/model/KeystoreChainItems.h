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
 * KeystoreChainItems.h
 *
 * 
 */

#ifndef KeystoreChainItems_H_
#define KeystoreChainItems_H_



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
class  KeystoreChainItems 
{
public:
    KeystoreChainItems();
    virtual ~KeystoreChainItems();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// KeystoreChainItems members

    /// <summary>
    /// e.g. \&quot;CN&#x3D;localhost\&quot;
    /// </summary>
    std::string getSubject() const;
    void setSubject(std::string value);

    /// <summary>
    /// e.g. \&quot;CN&#x3D;Admin\&quot;
    /// </summary>
    std::string getIssuer() const;
    void setIssuer(std::string value);

    /// <summary>
    /// e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
    /// </summary>
    std::string getNotBefore() const;
    void setNotBefore(std::string value);

    /// <summary>
    /// e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
    /// </summary>
    std::string getNotAfter() const;
    void setNotAfter(std::string value);

    /// <summary>
    /// 18165099476682912368
    /// </summary>
    int32_t getSerialNumber() const;
    void setSerialNumber(int32_t value);
protected:
    std::string m_Subject;
    std::string m_Issuer;
    std::string m_NotBefore;
    std::string m_NotAfter;
    int32_t m_SerialNumber;
};

}
}
}
}

#endif /* KeystoreChainItems_H_ */
