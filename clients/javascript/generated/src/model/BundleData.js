/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BundleDataProp from './BundleDataProp';

/**
 * The BundleData model module.
 * @module model/BundleData
 * @version 0.9.0
 */
class BundleData {
    /**
     * Constructs a new <code>BundleData</code>.
     * @alias module:model/BundleData
     */
    constructor() { 
        
        BundleData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BundleData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BundleData} obj Optional instance to populate.
     * @return {module:model/BundleData} The populated <code>BundleData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BundleData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('fragment')) {
                obj['fragment'] = ApiClient.convertToType(data['fragment'], 'Boolean');
            }
            if (data.hasOwnProperty('stateRaw')) {
                obj['stateRaw'] = ApiClient.convertToType(data['stateRaw'], 'Number');
            }
            if (data.hasOwnProperty('state')) {
                obj['state'] = ApiClient.convertToType(data['state'], 'String');
            }
            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('symbolicName')) {
                obj['symbolicName'] = ApiClient.convertToType(data['symbolicName'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('props')) {
                obj['props'] = ApiClient.convertToType(data['props'], [BundleDataProp]);
            }
        }
        return obj;
    }


}

/**
 * Bundle ID
 * @member {Number} id
 */
BundleData.prototype['id'] = undefined;

/**
 * Bundle name
 * @member {String} name
 */
BundleData.prototype['name'] = undefined;

/**
 * Is bundle a fragment
 * @member {Boolean} fragment
 */
BundleData.prototype['fragment'] = undefined;

/**
 * Numeric raw bundle state value
 * @member {Number} stateRaw
 */
BundleData.prototype['stateRaw'] = undefined;

/**
 * Bundle state value
 * @member {String} state
 */
BundleData.prototype['state'] = undefined;

/**
 * Bundle version
 * @member {String} version
 */
BundleData.prototype['version'] = undefined;

/**
 * Bundle symbolic name
 * @member {String} symbolicName
 */
BundleData.prototype['symbolicName'] = undefined;

/**
 * Bundle category
 * @member {String} category
 */
BundleData.prototype['category'] = undefined;

/**
 * @member {Array.<module:model/BundleDataProp>} props
 */
BundleData.prototype['props'] = undefined;






export default BundleData;

