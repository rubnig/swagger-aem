<?php
/**
 * SamlConfigurationPropertyItemsArray
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
 * Class representing the SamlConfigurationPropertyItemsArray model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class SamlConfigurationPropertyItemsArray 
{
        /**
     * property name
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * True if optional
     *
     * @var bool|null
     * @SerializedName("optional")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $optional;

    /**
     * True if property is set
     *
     * @var bool|null
     * @SerializedName("is_set")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $isSet;

    /**
     * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
     *
     * @var int|null
     * @SerializedName("type")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $type;

    /**
     * Property value
     *
     * @var string[]|null
     * @SerializedName("values")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $values;

    /**
     * Property description
     *
     * @var string|null
     * @SerializedName("description")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $description;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->optional = isset($data['optional']) ? $data['optional'] : null;
        $this->isSet = isset($data['isSet']) ? $data['isSet'] : null;
        $this->type = isset($data['type']) ? $data['type'] : null;
        $this->values = isset($data['values']) ? $data['values'] : null;
        $this->description = isset($data['description']) ? $data['description'] : null;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name  property name
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets optional.
     *
     * @return bool|null
     */
    public function isOptional()
    {
        return $this->optional;
    }

    /**
     * Sets optional.
     *
     * @param bool|null $optional  True if optional
     *
     * @return $this
     */
    public function setOptional($optional = null)
    {
        $this->optional = $optional;

        return $this;
    }

    /**
     * Gets isSet.
     *
     * @return bool|null
     */
    public function isIsSet()
    {
        return $this->isSet;
    }

    /**
     * Sets isSet.
     *
     * @param bool|null $isSet  True if property is set
     *
     * @return $this
     */
    public function setIsSet($isSet = null)
    {
        $this->isSet = $isSet;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return int|null
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Sets type.
     *
     * @param int|null $type  Property type, 1=String, 3=long, 11=boolean, 12=Password
     *
     * @return $this
     */
    public function setType($type = null)
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets values.
     *
     * @return string[]|null
     */
    public function getValues(): ?array
    {
        return $this->values;
    }

    /**
     * Sets values.
     *
     * @param string[]|null $values  Property value
     *
     * @return $this
     */
    public function setValues(array $values = null)
    {
        $this->values = $values;

        return $this;
    }

    /**
     * Gets description.
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Sets description.
     *
     * @param string|null $description  Property description
     *
     * @return $this
     */
    public function setDescription($description = null)
    {
        $this->description = $description;

        return $this;
    }
}


