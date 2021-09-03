/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// SamlConfigurationProperties
    /// </summary>
    [DataContract]
    public partial class SamlConfigurationProperties :  IEquatable<SamlConfigurationProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SamlConfigurationProperties" /> class.
        /// </summary>
        /// <param name="path">path.</param>
        /// <param name="serviceRanking">serviceRanking.</param>
        /// <param name="idpUrl">idpUrl.</param>
        /// <param name="idpCertAlias">idpCertAlias.</param>
        /// <param name="idpHttpRedirect">idpHttpRedirect.</param>
        /// <param name="serviceProviderEntityId">serviceProviderEntityId.</param>
        /// <param name="assertionConsumerServiceURL">assertionConsumerServiceURL.</param>
        /// <param name="spPrivateKeyAlias">spPrivateKeyAlias.</param>
        /// <param name="keyStorePassword">keyStorePassword.</param>
        /// <param name="defaultRedirectUrl">defaultRedirectUrl.</param>
        /// <param name="userIDAttribute">userIDAttribute.</param>
        /// <param name="useEncryption">useEncryption.</param>
        /// <param name="createUser">createUser.</param>
        /// <param name="addGroupMemberships">addGroupMemberships.</param>
        /// <param name="groupMembershipAttribute">groupMembershipAttribute.</param>
        /// <param name="defaultGroups">defaultGroups.</param>
        /// <param name="nameIdFormat">nameIdFormat.</param>
        /// <param name="synchronizeAttributes">synchronizeAttributes.</param>
        /// <param name="handleLogout">handleLogout.</param>
        /// <param name="logoutUrl">logoutUrl.</param>
        /// <param name="clockTolerance">clockTolerance.</param>
        /// <param name="digestMethod">digestMethod.</param>
        /// <param name="signatureMethod">signatureMethod.</param>
        /// <param name="userIntermediatePath">userIntermediatePath.</param>
        public SamlConfigurationProperties(SamlConfigurationPropertyItemsArray path = default(SamlConfigurationPropertyItemsArray), SamlConfigurationPropertyItemsLong serviceRanking = default(SamlConfigurationPropertyItemsLong), SamlConfigurationPropertyItemsString idpUrl = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString idpCertAlias = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsBoolean idpHttpRedirect = default(SamlConfigurationPropertyItemsBoolean), SamlConfigurationPropertyItemsString serviceProviderEntityId = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString assertionConsumerServiceURL = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString spPrivateKeyAlias = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString keyStorePassword = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString defaultRedirectUrl = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString userIDAttribute = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsBoolean useEncryption = default(SamlConfigurationPropertyItemsBoolean), SamlConfigurationPropertyItemsBoolean createUser = default(SamlConfigurationPropertyItemsBoolean), SamlConfigurationPropertyItemsBoolean addGroupMemberships = default(SamlConfigurationPropertyItemsBoolean), SamlConfigurationPropertyItemsString groupMembershipAttribute = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsArray defaultGroups = default(SamlConfigurationPropertyItemsArray), SamlConfigurationPropertyItemsString nameIdFormat = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsArray synchronizeAttributes = default(SamlConfigurationPropertyItemsArray), SamlConfigurationPropertyItemsBoolean handleLogout = default(SamlConfigurationPropertyItemsBoolean), SamlConfigurationPropertyItemsString logoutUrl = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsLong clockTolerance = default(SamlConfigurationPropertyItemsLong), SamlConfigurationPropertyItemsString digestMethod = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString signatureMethod = default(SamlConfigurationPropertyItemsString), SamlConfigurationPropertyItemsString userIntermediatePath = default(SamlConfigurationPropertyItemsString))
        {
            this.Path = path;
            this.ServiceRanking = serviceRanking;
            this.IdpUrl = idpUrl;
            this.IdpCertAlias = idpCertAlias;
            this.IdpHttpRedirect = idpHttpRedirect;
            this.ServiceProviderEntityId = serviceProviderEntityId;
            this.AssertionConsumerServiceURL = assertionConsumerServiceURL;
            this.SpPrivateKeyAlias = spPrivateKeyAlias;
            this.KeyStorePassword = keyStorePassword;
            this.DefaultRedirectUrl = defaultRedirectUrl;
            this.UserIDAttribute = userIDAttribute;
            this.UseEncryption = useEncryption;
            this.CreateUser = createUser;
            this.AddGroupMemberships = addGroupMemberships;
            this.GroupMembershipAttribute = groupMembershipAttribute;
            this.DefaultGroups = defaultGroups;
            this.NameIdFormat = nameIdFormat;
            this.SynchronizeAttributes = synchronizeAttributes;
            this.HandleLogout = handleLogout;
            this.LogoutUrl = logoutUrl;
            this.ClockTolerance = clockTolerance;
            this.DigestMethod = digestMethod;
            this.SignatureMethod = signatureMethod;
            this.UserIntermediatePath = userIntermediatePath;
        }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="path", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsArray Path { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRanking
        /// </summary>
        [DataMember(Name="service.ranking", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsLong ServiceRanking { get; set; }

        /// <summary>
        /// Gets or Sets IdpUrl
        /// </summary>
        [DataMember(Name="idpUrl", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString IdpUrl { get; set; }

        /// <summary>
        /// Gets or Sets IdpCertAlias
        /// </summary>
        [DataMember(Name="idpCertAlias", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString IdpCertAlias { get; set; }

        /// <summary>
        /// Gets or Sets IdpHttpRedirect
        /// </summary>
        [DataMember(Name="idpHttpRedirect", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsBoolean IdpHttpRedirect { get; set; }

        /// <summary>
        /// Gets or Sets ServiceProviderEntityId
        /// </summary>
        [DataMember(Name="serviceProviderEntityId", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString ServiceProviderEntityId { get; set; }

        /// <summary>
        /// Gets or Sets AssertionConsumerServiceURL
        /// </summary>
        [DataMember(Name="assertionConsumerServiceURL", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString AssertionConsumerServiceURL { get; set; }

        /// <summary>
        /// Gets or Sets SpPrivateKeyAlias
        /// </summary>
        [DataMember(Name="spPrivateKeyAlias", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString SpPrivateKeyAlias { get; set; }

        /// <summary>
        /// Gets or Sets KeyStorePassword
        /// </summary>
        [DataMember(Name="keyStorePassword", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString KeyStorePassword { get; set; }

        /// <summary>
        /// Gets or Sets DefaultRedirectUrl
        /// </summary>
        [DataMember(Name="defaultRedirectUrl", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString DefaultRedirectUrl { get; set; }

        /// <summary>
        /// Gets or Sets UserIDAttribute
        /// </summary>
        [DataMember(Name="userIDAttribute", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString UserIDAttribute { get; set; }

        /// <summary>
        /// Gets or Sets UseEncryption
        /// </summary>
        [DataMember(Name="useEncryption", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsBoolean UseEncryption { get; set; }

        /// <summary>
        /// Gets or Sets CreateUser
        /// </summary>
        [DataMember(Name="createUser", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsBoolean CreateUser { get; set; }

        /// <summary>
        /// Gets or Sets AddGroupMemberships
        /// </summary>
        [DataMember(Name="addGroupMemberships", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsBoolean AddGroupMemberships { get; set; }

        /// <summary>
        /// Gets or Sets GroupMembershipAttribute
        /// </summary>
        [DataMember(Name="groupMembershipAttribute", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString GroupMembershipAttribute { get; set; }

        /// <summary>
        /// Gets or Sets DefaultGroups
        /// </summary>
        [DataMember(Name="defaultGroups", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsArray DefaultGroups { get; set; }

        /// <summary>
        /// Gets or Sets NameIdFormat
        /// </summary>
        [DataMember(Name="nameIdFormat", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString NameIdFormat { get; set; }

        /// <summary>
        /// Gets or Sets SynchronizeAttributes
        /// </summary>
        [DataMember(Name="synchronizeAttributes", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsArray SynchronizeAttributes { get; set; }

        /// <summary>
        /// Gets or Sets HandleLogout
        /// </summary>
        [DataMember(Name="handleLogout", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsBoolean HandleLogout { get; set; }

        /// <summary>
        /// Gets or Sets LogoutUrl
        /// </summary>
        [DataMember(Name="logoutUrl", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString LogoutUrl { get; set; }

        /// <summary>
        /// Gets or Sets ClockTolerance
        /// </summary>
        [DataMember(Name="clockTolerance", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsLong ClockTolerance { get; set; }

        /// <summary>
        /// Gets or Sets DigestMethod
        /// </summary>
        [DataMember(Name="digestMethod", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString DigestMethod { get; set; }

        /// <summary>
        /// Gets or Sets SignatureMethod
        /// </summary>
        [DataMember(Name="signatureMethod", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString SignatureMethod { get; set; }

        /// <summary>
        /// Gets or Sets UserIntermediatePath
        /// </summary>
        [DataMember(Name="userIntermediatePath", EmitDefaultValue=false)]
        public SamlConfigurationPropertyItemsString UserIntermediatePath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SamlConfigurationProperties {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
            sb.Append("  IdpUrl: ").Append(IdpUrl).Append("\n");
            sb.Append("  IdpCertAlias: ").Append(IdpCertAlias).Append("\n");
            sb.Append("  IdpHttpRedirect: ").Append(IdpHttpRedirect).Append("\n");
            sb.Append("  ServiceProviderEntityId: ").Append(ServiceProviderEntityId).Append("\n");
            sb.Append("  AssertionConsumerServiceURL: ").Append(AssertionConsumerServiceURL).Append("\n");
            sb.Append("  SpPrivateKeyAlias: ").Append(SpPrivateKeyAlias).Append("\n");
            sb.Append("  KeyStorePassword: ").Append(KeyStorePassword).Append("\n");
            sb.Append("  DefaultRedirectUrl: ").Append(DefaultRedirectUrl).Append("\n");
            sb.Append("  UserIDAttribute: ").Append(UserIDAttribute).Append("\n");
            sb.Append("  UseEncryption: ").Append(UseEncryption).Append("\n");
            sb.Append("  CreateUser: ").Append(CreateUser).Append("\n");
            sb.Append("  AddGroupMemberships: ").Append(AddGroupMemberships).Append("\n");
            sb.Append("  GroupMembershipAttribute: ").Append(GroupMembershipAttribute).Append("\n");
            sb.Append("  DefaultGroups: ").Append(DefaultGroups).Append("\n");
            sb.Append("  NameIdFormat: ").Append(NameIdFormat).Append("\n");
            sb.Append("  SynchronizeAttributes: ").Append(SynchronizeAttributes).Append("\n");
            sb.Append("  HandleLogout: ").Append(HandleLogout).Append("\n");
            sb.Append("  LogoutUrl: ").Append(LogoutUrl).Append("\n");
            sb.Append("  ClockTolerance: ").Append(ClockTolerance).Append("\n");
            sb.Append("  DigestMethod: ").Append(DigestMethod).Append("\n");
            sb.Append("  SignatureMethod: ").Append(SignatureMethod).Append("\n");
            sb.Append("  UserIntermediatePath: ").Append(UserIntermediatePath).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SamlConfigurationProperties);
        }

        /// <summary>
        /// Returns true if SamlConfigurationProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of SamlConfigurationProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SamlConfigurationProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.ServiceRanking == input.ServiceRanking ||
                    (this.ServiceRanking != null &&
                    this.ServiceRanking.Equals(input.ServiceRanking))
                ) && 
                (
                    this.IdpUrl == input.IdpUrl ||
                    (this.IdpUrl != null &&
                    this.IdpUrl.Equals(input.IdpUrl))
                ) && 
                (
                    this.IdpCertAlias == input.IdpCertAlias ||
                    (this.IdpCertAlias != null &&
                    this.IdpCertAlias.Equals(input.IdpCertAlias))
                ) && 
                (
                    this.IdpHttpRedirect == input.IdpHttpRedirect ||
                    (this.IdpHttpRedirect != null &&
                    this.IdpHttpRedirect.Equals(input.IdpHttpRedirect))
                ) && 
                (
                    this.ServiceProviderEntityId == input.ServiceProviderEntityId ||
                    (this.ServiceProviderEntityId != null &&
                    this.ServiceProviderEntityId.Equals(input.ServiceProviderEntityId))
                ) && 
                (
                    this.AssertionConsumerServiceURL == input.AssertionConsumerServiceURL ||
                    (this.AssertionConsumerServiceURL != null &&
                    this.AssertionConsumerServiceURL.Equals(input.AssertionConsumerServiceURL))
                ) && 
                (
                    this.SpPrivateKeyAlias == input.SpPrivateKeyAlias ||
                    (this.SpPrivateKeyAlias != null &&
                    this.SpPrivateKeyAlias.Equals(input.SpPrivateKeyAlias))
                ) && 
                (
                    this.KeyStorePassword == input.KeyStorePassword ||
                    (this.KeyStorePassword != null &&
                    this.KeyStorePassword.Equals(input.KeyStorePassword))
                ) && 
                (
                    this.DefaultRedirectUrl == input.DefaultRedirectUrl ||
                    (this.DefaultRedirectUrl != null &&
                    this.DefaultRedirectUrl.Equals(input.DefaultRedirectUrl))
                ) && 
                (
                    this.UserIDAttribute == input.UserIDAttribute ||
                    (this.UserIDAttribute != null &&
                    this.UserIDAttribute.Equals(input.UserIDAttribute))
                ) && 
                (
                    this.UseEncryption == input.UseEncryption ||
                    (this.UseEncryption != null &&
                    this.UseEncryption.Equals(input.UseEncryption))
                ) && 
                (
                    this.CreateUser == input.CreateUser ||
                    (this.CreateUser != null &&
                    this.CreateUser.Equals(input.CreateUser))
                ) && 
                (
                    this.AddGroupMemberships == input.AddGroupMemberships ||
                    (this.AddGroupMemberships != null &&
                    this.AddGroupMemberships.Equals(input.AddGroupMemberships))
                ) && 
                (
                    this.GroupMembershipAttribute == input.GroupMembershipAttribute ||
                    (this.GroupMembershipAttribute != null &&
                    this.GroupMembershipAttribute.Equals(input.GroupMembershipAttribute))
                ) && 
                (
                    this.DefaultGroups == input.DefaultGroups ||
                    (this.DefaultGroups != null &&
                    this.DefaultGroups.Equals(input.DefaultGroups))
                ) && 
                (
                    this.NameIdFormat == input.NameIdFormat ||
                    (this.NameIdFormat != null &&
                    this.NameIdFormat.Equals(input.NameIdFormat))
                ) && 
                (
                    this.SynchronizeAttributes == input.SynchronizeAttributes ||
                    (this.SynchronizeAttributes != null &&
                    this.SynchronizeAttributes.Equals(input.SynchronizeAttributes))
                ) && 
                (
                    this.HandleLogout == input.HandleLogout ||
                    (this.HandleLogout != null &&
                    this.HandleLogout.Equals(input.HandleLogout))
                ) && 
                (
                    this.LogoutUrl == input.LogoutUrl ||
                    (this.LogoutUrl != null &&
                    this.LogoutUrl.Equals(input.LogoutUrl))
                ) && 
                (
                    this.ClockTolerance == input.ClockTolerance ||
                    (this.ClockTolerance != null &&
                    this.ClockTolerance.Equals(input.ClockTolerance))
                ) && 
                (
                    this.DigestMethod == input.DigestMethod ||
                    (this.DigestMethod != null &&
                    this.DigestMethod.Equals(input.DigestMethod))
                ) && 
                (
                    this.SignatureMethod == input.SignatureMethod ||
                    (this.SignatureMethod != null &&
                    this.SignatureMethod.Equals(input.SignatureMethod))
                ) && 
                (
                    this.UserIntermediatePath == input.UserIntermediatePath ||
                    (this.UserIntermediatePath != null &&
                    this.UserIntermediatePath.Equals(input.UserIntermediatePath))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.ServiceRanking != null)
                    hashCode = hashCode * 59 + this.ServiceRanking.GetHashCode();
                if (this.IdpUrl != null)
                    hashCode = hashCode * 59 + this.IdpUrl.GetHashCode();
                if (this.IdpCertAlias != null)
                    hashCode = hashCode * 59 + this.IdpCertAlias.GetHashCode();
                if (this.IdpHttpRedirect != null)
                    hashCode = hashCode * 59 + this.IdpHttpRedirect.GetHashCode();
                if (this.ServiceProviderEntityId != null)
                    hashCode = hashCode * 59 + this.ServiceProviderEntityId.GetHashCode();
                if (this.AssertionConsumerServiceURL != null)
                    hashCode = hashCode * 59 + this.AssertionConsumerServiceURL.GetHashCode();
                if (this.SpPrivateKeyAlias != null)
                    hashCode = hashCode * 59 + this.SpPrivateKeyAlias.GetHashCode();
                if (this.KeyStorePassword != null)
                    hashCode = hashCode * 59 + this.KeyStorePassword.GetHashCode();
                if (this.DefaultRedirectUrl != null)
                    hashCode = hashCode * 59 + this.DefaultRedirectUrl.GetHashCode();
                if (this.UserIDAttribute != null)
                    hashCode = hashCode * 59 + this.UserIDAttribute.GetHashCode();
                if (this.UseEncryption != null)
                    hashCode = hashCode * 59 + this.UseEncryption.GetHashCode();
                if (this.CreateUser != null)
                    hashCode = hashCode * 59 + this.CreateUser.GetHashCode();
                if (this.AddGroupMemberships != null)
                    hashCode = hashCode * 59 + this.AddGroupMemberships.GetHashCode();
                if (this.GroupMembershipAttribute != null)
                    hashCode = hashCode * 59 + this.GroupMembershipAttribute.GetHashCode();
                if (this.DefaultGroups != null)
                    hashCode = hashCode * 59 + this.DefaultGroups.GetHashCode();
                if (this.NameIdFormat != null)
                    hashCode = hashCode * 59 + this.NameIdFormat.GetHashCode();
                if (this.SynchronizeAttributes != null)
                    hashCode = hashCode * 59 + this.SynchronizeAttributes.GetHashCode();
                if (this.HandleLogout != null)
                    hashCode = hashCode * 59 + this.HandleLogout.GetHashCode();
                if (this.LogoutUrl != null)
                    hashCode = hashCode * 59 + this.LogoutUrl.GetHashCode();
                if (this.ClockTolerance != null)
                    hashCode = hashCode * 59 + this.ClockTolerance.GetHashCode();
                if (this.DigestMethod != null)
                    hashCode = hashCode * 59 + this.DigestMethod.GetHashCode();
                if (this.SignatureMethod != null)
                    hashCode = hashCode * 59 + this.SignatureMethod.GetHashCode();
                if (this.UserIntermediatePath != null)
                    hashCode = hashCode * 59 + this.UserIntermediatePath.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
