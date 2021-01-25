# coding: utf-8

"""
    Adobe Experience Manager (AEM) API

    Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API  # noqa: E501

    The version of the OpenAPI document: 3.4.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import swaggeraem
from swaggeraem.models.inline_object5 import InlineObject5  # noqa: E501
from swaggeraem.rest import ApiException

class TestInlineObject5(unittest.TestCase):
    """InlineObject5 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test InlineObject5
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = swaggeraem.models.inline_object5.InlineObject5()  # noqa: E501
        if include_optional :
            return InlineObject5(
                privatekey_file = bytes(b'blah'), 
                certificate_file = bytes(b'blah')
            )
        else :
            return InlineObject5(
        )

    def testInlineObject5(self):
        """Test InlineObject5"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()