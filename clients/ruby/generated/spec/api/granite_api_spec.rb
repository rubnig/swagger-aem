=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerAemClient::GraniteApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'GraniteApi' do
  before do
    # run before each test
    @api_instance = SwaggerAemClient::GraniteApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of GraniteApi' do
    it 'should create an instance of GraniteApi' do
      expect(@api_instance).to be_instance_of(SwaggerAemClient::GraniteApi)
    end
  end

  # unit tests for ssl_setup
  # @param keystore_password 
  # @param keystore_password_confirm 
  # @param truststore_password 
  # @param truststore_password_confirm 
  # @param https_hostname 
  # @param https_port 
  # @param [Hash] opts the optional parameters
  # @option opts [File] :privatekey_file 
  # @option opts [File] :certificate_file 
  # @return [String]
  describe 'ssl_setup test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
