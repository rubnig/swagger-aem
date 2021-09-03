# Org.OpenAPITools - ASP.NET Core 3.1 Server

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
