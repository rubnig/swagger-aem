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


#include "OAISamlConfigurationPropertyItemsLong.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAISamlConfigurationPropertyItemsLong::OAISamlConfigurationPropertyItemsLong(QString json) {
    this->fromJson(json);
}

OAISamlConfigurationPropertyItemsLong::OAISamlConfigurationPropertyItemsLong() {
    this->init();
}

OAISamlConfigurationPropertyItemsLong::~OAISamlConfigurationPropertyItemsLong() {
    
}

void
OAISamlConfigurationPropertyItemsLong::init() {
    m_name_isSet = false;
    m_optional_isSet = false;
    m_is_set_isSet = false;
    m_type_isSet = false;
    m_value_isSet = false;
    m_description_isSet = false;
}

void
OAISamlConfigurationPropertyItemsLong::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAISamlConfigurationPropertyItemsLong::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    ::OpenAPI::fromJsonValue(optional, json[QString("optional")]);
    
    ::OpenAPI::fromJsonValue(is_set, json[QString("is_set")]);
    
    ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    
    ::OpenAPI::fromJsonValue(value, json[QString("value")]);
    
    ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    
}

QString
OAISamlConfigurationPropertyItemsLong::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISamlConfigurationPropertyItemsLong::asJsonObject() const {
    QJsonObject obj;
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_optional_isSet){
        obj.insert(QString("optional"), ::OpenAPI::toJsonValue(optional));
    }
	if(m_is_set_isSet){
        obj.insert(QString("is_set"), ::OpenAPI::toJsonValue(is_set));
    }
	if(m_type_isSet){
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
	if(m_value_isSet){
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(value));
    }
	if(m_description_isSet){
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    return obj;
}

QString
OAISamlConfigurationPropertyItemsLong::getName() const {
    return name;
}
void
OAISamlConfigurationPropertyItemsLong::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool
OAISamlConfigurationPropertyItemsLong::isOptional() const {
    return optional;
}
void
OAISamlConfigurationPropertyItemsLong::setOptional(const bool &optional) {
    this->optional = optional;
    this->m_optional_isSet = true;
}

bool
OAISamlConfigurationPropertyItemsLong::isIsSet() const {
    return is_set;
}
void
OAISamlConfigurationPropertyItemsLong::setIsSet(const bool &is_set) {
    this->is_set = is_set;
    this->m_is_set_isSet = true;
}

qint32
OAISamlConfigurationPropertyItemsLong::getType() const {
    return type;
}
void
OAISamlConfigurationPropertyItemsLong::setType(const qint32 &type) {
    this->type = type;
    this->m_type_isSet = true;
}

qint32
OAISamlConfigurationPropertyItemsLong::getValue() const {
    return value;
}
void
OAISamlConfigurationPropertyItemsLong::setValue(const qint32 &value) {
    this->value = value;
    this->m_value_isSet = true;
}

QString
OAISamlConfigurationPropertyItemsLong::getDescription() const {
    return description;
}
void
OAISamlConfigurationPropertyItemsLong::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}


bool
OAISamlConfigurationPropertyItemsLong::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_optional_isSet){ isObjectUpdated = true; break;}
    
        if(m_is_set_isSet){ isObjectUpdated = true; break;}
    
        if(m_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_value_isSet){ isObjectUpdated = true; break;}
    
        if(m_description_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
