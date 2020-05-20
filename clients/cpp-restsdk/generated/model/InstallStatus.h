/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * InstallStatus.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_InstallStatus_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_InstallStatus_H_


#include "../ModelBase.h"

#include "InstallStatus_status.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  InstallStatus
    : public ModelBase
{
public:
    InstallStatus();
    virtual ~InstallStatus();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// InstallStatus members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<InstallStatus_status> getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();
    void setStatus(std::shared_ptr<InstallStatus_status> value);

protected:
    std::shared_ptr<InstallStatus_status> m_Status;
    bool m_StatusIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_InstallStatus_H_ */