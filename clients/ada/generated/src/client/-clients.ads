--  Adobe Experience Manager (AEM) API
--  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
--
--  The version of the OpenAPI document: 3.5.0_pre.0
--  Contact: opensource@shinesolutions.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 5.2.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-mr");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  
   procedure Get_Aem_Product_Info
      (Client : in out Client_Type;
       Result : out Swagger.UString_Vectors.Vector);

   --  
   procedure Get_Bundle_Info
      (Client : in out Client_Type;
       Name : in Swagger.UString;
       Result : out .Models.BundleInfo_Type);

   --  
   procedure Get_Config_Mgr
      (Client : in out Client_Type;
       Result : out Swagger.UString);

   --  
   procedure Post_Bundle
      (Client : in out Client_Type;
       Name : in Swagger.UString;
       Action : in Swagger.UString);

   --  
   procedure Post_Jmx_Repository
      (Client : in out Client_Type;
       Action : in Swagger.UString);

   --  
   procedure Post_Saml_Configuration
      (Client : in out Client_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Path : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Idp_Url : in Swagger.Nullable_UString;
       Idp_Cert_Alias : in Swagger.Nullable_UString;
       Idp_Http_Redirect : in Swagger.Nullable_Boolean;
       Service_Provider_Entity_Id : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_URL : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias : in Swagger.Nullable_UString;
       Key_Store_Password : in Swagger.Nullable_UString;
       Default_Redirect_Url : in Swagger.Nullable_UString;
       User_IDAttribute : in Swagger.Nullable_UString;
       Use_Encryption : in Swagger.Nullable_Boolean;
       Create_User : in Swagger.Nullable_Boolean;
       Add_Group_Memberships : in Swagger.Nullable_Boolean;
       Group_Membership_Attribute : in Swagger.Nullable_UString;
       Default_Groups : in Swagger.UString_Vectors.Vector;
       Name_Id_Format : in Swagger.Nullable_UString;
       Synchronize_Attributes : in Swagger.UString_Vectors.Vector;
       Handle_Logout : in Swagger.Nullable_Boolean;
       Logout_Url : in Swagger.Nullable_UString;
       Clock_Tolerance : in Swagger.Nullable_Integer;
       Digest_Method : in Swagger.Nullable_UString;
       Signature_Method : in Swagger.Nullable_UString;
       User_Intermediate_Path : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Result : out .Models.SamlConfigurationInfo_Type);

   --  
   procedure Get_Login_Page
      (Client : in out Client_Type;
       Result : out Swagger.UString);

   --  
   procedure Post_Cq_Actions
      (Client : in out Client_Type;
       Authorizable_Id : in Swagger.UString;
       Changelog : in Swagger.UString);

   --  
   procedure Get_Crxde_Status
      (Client : in out Client_Type;
       Result : out Swagger.UString);

   --  
   procedure Get_Install_Status
      (Client : in out Client_Type;
       Result : out .Models.InstallStatus_Type);

   --  
   procedure Get_Package_Manager_Servlet
      (Client : in out Client_Type);

   --  
   procedure Post_Package_Service
      (Client : in out Client_Type;
       Cmd : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Post_Package_Service_Json
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Cmd : in Swagger.UString;
       Group_Name : in Swagger.Nullable_UString;
       Package_Name : in Swagger.Nullable_UString;
       Package_Version : in Swagger.Nullable_UString;
       Charset : in Swagger.Nullable_UString;
       Force : in Swagger.Nullable_Boolean;
       Recursive : in Swagger.Nullable_Boolean;
       P_Package : in Swagger.File_Part_Type;
       Result : out Swagger.UString);

   --  
   procedure Post_Package_Update
      (Client : in out Client_Type;
       Group_Name : in Swagger.UString;
       Package_Name : in Swagger.UString;
       Version : in Swagger.UString;
       Path : in Swagger.UString;
       Filter : in Swagger.Nullable_UString;
       Charset : in Swagger.Nullable_UString;
       Result : out Swagger.UString);

   --  
   procedure Post_Set_Password
      (Client : in out Client_Type;
       Old : in Swagger.UString;
       Plain : in Swagger.UString;
       Verify : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Get_Aem_Health_Check
      (Client : in out Client_Type;
       Tags : in Swagger.Nullable_UString;
       Combine_Tags_Or : in Swagger.Nullable_Boolean;
       Result : out Swagger.UString);

   --  
   procedure Post_Config_Aem_Health_Check_Servlet
      (Client : in out Client_Type;
       Bundles_Periodignored : in Swagger.UString_Vectors.Vector;
       Bundles_Periodignored_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Aem_Password_Reset
      (Client : in out Client_Type;
       Pwdreset_Periodauthorizables : in Swagger.UString_Vectors.Vector;
       Pwdreset_Periodauthorizables_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Ssl_Setup
      (Client : in out Client_Type;
       Keystore_Password : in Swagger.UString;
       Keystore_Password_Confirm : in Swagger.UString;
       Truststore_Password : in Swagger.UString;
       Truststore_Password_Confirm : in Swagger.UString;
       Https_Hostname : in Swagger.UString;
       Https_Port : in Swagger.UString;
       Privatekey_File : in Swagger.File_Part_Type;
       Certificate_File : in Swagger.File_Part_Type;
       Result : out Swagger.UString);

   --  
   procedure Delete_Agent
      (Client : in out Client_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString);

   --  
   procedure Delete_Node
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString);

   --  
   procedure Get_Agent
      (Client : in out Client_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString);

   --  
   procedure Get_Agents
      (Client : in out Client_Type;
       Runmode : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Get_Authorizable_Keystore
      (Client : in out Client_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Result : out .Models.KeystoreInfo_Type);

   --  
   procedure Get_Keystore
      (Client : in out Client_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Result : out Swagger.Http_Content_Type);

   --  
   procedure Get_Node
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString);

   --  
   procedure Get_Package
      (Client : in out Client_Type;
       Group : in Swagger.UString;
       Name : in Swagger.UString;
       Version : in Swagger.UString;
       Result : out Swagger.Http_Content_Type);

   --  
   procedure Get_Package_Filter
      (Client : in out Client_Type;
       Group : in Swagger.UString;
       Name : in Swagger.UString;
       Version : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Get_Query
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       P_Periodlimit : in Swagger.Number;
       P_1Property : in Swagger.UString;
       P_1Property_Periodvalue : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Get_Truststore
      (Client : in out Client_Type;
       Result : out Swagger.Http_Content_Type);

   --  
   procedure Get_Truststore_Info
      (Client : in out Client_Type;
       Result : out .Models.TruststoreInfo_Type);

   --  
   procedure Post_Agent
      (Client : in out Client_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString;
       Jcr_Content_Slashcq_Distribute : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashcq_Distribute_At_Type_Hint : in Swagger.Nullable_UString;
       Jcr_Content_Slashcq_Name : in Swagger.Nullable_UString;
       Jcr_Content_Slashcq_Template : in Swagger.Nullable_UString;
       Jcr_Content_Slashenabled : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashjcr_Description : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Last_Modified : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Last_Modified_By : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Mixin_Types : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Title : in Swagger.Nullable_UString;
       Jcr_Content_Slashlog_Level : in Swagger.Nullable_UString;
       Jcr_Content_Slashno_Status_Update : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashno_Versioning : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_Connect_Timeout : in Swagger.Number;
       Jcr_Content_Slashprotocol_HTTPConnection_Closed : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_HTTPExpired : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_HTTPHeaders : in Swagger.UString_Vectors.Vector;
       Jcr_Content_Slashprotocol_HTTPHeaders_At_Type_Hint : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_HTTPMethod : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_HTTPSRelaxed : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_Interface : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_Socket_Timeout : in Swagger.Number;
       Jcr_Content_Slashprotocol_Version : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_NTLMDomain : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_NTLMHost : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Host : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Password : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Port : in Swagger.Number;
       Jcr_Content_Slashproxy_User : in Swagger.Nullable_UString;
       Jcr_Content_Slashqueue_Batch_Max_Size : in Swagger.Number;
       Jcr_Content_Slashqueue_Batch_Mode : in Swagger.Nullable_UString;
       Jcr_Content_Slashqueue_Batch_Wait_Time : in Swagger.Number;
       Jcr_Content_Slashretry_Delay : in Swagger.Nullable_UString;
       Jcr_Content_Slashreverse_Replication : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashserialization_Type : in Swagger.Nullable_UString;
       Jcr_Content_Slashsling_Resource_Type : in Swagger.Nullable_UString;
       Jcr_Content_Slashssl : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_NTLMDomain : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_NTLMHost : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_Password : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_Uri : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_User : in Swagger.Nullable_UString;
       Jcr_Content_Slashtrigger_Distribute : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Modified : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_On_Off_Time : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Receive : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Specific : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashuser_Id : in Swagger.Nullable_UString;
       Jcr_Primary_Type : in Swagger.Nullable_UString;
       Operation : in Swagger.Nullable_UString);

   --  
   procedure Post_Authorizable_Keystore
      (Client : in out Client_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Operation : in Swagger.Nullable_UString;
       Current_Password : in Swagger.Nullable_UString;
       New_Password : in Swagger.Nullable_UString;
       Re_Password : in Swagger.Nullable_UString;
       Key_Password : in Swagger.Nullable_UString;
       Key_Store_Pass : in Swagger.Nullable_UString;
       Alias : in Swagger.Nullable_UString;
       New_Alias : in Swagger.Nullable_UString;
       Remove_Alias : in Swagger.Nullable_UString;
       Cert_Chain : in Swagger.File_Part_Type;
       Pk : in Swagger.File_Part_Type;
       Key_Store : in Swagger.File_Part_Type;
       Result : out .Models.KeystoreInfo_Type);

   --  
   procedure Post_Authorizables
      (Client : in out Client_Type;
       Authorizable_Id : in Swagger.UString;
       Intermediate_Path : in Swagger.UString;
       Create_User : in Swagger.Nullable_UString;
       Create_Group : in Swagger.Nullable_UString;
       Rep_Password : in Swagger.Nullable_UString;
       Profile_Slashgiven_Name : in Swagger.Nullable_UString;
       Result : out Swagger.UString);

   --  
   procedure Post_Config_Adobe_Granite_Saml_Authentication_Handler
      (Client : in out Client_Type;
       Key_Store_Password : in Swagger.Nullable_UString;
       Key_Store_Password_At_Type_Hint : in Swagger.Nullable_UString;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Service_Periodranking_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Http_Redirect : in Swagger.Nullable_Boolean;
       Idp_Http_Redirect_At_Type_Hint : in Swagger.Nullable_UString;
       Create_User : in Swagger.Nullable_Boolean;
       Create_User_At_Type_Hint : in Swagger.Nullable_UString;
       Default_Redirect_Url : in Swagger.Nullable_UString;
       Default_Redirect_Url_At_Type_Hint : in Swagger.Nullable_UString;
       User_IDAttribute : in Swagger.Nullable_UString;
       User_IDAttribute_At_Type_Hint : in Swagger.Nullable_UString;
       Default_Groups : in Swagger.UString_Vectors.Vector;
       Default_Groups_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Cert_Alias : in Swagger.Nullable_UString;
       Idp_Cert_Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Add_Group_Memberships : in Swagger.Nullable_Boolean;
       Add_Group_Memberships_At_Type_Hint : in Swagger.Nullable_UString;
       Path : in Swagger.UString_Vectors.Vector;
       Path_At_Type_Hint : in Swagger.Nullable_UString;
       Synchronize_Attributes : in Swagger.UString_Vectors.Vector;
       Synchronize_Attributes_At_Type_Hint : in Swagger.Nullable_UString;
       Clock_Tolerance : in Swagger.Nullable_Integer;
       Clock_Tolerance_At_Type_Hint : in Swagger.Nullable_UString;
       Group_Membership_Attribute : in Swagger.Nullable_UString;
       Group_Membership_Attribute_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Url : in Swagger.Nullable_UString;
       Idp_Url_At_Type_Hint : in Swagger.Nullable_UString;
       Logout_Url : in Swagger.Nullable_UString;
       Logout_Url_At_Type_Hint : in Swagger.Nullable_UString;
       Service_Provider_Entity_Id : in Swagger.Nullable_UString;
       Service_Provider_Entity_Id_At_Type_Hint : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_URL : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_URLAt_Type_Hint : in Swagger.Nullable_UString;
       Handle_Logout : in Swagger.Nullable_Boolean;
       Handle_Logout_At_Type_Hint : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Use_Encryption : in Swagger.Nullable_Boolean;
       Use_Encryption_At_Type_Hint : in Swagger.Nullable_UString;
       Name_Id_Format : in Swagger.Nullable_UString;
       Name_Id_Format_At_Type_Hint : in Swagger.Nullable_UString;
       Digest_Method : in Swagger.Nullable_UString;
       Digest_Method_At_Type_Hint : in Swagger.Nullable_UString;
       Signature_Method : in Swagger.Nullable_UString;
       Signature_Method_At_Type_Hint : in Swagger.Nullable_UString;
       User_Intermediate_Path : in Swagger.Nullable_UString;
       User_Intermediate_Path_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Apache_Felix_Jetty_Based_Http_Service
      (Client : in out Client_Type;
       Org_Periodapache_Periodfelix_Periodhttps_Periodnio : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodnio_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodclientcertificate : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodclientcertificate_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodenable_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport_Periodsecure : in Swagger.Nullable_UString;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport_Periodsecure_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Apache_Http_Components_Proxy_Configuration
      (Client : in out Client_Type;
       Proxy_Periodhost : in Swagger.Nullable_UString;
       Proxy_Periodhost_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodport : in Swagger.Nullable_Integer;
       Proxy_Periodport_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodexceptions : in Swagger.UString_Vectors.Vector;
       Proxy_Periodexceptions_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodenabled : in Swagger.Nullable_Boolean;
       Proxy_Periodenabled_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Perioduser : in Swagger.Nullable_UString;
       Proxy_Perioduser_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodpassword : in Swagger.Nullable_UString;
       Proxy_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Apache_Sling_Dav_Ex_Servlet
      (Client : in out Client_Type;
       Alias : in Swagger.Nullable_UString;
       Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Dav_Periodcreate_Absolute_Uri : in Swagger.Nullable_Boolean;
       Dav_Periodcreate_Absolute_Uri_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Apache_Sling_Get_Servlet
      (Client : in out Client_Type;
       Json_Periodmaximumresults : in Swagger.Nullable_UString;
       Json_Periodmaximumresults_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodhtml : in Swagger.Nullable_Boolean;
       Enable_Periodhtml_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodtxt : in Swagger.Nullable_Boolean;
       Enable_Periodtxt_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodxml : in Swagger.Nullable_Boolean;
       Enable_Periodxml_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Apache_Sling_Referrer_Filter
      (Client : in out Client_Type;
       Allow_Periodempty : in Swagger.Nullable_Boolean;
       Allow_Periodempty_At_Type_Hint : in Swagger.Nullable_UString;
       Allow_Periodhosts : in Swagger.Nullable_UString;
       Allow_Periodhosts_At_Type_Hint : in Swagger.Nullable_UString;
       Allow_Periodhosts_Periodregexp : in Swagger.Nullable_UString;
       Allow_Periodhosts_Periodregexp_At_Type_Hint : in Swagger.Nullable_UString;
       Filter_Periodmethods : in Swagger.Nullable_UString;
       Filter_Periodmethods_At_Type_Hint : in Swagger.Nullable_UString);

   --  
   procedure Post_Config_Property
      (Client : in out Client_Type;
       Config_Node_Name : in Swagger.UString);

   --  
   procedure Post_Node
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Operation : in Swagger.Nullable_UString;
       Delete_Authorizable : in Swagger.Nullable_UString;
       File : in Swagger.File_Part_Type);

   --  
   procedure Post_Node_Rw
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Add_Members : in Swagger.Nullable_UString);

   --  
   procedure Post_Path
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       Jcr_Primary_Type : in Swagger.UString;
       Name : in Swagger.UString);

   --  
   procedure Post_Query
      (Client : in out Client_Type;
       Path : in Swagger.UString;
       P_Periodlimit : in Swagger.Number;
       P_1Property : in Swagger.UString;
       P_1Property_Periodvalue : in Swagger.UString;
       Result : out Swagger.UString);

   --  
   procedure Post_Tree_Activation
      (Client : in out Client_Type;
       Ignoredeactivated : in Boolean;
       Onlymodified : in Boolean;
       Path : in Swagger.UString);

   --  
   procedure Post_Truststore
      (Client : in out Client_Type;
       Operation : in Swagger.Nullable_UString;
       New_Password : in Swagger.Nullable_UString;
       Re_Password : in Swagger.Nullable_UString;
       Key_Store_Type : in Swagger.Nullable_UString;
       Remove_Alias : in Swagger.Nullable_UString;
       Certificate : in Swagger.File_Part_Type;
       Result : out Swagger.UString);

   --  
   procedure Post_Truststore_PKCS12
      (Client : in out Client_Type;
       Truststore_Periodp_12 : in Swagger.File_Part_Type;
       Result : out Swagger.UString);

end .Clients;
