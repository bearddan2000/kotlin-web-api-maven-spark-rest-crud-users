package example.response;

import com.google.gson.JsonElement;

data class StandardResponse(var status: StatusResponse? = null
, var message: String  = ""
, var data: JsonElement? = null ) {}
