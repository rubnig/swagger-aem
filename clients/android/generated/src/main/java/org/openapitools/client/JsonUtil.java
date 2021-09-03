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

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("BundleData".equalsIgnoreCase(className)) {
      return new TypeToken<List<BundleData>>(){}.getType();
    }
    
    if ("BundleDataProp".equalsIgnoreCase(className)) {
      return new TypeToken<List<BundleDataProp>>(){}.getType();
    }
    
    if ("BundleInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<BundleInfo>>(){}.getType();
    }
    
    if ("InstallStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<InstallStatus>>(){}.getType();
    }
    
    if ("InstallStatusStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<InstallStatusStatus>>(){}.getType();
    }
    
    if ("KeystoreChainItems".equalsIgnoreCase(className)) {
      return new TypeToken<List<KeystoreChainItems>>(){}.getType();
    }
    
    if ("KeystoreInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<KeystoreInfo>>(){}.getType();
    }
    
    if ("KeystoreItems".equalsIgnoreCase(className)) {
      return new TypeToken<List<KeystoreItems>>(){}.getType();
    }
    
    if ("SamlConfigurationInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationInfo>>(){}.getType();
    }
    
    if ("SamlConfigurationProperties".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationProperties>>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationPropertyItemsArray>>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationPropertyItemsBoolean>>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsLong".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationPropertyItemsLong>>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsString".equalsIgnoreCase(className)) {
      return new TypeToken<List<SamlConfigurationPropertyItemsString>>(){}.getType();
    }
    
    if ("TruststoreInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<TruststoreInfo>>(){}.getType();
    }
    
    if ("TruststoreItems".equalsIgnoreCase(className)) {
      return new TypeToken<List<TruststoreItems>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("BundleData".equalsIgnoreCase(className)) {
      return new TypeToken<BundleData>(){}.getType();
    }
    
    if ("BundleDataProp".equalsIgnoreCase(className)) {
      return new TypeToken<BundleDataProp>(){}.getType();
    }
    
    if ("BundleInfo".equalsIgnoreCase(className)) {
      return new TypeToken<BundleInfo>(){}.getType();
    }
    
    if ("InstallStatus".equalsIgnoreCase(className)) {
      return new TypeToken<InstallStatus>(){}.getType();
    }
    
    if ("InstallStatusStatus".equalsIgnoreCase(className)) {
      return new TypeToken<InstallStatusStatus>(){}.getType();
    }
    
    if ("KeystoreChainItems".equalsIgnoreCase(className)) {
      return new TypeToken<KeystoreChainItems>(){}.getType();
    }
    
    if ("KeystoreInfo".equalsIgnoreCase(className)) {
      return new TypeToken<KeystoreInfo>(){}.getType();
    }
    
    if ("KeystoreItems".equalsIgnoreCase(className)) {
      return new TypeToken<KeystoreItems>(){}.getType();
    }
    
    if ("SamlConfigurationInfo".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationInfo>(){}.getType();
    }
    
    if ("SamlConfigurationProperties".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationProperties>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsArray".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationPropertyItemsArray>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationPropertyItemsBoolean>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsLong".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationPropertyItemsLong>(){}.getType();
    }
    
    if ("SamlConfigurationPropertyItemsString".equalsIgnoreCase(className)) {
      return new TypeToken<SamlConfigurationPropertyItemsString>(){}.getType();
    }
    
    if ("TruststoreInfo".equalsIgnoreCase(className)) {
      return new TypeToken<TruststoreInfo>(){}.getType();
    }
    
    if ("TruststoreItems".equalsIgnoreCase(className)) {
      return new TypeToken<TruststoreItems>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
