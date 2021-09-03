<?php

/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class SlingApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation postConfigAdobeGraniteSamlAuthenticationHandler
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandler()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $key_store_password = $input['key_store_password'];

        $key_store_password_type_hint = $input['key_store_password_type_hint'];

        $service_ranking = $input['service_ranking'];

        $service_ranking_type_hint = $input['service_ranking_type_hint'];

        $idp_http_redirect = $input['idp_http_redirect'];

        $idp_http_redirect_type_hint = $input['idp_http_redirect_type_hint'];

        $create_user = $input['create_user'];

        $create_user_type_hint = $input['create_user_type_hint'];

        $default_redirect_url = $input['default_redirect_url'];

        $default_redirect_url_type_hint = $input['default_redirect_url_type_hint'];

        $user_id_attribute = $input['user_id_attribute'];

        $user_id_attribute_type_hint = $input['user_id_attribute_type_hint'];

        $default_groups = $input['default_groups'];

        $default_groups_type_hint = $input['default_groups_type_hint'];

        $idp_cert_alias = $input['idp_cert_alias'];

        $idp_cert_alias_type_hint = $input['idp_cert_alias_type_hint'];

        $add_group_memberships = $input['add_group_memberships'];

        $add_group_memberships_type_hint = $input['add_group_memberships_type_hint'];

        $path = $input['path'];

        $path_type_hint = $input['path_type_hint'];

        $synchronize_attributes = $input['synchronize_attributes'];

        $synchronize_attributes_type_hint = $input['synchronize_attributes_type_hint'];

        $clock_tolerance = $input['clock_tolerance'];

        $clock_tolerance_type_hint = $input['clock_tolerance_type_hint'];

        $group_membership_attribute = $input['group_membership_attribute'];

        $group_membership_attribute_type_hint = $input['group_membership_attribute_type_hint'];

        $idp_url = $input['idp_url'];

        $idp_url_type_hint = $input['idp_url_type_hint'];

        $logout_url = $input['logout_url'];

        $logout_url_type_hint = $input['logout_url_type_hint'];

        $service_provider_entity_id = $input['service_provider_entity_id'];

        $service_provider_entity_id_type_hint = $input['service_provider_entity_id_type_hint'];

        $assertion_consumer_service_url = $input['assertion_consumer_service_url'];

        $assertion_consumer_service_url_type_hint = $input['assertion_consumer_service_url_type_hint'];

        $handle_logout = $input['handle_logout'];

        $handle_logout_type_hint = $input['handle_logout_type_hint'];

        $sp_private_key_alias = $input['sp_private_key_alias'];

        $sp_private_key_alias_type_hint = $input['sp_private_key_alias_type_hint'];

        $use_encryption = $input['use_encryption'];

        $use_encryption_type_hint = $input['use_encryption_type_hint'];

        $name_id_format = $input['name_id_format'];

        $name_id_format_type_hint = $input['name_id_format_type_hint'];

        $digest_method = $input['digest_method'];

        $digest_method_type_hint = $input['digest_method_type_hint'];

        $signature_method = $input['signature_method'];

        $signature_method_type_hint = $input['signature_method_type_hint'];

        $user_intermediate_path = $input['user_intermediate_path'];

        $user_intermediate_path_type_hint = $input['user_intermediate_path_type_hint'];


        return response('How about implementing postConfigAdobeGraniteSamlAuthenticationHandler as a post method ?');
    }
    /**
     * Operation postConfigApacheFelixJettyBasedHttpService
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigApacheFelixJettyBasedHttpService()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $org_apache_felix_https_nio = $input['org_apache_felix_https_nio'];

        $org_apache_felix_https_nio_type_hint = $input['org_apache_felix_https_nio_type_hint'];

        $org_apache_felix_https_keystore = $input['org_apache_felix_https_keystore'];

        $org_apache_felix_https_keystore_type_hint = $input['org_apache_felix_https_keystore_type_hint'];

        $org_apache_felix_https_keystore_password = $input['org_apache_felix_https_keystore_password'];

        $org_apache_felix_https_keystore_password_type_hint = $input['org_apache_felix_https_keystore_password_type_hint'];

        $org_apache_felix_https_keystore_key = $input['org_apache_felix_https_keystore_key'];

        $org_apache_felix_https_keystore_key_type_hint = $input['org_apache_felix_https_keystore_key_type_hint'];

        $org_apache_felix_https_keystore_key_password = $input['org_apache_felix_https_keystore_key_password'];

        $org_apache_felix_https_keystore_key_password_type_hint = $input['org_apache_felix_https_keystore_key_password_type_hint'];

        $org_apache_felix_https_truststore = $input['org_apache_felix_https_truststore'];

        $org_apache_felix_https_truststore_type_hint = $input['org_apache_felix_https_truststore_type_hint'];

        $org_apache_felix_https_truststore_password = $input['org_apache_felix_https_truststore_password'];

        $org_apache_felix_https_truststore_password_type_hint = $input['org_apache_felix_https_truststore_password_type_hint'];

        $org_apache_felix_https_clientcertificate = $input['org_apache_felix_https_clientcertificate'];

        $org_apache_felix_https_clientcertificate_type_hint = $input['org_apache_felix_https_clientcertificate_type_hint'];

        $org_apache_felix_https_enable = $input['org_apache_felix_https_enable'];

        $org_apache_felix_https_enable_type_hint = $input['org_apache_felix_https_enable_type_hint'];

        $org_osgi_service_http_port_secure = $input['org_osgi_service_http_port_secure'];

        $org_osgi_service_http_port_secure_type_hint = $input['org_osgi_service_http_port_secure_type_hint'];


        return response('How about implementing postConfigApacheFelixJettyBasedHttpService as a post method ?');
    }
    /**
     * Operation postConfigApacheHttpComponentsProxyConfiguration
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigApacheHttpComponentsProxyConfiguration()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $proxy_host = $input['proxy_host'];

        $proxy_host_type_hint = $input['proxy_host_type_hint'];

        $proxy_port = $input['proxy_port'];

        $proxy_port_type_hint = $input['proxy_port_type_hint'];

        $proxy_exceptions = $input['proxy_exceptions'];

        $proxy_exceptions_type_hint = $input['proxy_exceptions_type_hint'];

        $proxy_enabled = $input['proxy_enabled'];

        $proxy_enabled_type_hint = $input['proxy_enabled_type_hint'];

        $proxy_user = $input['proxy_user'];

        $proxy_user_type_hint = $input['proxy_user_type_hint'];

        $proxy_password = $input['proxy_password'];

        $proxy_password_type_hint = $input['proxy_password_type_hint'];


        return response('How about implementing postConfigApacheHttpComponentsProxyConfiguration as a post method ?');
    }
    /**
     * Operation postConfigApacheSlingDavExServlet
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigApacheSlingDavExServlet()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $alias = $input['alias'];

        $alias_type_hint = $input['alias_type_hint'];

        $dav_create_absolute_uri = $input['dav_create_absolute_uri'];

        $dav_create_absolute_uri_type_hint = $input['dav_create_absolute_uri_type_hint'];


        return response('How about implementing postConfigApacheSlingDavExServlet as a post method ?');
    }
    /**
     * Operation postConfigApacheSlingReferrerFilter
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigApacheSlingReferrerFilter()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $allow_empty = $input['allow_empty'];

        $allow_empty_type_hint = $input['allow_empty_type_hint'];

        $allow_hosts = $input['allow_hosts'];

        $allow_hosts_type_hint = $input['allow_hosts_type_hint'];

        $allow_hosts_regexp = $input['allow_hosts_regexp'];

        $allow_hosts_regexp_type_hint = $input['allow_hosts_regexp_type_hint'];

        $filter_methods = $input['filter_methods'];

        $filter_methods_type_hint = $input['filter_methods_type_hint'];


        return response('How about implementing postConfigApacheSlingReferrerFilter as a post method ?');
    }
    /**
     * Operation postConfigApacheSlingGetServlet
     *
     * .
     *
     *
     * @return Http response
     */
    public function postConfigApacheSlingGetServlet()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $json_maximumresults = $input['json_maximumresults'];

        $json_maximumresults_type_hint = $input['json_maximumresults_type_hint'];

        $enable_html = $input['enable_html'];

        $enable_html_type_hint = $input['enable_html_type_hint'];

        $enable_txt = $input['enable_txt'];

        $enable_txt_type_hint = $input['enable_txt_type_hint'];

        $enable_xml = $input['enable_xml'];

        $enable_xml_type_hint = $input['enable_xml_type_hint'];


        return response('How about implementing postConfigApacheSlingGetServlet as a post method ?');
    }
    /**
     * Operation postConfigProperty
     *
     * .
     *
     * @param string $config_node_name  (required)
     *
     * @return Http response
     */
    public function postConfigProperty($config_node_name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postConfigProperty as a post method ?');
    }
    /**
     * Operation getQuery
     *
     * .
     *
     *
     * @return Http response
     */
    public function getQuery()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['path'])) {
            throw new \InvalidArgumentException('Missing the required parameter $path when calling getQuery');
        }
        $path = $input['path'];

        if (!isset($input['p_limit'])) {
            throw new \InvalidArgumentException('Missing the required parameter $p_limit when calling getQuery');
        }
        $p_limit = $input['p_limit'];

        if (!isset($input['_1_property'])) {
            throw new \InvalidArgumentException('Missing the required parameter $_1_property when calling getQuery');
        }
        $_1_property = $input['_1_property'];

        if (!isset($input['_1_property_value'])) {
            throw new \InvalidArgumentException('Missing the required parameter $_1_property_value when calling getQuery');
        }
        $_1_property_value = $input['_1_property_value'];


        return response('How about implementing getQuery as a get method ?');
    }
    /**
     * Operation postQuery
     *
     * .
     *
     *
     * @return Http response
     */
    public function postQuery()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['path'])) {
            throw new \InvalidArgumentException('Missing the required parameter $path when calling postQuery');
        }
        $path = $input['path'];

        if (!isset($input['p_limit'])) {
            throw new \InvalidArgumentException('Missing the required parameter $p_limit when calling postQuery');
        }
        $p_limit = $input['p_limit'];

        if (!isset($input['_1_property'])) {
            throw new \InvalidArgumentException('Missing the required parameter $_1_property when calling postQuery');
        }
        $_1_property = $input['_1_property'];

        if (!isset($input['_1_property_value'])) {
            throw new \InvalidArgumentException('Missing the required parameter $_1_property_value when calling postQuery');
        }
        $_1_property_value = $input['_1_property_value'];


        return response('How about implementing postQuery as a post method ?');
    }
    /**
     * Operation getPackage
     *
     * .
     *
     * @param string $group  (required)
     * @param string $name  (required)
     * @param string $version  (required)
     *
     * @return Http response
     */
    public function getPackage($group, $name, $version)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getPackage as a get method ?');
    }
    /**
     * Operation getPackageFilter
     *
     * .
     *
     * @param string $group  (required)
     * @param string $name  (required)
     * @param string $version  (required)
     *
     * @return Http response
     */
    public function getPackageFilter($group, $name, $version)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getPackageFilter as a get method ?');
    }
    /**
     * Operation getAgents
     *
     * .
     *
     * @param string $runmode  (required)
     *
     * @return Http response
     */
    public function getAgents($runmode)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAgents as a get method ?');
    }
    /**
     * Operation deleteAgent
     *
     * .
     *
     * @param string $runmode  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function deleteAgent($runmode, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deleteAgent as a delete method ?');
    }
    /**
     * Operation getAgent
     *
     * .
     *
     * @param string $runmode  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function getAgent($runmode, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAgent as a get method ?');
    }
    /**
     * Operation postAgent
     *
     * .
     *
     * @param string $runmode  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function postAgent($runmode, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postAgent as a post method ?');
    }
    /**
     * Operation postTreeActivation
     *
     * .
     *
     *
     * @return Http response
     */
    public function postTreeActivation()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['ignoredeactivated'])) {
            throw new \InvalidArgumentException('Missing the required parameter $ignoredeactivated when calling postTreeActivation');
        }
        $ignoredeactivated = $input['ignoredeactivated'];

        if (!isset($input['onlymodified'])) {
            throw new \InvalidArgumentException('Missing the required parameter $onlymodified when calling postTreeActivation');
        }
        $onlymodified = $input['onlymodified'];

        if (!isset($input['path'])) {
            throw new \InvalidArgumentException('Missing the required parameter $path when calling postTreeActivation');
        }
        $path = $input['path'];


        return response('How about implementing postTreeActivation as a post method ?');
    }
    /**
     * Operation postTruststorePKCS12
     *
     * .
     *
     *
     * @return Http response
     */
    public function postTruststorePKCS12()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $truststore_p12 = $input['truststore_p12'];


        return response('How about implementing postTruststorePKCS12 as a post method ?');
    }
    /**
     * Operation getTruststore
     *
     * .
     *
     *
     * @return Http response
     */
    public function getTruststore()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getTruststore as a get method ?');
    }
    /**
     * Operation postAuthorizables
     *
     * .
     *
     *
     * @return Http response
     */
    public function postAuthorizables()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['authorizable_id'])) {
            throw new \InvalidArgumentException('Missing the required parameter $authorizable_id when calling postAuthorizables');
        }
        $authorizable_id = $input['authorizable_id'];

        if (!isset($input['intermediate_path'])) {
            throw new \InvalidArgumentException('Missing the required parameter $intermediate_path when calling postAuthorizables');
        }
        $intermediate_path = $input['intermediate_path'];

        $create_user = $input['create_user'];

        $create_group = $input['create_group'];

        $reppassword = $input['reppassword'];

        $profile_given_name = $input['profile_given_name'];


        return response('How about implementing postAuthorizables as a post method ?');
    }
    /**
     * Operation postTruststore
     *
     * .
     *
     *
     * @return Http response
     */
    public function postTruststore()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $operation = $input['operation'];

        $new_password = $input['new_password'];

        $re_password = $input['re_password'];

        $key_store_type = $input['key_store_type'];

        $remove_alias = $input['remove_alias'];

        $certificate = $input['certificate'];


        return response('How about implementing postTruststore as a post method ?');
    }
    /**
     * Operation getTruststoreInfo
     *
     * .
     *
     *
     * @return Http response
     */
    public function getTruststoreInfo()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getTruststoreInfo as a get method ?');
    }
    /**
     * Operation postAuthorizableKeystore
     *
     * .
     *
     * @param string $intermediate_path  (required)
     * @param string $authorizable_id  (required)
     *
     * @return Http response
     */
    public function postAuthorizableKeystore($intermediate_path, $authorizable_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postAuthorizableKeystore as a post method ?');
    }
    /**
     * Operation getAuthorizableKeystore
     *
     * .
     *
     * @param string $intermediate_path  (required)
     * @param string $authorizable_id  (required)
     *
     * @return Http response
     */
    public function getAuthorizableKeystore($intermediate_path, $authorizable_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAuthorizableKeystore as a get method ?');
    }
    /**
     * Operation getKeystore
     *
     * .
     *
     * @param string $intermediate_path  (required)
     * @param string $authorizable_id  (required)
     *
     * @return Http response
     */
    public function getKeystore($intermediate_path, $authorizable_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getKeystore as a get method ?');
    }
    /**
     * Operation postPath
     *
     * .
     *
     * @param string $path  (required)
     *
     * @return Http response
     */
    public function postPath($path)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postPath as a post method ?');
    }
    /**
     * Operation deleteNode
     *
     * .
     *
     * @param string $path  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function deleteNode($path, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deleteNode as a delete method ?');
    }
    /**
     * Operation getNode
     *
     * .
     *
     * @param string $path  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function getNode($path, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getNode as a get method ?');
    }
    /**
     * Operation postNode
     *
     * .
     *
     * @param string $path  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function postNode($path, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postNode as a post method ?');
    }
    /**
     * Operation postNodeRw
     *
     * .
     *
     * @param string $path  (required)
     * @param string $name  (required)
     *
     * @return Http response
     */
    public function postNodeRw($path, $name)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing postNodeRw as a post method ?');
    }
}
