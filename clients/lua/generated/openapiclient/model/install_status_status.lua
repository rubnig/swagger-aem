--[[
  Adobe Experience Manager (AEM) API
 
  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 
  The version of the OpenAPI document: 3.5.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- install_status_status class
local install_status_status = {}
local install_status_status_mt = {
	__name = "install_status_status";
	__index = install_status_status;
}

local function cast_install_status_status(t)
	return setmetatable(t, install_status_status_mt)
end

local function new_install_status_status(finished, item_count)
	return cast_install_status_status({
		["finished"] = finished;
		["itemCount"] = item_count;
	})
end

return {
	cast = cast_install_status_status;
	new = new_install_status_status;
}