package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public interface DefaultApiService {
      Response deleteNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext)
      throws NotFoundException;
      Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext)
      throws NotFoundException;
      Response getNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response postAuthorizableKeystore(MultipartFormDataInput input,String intermediatePath,String authorizableId,String colonOperation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,SecurityContext securityContext)
      throws NotFoundException;
      Response postNode(MultipartFormDataInput input,String path,String name,String colonOperation,String deleteAuthorizable,SecurityContext securityContext)
      throws NotFoundException;
      Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext)
      throws NotFoundException;
      Response postPath(String path,String jcrColonPrimaryType,String colonName,SecurityContext securityContext)
      throws NotFoundException;
}
