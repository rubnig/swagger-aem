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
    /// TruststoreItems
    /// </summary>
    [DataContract]
    public partial class TruststoreItems :  IEquatable<TruststoreItems>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TruststoreItems" /> class.
        /// </summary>
        /// <param name="alias">Truststore alias name.</param>
        /// <param name="entryType">entryType.</param>
        /// <param name="subject">e.g. \&quot;CN&#x3D;localhost\&quot;.</param>
        /// <param name="issuer">e.g. \&quot;CN&#x3D;Admin\&quot;.</param>
        /// <param name="notBefore">e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;.</param>
        /// <param name="notAfter">e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;.</param>
        /// <param name="serialNumber">18165099476682912368.</param>
        public TruststoreItems(string alias = default(string), string entryType = default(string), string subject = default(string), string issuer = default(string), string notBefore = default(string), string notAfter = default(string), int serialNumber = default(int))
        {
            this.Alias = alias;
            this.EntryType = entryType;
            this.Subject = subject;
            this.Issuer = issuer;
            this.NotBefore = notBefore;
            this.NotAfter = notAfter;
            this.SerialNumber = serialNumber;
        }

        /// <summary>
        /// Truststore alias name
        /// </summary>
        /// <value>Truststore alias name</value>
        [DataMember(Name="alias", EmitDefaultValue=false)]
        public string Alias { get; set; }

        /// <summary>
        /// Gets or Sets EntryType
        /// </summary>
        [DataMember(Name="entryType", EmitDefaultValue=false)]
        public string EntryType { get; set; }

        /// <summary>
        /// e.g. \&quot;CN&#x3D;localhost\&quot;
        /// </summary>
        /// <value>e.g. \&quot;CN&#x3D;localhost\&quot;</value>
        [DataMember(Name="subject", EmitDefaultValue=false)]
        public string Subject { get; set; }

        /// <summary>
        /// e.g. \&quot;CN&#x3D;Admin\&quot;
        /// </summary>
        /// <value>e.g. \&quot;CN&#x3D;Admin\&quot;</value>
        [DataMember(Name="issuer", EmitDefaultValue=false)]
        public string Issuer { get; set; }

        /// <summary>
        /// e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
        /// </summary>
        /// <value>e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;</value>
        [DataMember(Name="notBefore", EmitDefaultValue=false)]
        public string NotBefore { get; set; }

        /// <summary>
        /// e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
        /// </summary>
        /// <value>e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;</value>
        [DataMember(Name="notAfter", EmitDefaultValue=false)]
        public string NotAfter { get; set; }

        /// <summary>
        /// 18165099476682912368
        /// </summary>
        /// <value>18165099476682912368</value>
        [DataMember(Name="serialNumber", EmitDefaultValue=false)]
        public int SerialNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TruststoreItems {\n");
            sb.Append("  Alias: ").Append(Alias).Append("\n");
            sb.Append("  EntryType: ").Append(EntryType).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  NotBefore: ").Append(NotBefore).Append("\n");
            sb.Append("  NotAfter: ").Append(NotAfter).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
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
            return this.Equals(input as TruststoreItems);
        }

        /// <summary>
        /// Returns true if TruststoreItems instances are equal
        /// </summary>
        /// <param name="input">Instance of TruststoreItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TruststoreItems input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Alias == input.Alias ||
                    (this.Alias != null &&
                    this.Alias.Equals(input.Alias))
                ) && 
                (
                    this.EntryType == input.EntryType ||
                    (this.EntryType != null &&
                    this.EntryType.Equals(input.EntryType))
                ) && 
                (
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
                ) && 
                (
                    this.Issuer == input.Issuer ||
                    (this.Issuer != null &&
                    this.Issuer.Equals(input.Issuer))
                ) && 
                (
                    this.NotBefore == input.NotBefore ||
                    (this.NotBefore != null &&
                    this.NotBefore.Equals(input.NotBefore))
                ) && 
                (
                    this.NotAfter == input.NotAfter ||
                    (this.NotAfter != null &&
                    this.NotAfter.Equals(input.NotAfter))
                ) && 
                (
                    this.SerialNumber == input.SerialNumber ||
                    (this.SerialNumber != null &&
                    this.SerialNumber.Equals(input.SerialNumber))
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
                if (this.Alias != null)
                    hashCode = hashCode * 59 + this.Alias.GetHashCode();
                if (this.EntryType != null)
                    hashCode = hashCode * 59 + this.EntryType.GetHashCode();
                if (this.Subject != null)
                    hashCode = hashCode * 59 + this.Subject.GetHashCode();
                if (this.Issuer != null)
                    hashCode = hashCode * 59 + this.Issuer.GetHashCode();
                if (this.NotBefore != null)
                    hashCode = hashCode * 59 + this.NotBefore.GetHashCode();
                if (this.NotAfter != null)
                    hashCode = hashCode * 59 + this.NotAfter.GetHashCode();
                if (this.SerialNumber != null)
                    hashCode = hashCode * 59 + this.SerialNumber.GetHashCode();
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
