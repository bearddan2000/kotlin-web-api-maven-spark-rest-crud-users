package example.response;

enum class StatusResponse(val status: String = "") {
    SUCCESS("Success")
    , ERROR("Error")
}
