=begin
Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end

class InitTables < ActiveRecord::Migration
  def change
    create_table "bundle_data".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name
      t.boolean :fragment
      t.integer :state_raw
      t.string :state
      t.string :version
      t.string :symbolic_name
      t.string :category
      t.string :props

      t.timestamps
    end

    create_table "bundle_data_prop".pluralize.to_sym, id: false do |t|
      t.string :key
      t.string :value

      t.timestamps
    end

    create_table "bundle_info".pluralize.to_sym, id: false do |t|
      t.string :status
      t.string :s
      t.string :data

      t.timestamps
    end

    create_table "install_status".pluralize.to_sym, id: false do |t|
      t.string :status

      t.timestamps
    end

    create_table "install_status_status".pluralize.to_sym, id: false do |t|
      t.boolean :finished
      t.integer :item_count

      t.timestamps
    end

    create_table "keystore_chain_items".pluralize.to_sym, id: false do |t|
      t.string :subject
      t.string :issuer
      t.string :not_before
      t.string :not_after
      t.integer :serial_number

      t.timestamps
    end

    create_table "keystore_info".pluralize.to_sym, id: false do |t|
      t.string :aliases
      t.boolean :exists

      t.timestamps
    end

    create_table "keystore_items".pluralize.to_sym, id: false do |t|
      t.string :_alias
      t.string :entry_type
      t.string :algorithm
      t.string :format
      t.string :chain

      t.timestamps
    end

    create_table "saml_configuration_info".pluralize.to_sym, id: false do |t|
      t.string :pid
      t.string :title
      t.string :description
      t.string :bundle_location
      t.string :service_location
      t.string :properties

      t.timestamps
    end

    create_table "saml_configuration_properties".pluralize.to_sym, id: false do |t|
      t.string :path
      t.string :service_ranking
      t.string :idp_url
      t.string :idp_cert_alias
      t.string :idp_http_redirect
      t.string :service_provider_entity_id
      t.string :assertion_consumer_service_url
      t.string :sp_private_key_alias
      t.string :key_store_password
      t.string :default_redirect_url
      t.string :user_id_attribute
      t.string :use_encryption
      t.string :create_user
      t.string :add_group_memberships
      t.string :group_membership_attribute
      t.string :default_groups
      t.string :name_id_format
      t.string :synchronize_attributes
      t.string :handle_logout
      t.string :logout_url
      t.string :clock_tolerance
      t.string :digest_method
      t.string :signature_method
      t.string :user_intermediate_path

      t.timestamps
    end

    create_table "saml_configuration_property_items_array".pluralize.to_sym, id: false do |t|
      t.string :name
      t.boolean :optional
      t.boolean :is_set
      t.integer :type
      t.string :values
      t.string :description

      t.timestamps
    end

    create_table "saml_configuration_property_items_boolean".pluralize.to_sym, id: false do |t|
      t.string :name
      t.boolean :optional
      t.boolean :is_set
      t.integer :type
      t.boolean :value
      t.string :description

      t.timestamps
    end

    create_table "saml_configuration_property_items_long".pluralize.to_sym, id: false do |t|
      t.string :name
      t.boolean :optional
      t.boolean :is_set
      t.integer :type
      t.integer :value
      t.string :description

      t.timestamps
    end

    create_table "saml_configuration_property_items_string".pluralize.to_sym, id: false do |t|
      t.string :name
      t.boolean :optional
      t.boolean :is_set
      t.integer :type
      t.string :value
      t.string :description

      t.timestamps
    end

    create_table "truststore_info".pluralize.to_sym, id: false do |t|
      t.string :aliases
      t.boolean :exists

      t.timestamps
    end

    create_table "truststore_items".pluralize.to_sym, id: false do |t|
      t.string :_alias
      t.string :entry_type
      t.string :subject
      t.string :issuer
      t.string :not_before
      t.string :not_after
      t.integer :serial_number

      t.timestamps
    end

  end
end
