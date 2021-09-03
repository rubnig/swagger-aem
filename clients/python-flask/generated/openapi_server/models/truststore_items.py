# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class TruststoreItems(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, alias=None, entry_type=None, subject=None, issuer=None, not_before=None, not_after=None, serial_number=None):  # noqa: E501
        """TruststoreItems - a model defined in OpenAPI

        :param alias: The alias of this TruststoreItems.  # noqa: E501
        :type alias: str
        :param entry_type: The entry_type of this TruststoreItems.  # noqa: E501
        :type entry_type: str
        :param subject: The subject of this TruststoreItems.  # noqa: E501
        :type subject: str
        :param issuer: The issuer of this TruststoreItems.  # noqa: E501
        :type issuer: str
        :param not_before: The not_before of this TruststoreItems.  # noqa: E501
        :type not_before: str
        :param not_after: The not_after of this TruststoreItems.  # noqa: E501
        :type not_after: str
        :param serial_number: The serial_number of this TruststoreItems.  # noqa: E501
        :type serial_number: int
        """
        self.openapi_types = {
            'alias': str,
            'entry_type': str,
            'subject': str,
            'issuer': str,
            'not_before': str,
            'not_after': str,
            'serial_number': int
        }

        self.attribute_map = {
            'alias': 'alias',
            'entry_type': 'entryType',
            'subject': 'subject',
            'issuer': 'issuer',
            'not_before': 'notBefore',
            'not_after': 'notAfter',
            'serial_number': 'serialNumber'
        }

        self._alias = alias
        self._entry_type = entry_type
        self._subject = subject
        self._issuer = issuer
        self._not_before = not_before
        self._not_after = not_after
        self._serial_number = serial_number

    @classmethod
    def from_dict(cls, dikt) -> 'TruststoreItems':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TruststoreItems of this TruststoreItems.  # noqa: E501
        :rtype: TruststoreItems
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alias(self):
        """Gets the alias of this TruststoreItems.

        Truststore alias name  # noqa: E501

        :return: The alias of this TruststoreItems.
        :rtype: str
        """
        return self._alias

    @alias.setter
    def alias(self, alias):
        """Sets the alias of this TruststoreItems.

        Truststore alias name  # noqa: E501

        :param alias: The alias of this TruststoreItems.
        :type alias: str
        """

        self._alias = alias

    @property
    def entry_type(self):
        """Gets the entry_type of this TruststoreItems.


        :return: The entry_type of this TruststoreItems.
        :rtype: str
        """
        return self._entry_type

    @entry_type.setter
    def entry_type(self, entry_type):
        """Sets the entry_type of this TruststoreItems.


        :param entry_type: The entry_type of this TruststoreItems.
        :type entry_type: str
        """

        self._entry_type = entry_type

    @property
    def subject(self):
        """Gets the subject of this TruststoreItems.

        e.g. \"CN=localhost\"  # noqa: E501

        :return: The subject of this TruststoreItems.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject):
        """Sets the subject of this TruststoreItems.

        e.g. \"CN=localhost\"  # noqa: E501

        :param subject: The subject of this TruststoreItems.
        :type subject: str
        """

        self._subject = subject

    @property
    def issuer(self):
        """Gets the issuer of this TruststoreItems.

        e.g. \"CN=Admin\"  # noqa: E501

        :return: The issuer of this TruststoreItems.
        :rtype: str
        """
        return self._issuer

    @issuer.setter
    def issuer(self, issuer):
        """Sets the issuer of this TruststoreItems.

        e.g. \"CN=Admin\"  # noqa: E501

        :param issuer: The issuer of this TruststoreItems.
        :type issuer: str
        """

        self._issuer = issuer

    @property
    def not_before(self):
        """Gets the not_before of this TruststoreItems.

        e.g. \"Sun Jul 01 12:00:00 AEST 2018\"  # noqa: E501

        :return: The not_before of this TruststoreItems.
        :rtype: str
        """
        return self._not_before

    @not_before.setter
    def not_before(self, not_before):
        """Sets the not_before of this TruststoreItems.

        e.g. \"Sun Jul 01 12:00:00 AEST 2018\"  # noqa: E501

        :param not_before: The not_before of this TruststoreItems.
        :type not_before: str
        """

        self._not_before = not_before

    @property
    def not_after(self):
        """Gets the not_after of this TruststoreItems.

        e.g. \"Sun Jun 30 23:59:50 AEST 2019\"  # noqa: E501

        :return: The not_after of this TruststoreItems.
        :rtype: str
        """
        return self._not_after

    @not_after.setter
    def not_after(self, not_after):
        """Sets the not_after of this TruststoreItems.

        e.g. \"Sun Jun 30 23:59:50 AEST 2019\"  # noqa: E501

        :param not_after: The not_after of this TruststoreItems.
        :type not_after: str
        """

        self._not_after = not_after

    @property
    def serial_number(self):
        """Gets the serial_number of this TruststoreItems.

        18165099476682912368  # noqa: E501

        :return: The serial_number of this TruststoreItems.
        :rtype: int
        """
        return self._serial_number

    @serial_number.setter
    def serial_number(self, serial_number):
        """Sets the serial_number of this TruststoreItems.

        18165099476682912368  # noqa: E501

        :param serial_number: The serial_number of this TruststoreItems.
        :type serial_number: int
        """

        self._serial_number = serial_number
