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
 * InstallStatus.h
 *
 * 
 */

#ifndef InstallStatus_H_
#define InstallStatus_H_



#include "InstallStatus_status.h"
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  InstallStatus 
{
public:
    InstallStatus();
    virtual ~InstallStatus();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// InstallStatus members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<InstallStatus_status> getStatus() const;
    void setStatus(std::shared_ptr<InstallStatus_status> value);
protected:
    std::shared_ptr<InstallStatus_status> m_Status;
};

}
}
}
}

#endif /* InstallStatus_H_ */
