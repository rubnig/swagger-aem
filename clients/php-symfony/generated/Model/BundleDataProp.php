<?php
/**
 * BundleDataProp
 *
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the BundleDataProp model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class BundleDataProp 
{
        /**
     * Bundle data key
     *
     * @var string|null
     * @SerializedName("key")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $key;

    /**
     * Bundle data value
     *
     * @var string|null
     * @SerializedName("value")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $value;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->key = isset($data['key']) ? $data['key'] : null;
        $this->value = isset($data['value']) ? $data['value'] : null;
    }

    /**
     * Gets key.
     *
     * @return string|null
     */
    public function getKey()
    {
        return $this->key;
    }

    /**
     * Sets key.
     *
     * @param string|null $key  Bundle data key
     *
     * @return $this
     */
    public function setKey($key = null)
    {
        $this->key = $key;

        return $this;
    }

    /**
     * Gets value.
     *
     * @return string|null
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Sets value.
     *
     * @param string|null $value  Bundle data value
     *
     * @return $this
     */
    public function setValue($value = null)
    {
        $this->value = $value;

        return $this;
    }
}


