--[[
  Adobe Experience Manager (AEM) API
 
  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 
  The version of the OpenAPI document: 3.5.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- bundle_data class
local bundle_data = {}
local bundle_data_mt = {
	__name = "bundle_data";
	__index = bundle_data;
}

local function cast_bundle_data(t)
	return setmetatable(t, bundle_data_mt)
end

local function new_bundle_data(id, name, fragment, state_raw, state, version, symbolic_name, category, props)
	return cast_bundle_data({
		["id"] = id;
		["name"] = name;
		["fragment"] = fragment;
		["stateRaw"] = state_raw;
		["state"] = state;
		["version"] = version;
		["symbolicName"] = symbolic_name;
		["category"] = category;
		["props"] = props;
	})
end

return {
	cast = cast_bundle_data;
	new = new_bundle_data;
}
