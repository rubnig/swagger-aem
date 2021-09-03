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



#include "BundleDataProp.h"

#include <string>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

BundleDataProp::BundleDataProp()
{
	m_Key = "";
	m_Value = "";
}

BundleDataProp::~BundleDataProp()
{
}

std::string BundleDataProp::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void BundleDataProp::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree BundleDataProp::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("key", m_Key);
	pt.put("value", m_Value);
	return pt;
}

void BundleDataProp::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Key = pt.get("key", "");
	m_Value = pt.get("value", "");
}

std::string BundleDataProp::getKey() const
{
    return m_Key;
}
void BundleDataProp::setKey(std::string value)
{
	m_Key = value;
}
std::string BundleDataProp::getValue() const
{
    return m_Value;
}
void BundleDataProp::setValue(std::string value)
{
	m_Value = value;
}

}
}
}
}

