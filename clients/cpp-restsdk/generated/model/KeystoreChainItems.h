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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_KeystoreChainItems_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_KeystoreChainItems_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  KeystoreChainItems
    : public ModelBase
{
public:
    KeystoreChainItems();
    virtual ~KeystoreChainItems();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// KeystoreChainItems members

    /// <summary>
    /// e.g. \&quot;CN&#x3D;localhost\&quot;
    /// </summary>
    utility::string_t getSubject() const;
    bool subjectIsSet() const;
    void unsetSubject();

    void setSubject(const utility::string_t& value);

    /// <summary>
    /// e.g. \&quot;CN&#x3D;Admin\&quot;
    /// </summary>
    utility::string_t getIssuer() const;
    bool issuerIsSet() const;
    void unsetIssuer();

    void setIssuer(const utility::string_t& value);

    /// <summary>
    /// e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
    /// </summary>
    utility::string_t getNotBefore() const;
    bool notBeforeIsSet() const;
    void unsetNotBefore();

    void setNotBefore(const utility::string_t& value);

    /// <summary>
    /// e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
    /// </summary>
    utility::string_t getNotAfter() const;
    bool notAfterIsSet() const;
    void unsetNotAfter();

    void setNotAfter(const utility::string_t& value);

    /// <summary>
    /// 18165099476682912368
    /// </summary>
    int32_t getSerialNumber() const;
    bool serialNumberIsSet() const;
    void unsetSerialNumber();

    void setSerialNumber(int32_t value);


protected:
    utility::string_t m_Subject;
    bool m_SubjectIsSet;
    utility::string_t m_Issuer;
    bool m_IssuerIsSet;
    utility::string_t m_NotBefore;
    bool m_NotBeforeIsSet;
    utility::string_t m_NotAfter;
    bool m_NotAfterIsSet;
    int32_t m_SerialNumber;
    bool m_SerialNumberIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_KeystoreChainItems_H_ */
