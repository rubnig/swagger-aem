--  Adobe Experience Manager (AEM) API
--  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
--
--  The version of the OpenAPI document: 3.5.0_pre.0
--  Contact: opensource@shinesolutions.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 5.2.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.


package body .Models is
   pragma Style_Checks ("-mr");

   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;



   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InstallStatusStatus_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("finished", Value.Finished);
      Into.Write_Entity ("itemCount", Value.Item_Count);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InstallStatusStatus_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InstallStatusStatus_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "finished", Value.Finished);
      Swagger.Streams.Deserialize (Object, "itemCount", Value.Item_Count);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InstallStatusStatus_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InstallStatusStatus_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InstallStatus_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "status", Value.Status);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InstallStatus_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InstallStatus_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "status", Value.Status);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InstallStatus_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InstallStatus_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsString_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("optional", Value.Optional);
      Into.Write_Entity ("is_set", Value.Is_Set);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("value", Value.Value);
      Into.Write_Entity ("description", Value.Description);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsString_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsString_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "optional", Value.Optional);
      Swagger.Streams.Deserialize (Object, "is_set", Value.Is_Set);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsString_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationPropertyItemsString_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsBoolean_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("optional", Value.Optional);
      Into.Write_Entity ("is_set", Value.Is_Set);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("value", Value.Value);
      Into.Write_Entity ("description", Value.Description);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsBoolean_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsBoolean_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "optional", Value.Optional);
      Swagger.Streams.Deserialize (Object, "is_set", Value.Is_Set);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsBoolean_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationPropertyItemsBoolean_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TruststoreItems_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("alias", Value.Alias);
      Into.Write_Entity ("entryType", Value.Entry_Type);
      Into.Write_Entity ("subject", Value.Subject);
      Into.Write_Entity ("issuer", Value.Issuer);
      Into.Write_Entity ("notBefore", Value.Not_Before);
      Into.Write_Entity ("notAfter", Value.Not_After);
      Into.Write_Entity ("serialNumber", Value.Serial_Number);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TruststoreItems_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TruststoreItems_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "alias", Value.Alias);
      Swagger.Streams.Deserialize (Object, "entryType", Value.Entry_Type);
      Swagger.Streams.Deserialize (Object, "subject", Value.Subject);
      Swagger.Streams.Deserialize (Object, "issuer", Value.Issuer);
      Swagger.Streams.Deserialize (Object, "notBefore", Value.Not_Before);
      Swagger.Streams.Deserialize (Object, "notAfter", Value.Not_After);
      Swagger.Streams.Deserialize (Object, "serialNumber", Value.Serial_Number);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TruststoreItems_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TruststoreItems_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TruststoreInfo_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "aliases", Value.Aliases);
      Into.Write_Entity ("exists", Value.Exists);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TruststoreInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TruststoreInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "aliases", Value.Aliases);
      Swagger.Streams.Deserialize (Object, "exists", Value.Exists);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TruststoreInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TruststoreInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreChainItems_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("subject", Value.Subject);
      Into.Write_Entity ("issuer", Value.Issuer);
      Into.Write_Entity ("notBefore", Value.Not_Before);
      Into.Write_Entity ("notAfter", Value.Not_After);
      Into.Write_Entity ("serialNumber", Value.Serial_Number);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreChainItems_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreChainItems_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "subject", Value.Subject);
      Swagger.Streams.Deserialize (Object, "issuer", Value.Issuer);
      Swagger.Streams.Deserialize (Object, "notBefore", Value.Not_Before);
      Swagger.Streams.Deserialize (Object, "notAfter", Value.Not_After);
      Swagger.Streams.Deserialize (Object, "serialNumber", Value.Serial_Number);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreChainItems_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : KeystoreChainItems_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreItems_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("alias", Value.Alias);
      Into.Write_Entity ("entryType", Value.Entry_Type);
      Into.Write_Entity ("algorithm", Value.Algorithm);
      Into.Write_Entity ("format", Value.Format);
      Serialize (Into, "chain", Value.Chain);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreItems_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreItems_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "alias", Value.Alias);
      Swagger.Streams.Deserialize (Object, "entryType", Value.Entry_Type);
      Swagger.Streams.Deserialize (Object, "algorithm", Value.Algorithm);
      Swagger.Streams.Deserialize (Object, "format", Value.Format);
      Deserialize (Object, "chain", Value.Chain);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreItems_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : KeystoreItems_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreInfo_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "aliases", Value.Aliases);
      Into.Write_Entity ("exists", Value.Exists);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in KeystoreInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "aliases", Value.Aliases);
      Swagger.Streams.Deserialize (Object, "exists", Value.Exists);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out KeystoreInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : KeystoreInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsArray_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("optional", Value.Optional);
      Into.Write_Entity ("is_set", Value.Is_Set);
      Into.Write_Entity ("type", Value.P_Type);
      Serialize (Into, "values", Value.Values);
      Into.Write_Entity ("description", Value.Description);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsArray_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsArray_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "optional", Value.Optional);
      Swagger.Streams.Deserialize (Object, "is_set", Value.Is_Set);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "values", Value.Values);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsArray_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationPropertyItemsArray_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsLong_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("optional", Value.Optional);
      Into.Write_Entity ("is_set", Value.Is_Set);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("value", Value.Value);
      Into.Write_Entity ("description", Value.Description);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationPropertyItemsLong_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsLong_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "optional", Value.Optional);
      Swagger.Streams.Deserialize (Object, "is_set", Value.Is_Set);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationPropertyItemsLong_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationPropertyItemsLong_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationProperties_Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "path", Value.Path);
      Serialize (Into, "service.ranking", Value.Service_Ranking);
      Serialize (Into, "idpUrl", Value.Idp_Url);
      Serialize (Into, "idpCertAlias", Value.Idp_Cert_Alias);
      Serialize (Into, "idpHttpRedirect", Value.Idp_Http_Redirect);
      Serialize (Into, "serviceProviderEntityId", Value.Service_Provider_Entity_Id);
      Serialize (Into, "assertionConsumerServiceURL", Value.Assertion_Consumer_Service_URL);
      Serialize (Into, "spPrivateKeyAlias", Value.Sp_Private_Key_Alias);
      Serialize (Into, "keyStorePassword", Value.Key_Store_Password);
      Serialize (Into, "defaultRedirectUrl", Value.Default_Redirect_Url);
      Serialize (Into, "userIDAttribute", Value.User_IDAttribute);
      Serialize (Into, "useEncryption", Value.Use_Encryption);
      Serialize (Into, "createUser", Value.Create_User);
      Serialize (Into, "addGroupMemberships", Value.Add_Group_Memberships);
      Serialize (Into, "groupMembershipAttribute", Value.Group_Membership_Attribute);
      Serialize (Into, "defaultGroups", Value.Default_Groups);
      Serialize (Into, "nameIdFormat", Value.Name_Id_Format);
      Serialize (Into, "synchronizeAttributes", Value.Synchronize_Attributes);
      Serialize (Into, "handleLogout", Value.Handle_Logout);
      Serialize (Into, "logoutUrl", Value.Logout_Url);
      Serialize (Into, "clockTolerance", Value.Clock_Tolerance);
      Serialize (Into, "digestMethod", Value.Digest_Method);
      Serialize (Into, "signatureMethod", Value.Signature_Method);
      Serialize (Into, "userIntermediatePath", Value.User_Intermediate_Path);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationProperties_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationProperties_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Deserialize (Object, "path", Value.Path);
      Deserialize (Object, "service.ranking", Value.Service_Ranking);
      Deserialize (Object, "idpUrl", Value.Idp_Url);
      Deserialize (Object, "idpCertAlias", Value.Idp_Cert_Alias);
      Deserialize (Object, "idpHttpRedirect", Value.Idp_Http_Redirect);
      Deserialize (Object, "serviceProviderEntityId", Value.Service_Provider_Entity_Id);
      Deserialize (Object, "assertionConsumerServiceURL", Value.Assertion_Consumer_Service_URL);
      Deserialize (Object, "spPrivateKeyAlias", Value.Sp_Private_Key_Alias);
      Deserialize (Object, "keyStorePassword", Value.Key_Store_Password);
      Deserialize (Object, "defaultRedirectUrl", Value.Default_Redirect_Url);
      Deserialize (Object, "userIDAttribute", Value.User_IDAttribute);
      Deserialize (Object, "useEncryption", Value.Use_Encryption);
      Deserialize (Object, "createUser", Value.Create_User);
      Deserialize (Object, "addGroupMemberships", Value.Add_Group_Memberships);
      Deserialize (Object, "groupMembershipAttribute", Value.Group_Membership_Attribute);
      Deserialize (Object, "defaultGroups", Value.Default_Groups);
      Deserialize (Object, "nameIdFormat", Value.Name_Id_Format);
      Deserialize (Object, "synchronizeAttributes", Value.Synchronize_Attributes);
      Deserialize (Object, "handleLogout", Value.Handle_Logout);
      Deserialize (Object, "logoutUrl", Value.Logout_Url);
      Deserialize (Object, "clockTolerance", Value.Clock_Tolerance);
      Deserialize (Object, "digestMethod", Value.Digest_Method);
      Deserialize (Object, "signatureMethod", Value.Signature_Method);
      Deserialize (Object, "userIntermediatePath", Value.User_Intermediate_Path);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationProperties_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationProperties_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationInfo_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("pid", Value.Pid);
      Into.Write_Entity ("title", Value.Title);
      Into.Write_Entity ("description", Value.Description);
      Into.Write_Entity ("bundle_location", Value.Bundle_Location);
      Into.Write_Entity ("service_location", Value.Service_Location);
      Serialize (Into, "properties", Value.Properties);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SamlConfigurationInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "pid", Value.Pid);
      Swagger.Streams.Deserialize (Object, "title", Value.Title);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
      Swagger.Streams.Deserialize (Object, "bundle_location", Value.Bundle_Location);
      Swagger.Streams.Deserialize (Object, "service_location", Value.Service_Location);
      Deserialize (Object, "properties", Value.Properties);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SamlConfigurationInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SamlConfigurationInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleDataProp_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("key", Value.Key);
      Into.Write_Entity ("value", Value.Value);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleDataProp_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleDataProp_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "key", Value.Key);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleDataProp_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : BundleDataProp_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleData_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("fragment", Value.Fragment);
      Into.Write_Entity ("stateRaw", Value.State_Raw);
      Into.Write_Entity ("state", Value.State);
      Into.Write_Entity ("version", Value.Version);
      Into.Write_Entity ("symbolicName", Value.Symbolic_Name);
      Into.Write_Entity ("category", Value.Category);
      Serialize (Into, "props", Value.Props);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleData_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleData_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "fragment", Value.Fragment);
      Swagger.Streams.Deserialize (Object, "stateRaw", Value.State_Raw);
      Swagger.Streams.Deserialize (Object, "state", Value.State);
      Swagger.Streams.Deserialize (Object, "version", Value.Version);
      Swagger.Streams.Deserialize (Object, "symbolicName", Value.Symbolic_Name);
      Swagger.Streams.Deserialize (Object, "category", Value.Category);
      Deserialize (Object, "props", Value.Props);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleData_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : BundleData_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleInfo_Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("status", Value.Status);
      Serialize (Into, "s", Value.S);
      Serialize (Into, "data", Value.Data);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in BundleInfo_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleInfo_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "status", Value.Status);
      Swagger.Streams.Deserialize (Object, "s", Value.S);
      Deserialize (Object, "data", Value.Data);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out BundleInfo_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : BundleInfo_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;



end .Models;
