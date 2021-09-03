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
 * TruststoreItems.h
 *
 * 
 */

#ifndef TruststoreItems_H_
#define TruststoreItems_H_



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
class  TruststoreItems 
{
public:
    TruststoreItems();
    virtual ~TruststoreItems();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// TruststoreItems members

    /// <summary>
    /// Truststore alias name
    /// </summary>
    std::string getAlias() const;
    void setAlias(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getEntryType() const;
    void setEntryType(std::string value);

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
    std::string m_Alias;
    std::string m_EntryType;
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

#endif /* TruststoreItems_H_ */
