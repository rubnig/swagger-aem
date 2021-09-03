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
 * SamlConfigurationPropertyItemsString.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SamlConfigurationPropertyItemsString_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SamlConfigurationPropertyItemsString_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  SamlConfigurationPropertyItemsString
    : public ModelBase
{
public:
    SamlConfigurationPropertyItemsString();
    virtual ~SamlConfigurationPropertyItemsString();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SamlConfigurationPropertyItemsString members

    /// <summary>
    /// property name
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// True if optional
    /// </summary>
    bool isOptional() const;
    bool optionalIsSet() const;
    void unsetOptional();

    void setOptional(bool value);

    /// <summary>
    /// True if property is set
    /// </summary>
    bool isIsSet() const;
    bool isSetIsSet() const;
    void unsetIs_set();

    void setIsSet(bool value);

    /// <summary>
    /// Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
    /// </summary>
    int32_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(int32_t value);

    /// <summary>
    /// Property value
    /// </summary>
    utility::string_t getValue() const;
    bool valueIsSet() const;
    void unsetValue();

    void setValue(const utility::string_t& value);

    /// <summary>
    /// Property description
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);


protected:
    utility::string_t m_Name;
    bool m_NameIsSet;
    bool m_Optional;
    bool m_OptionalIsSet;
    bool m_Is_set;
    bool m_Is_setIsSet;
    int32_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_Value;
    bool m_ValueIsSet;
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SamlConfigurationPropertyItemsString_H_ */
