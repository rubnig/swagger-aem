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



#include "TruststoreInfo.h"

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

TruststoreInfo::TruststoreInfo()
{
	m_Exists = false;
}

TruststoreInfo::~TruststoreInfo()
{
}

std::string TruststoreInfo::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void TruststoreInfo::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree TruststoreInfo::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Aliases
	if (!m_Aliases.empty()) {
		for (const auto &childEntry : m_Aliases) {
			ptree Aliases_node;
			Aliases_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Aliases_node));
		}
		pt.add_child("aliases", tmp_node);
		tmp_node.clear();
	}
	pt.put("exists", m_Exists);
	return pt;
}

void TruststoreInfo::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Aliases into member vector
	if (pt.get_child_optional("aliases")) {
		for (const auto &childTree : pt.get_child("aliases")) {
			m_Aliases.emplace_back(childTree.second.data());
		}
	}
	m_Exists = pt.get("exists", false);
}

std::vector<std::shared_ptr<TruststoreItems>> TruststoreInfo::getAliases() const
{
    return m_Aliases;
}
void TruststoreInfo::setAliases(std::vector<std::shared_ptr<TruststoreItems>> value)
{
	m_Aliases = value;
}
bool TruststoreInfo::isExists() const
{
    return m_Exists;
}
void TruststoreInfo::setExists(bool value)
{
	m_Exists = value;
}

}
}
}
}

