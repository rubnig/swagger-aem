#import <Foundation/Foundation.h>
#import "OAIObject.h"

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
*/


#import "OAIKeystoreItems.h"
@protocol OAIKeystoreItems;
@class OAIKeystoreItems;



@protocol OAIKeystoreInfo
@end

@interface OAIKeystoreInfo : OAIObject


@property(nonatomic) NSArray<OAIKeystoreItems>* aliases;
/* False if truststore don't exist [optional]
 */
@property(nonatomic) NSNumber* exists;

@end
