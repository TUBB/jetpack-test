package io.github.tubb.jetpack.ui.main

class StatusData<D> {
    companion object {
        private const val SUCCESS_CODE: String = "0"
        private const val NET_ERROR_CODE: String = "500"

        fun <D> obtainNetErrorStatusData(ex: Throwable?): StatusData<D> {
            val statusData: StatusData<D> = StatusData()
            statusData.code = NET_ERROR_CODE
            statusData.msg = ex?.message
            return statusData
        }
    }

    var code: String? = ""
    var msg: String? = ""
    var data: D? = null

    fun isSuccess(): Boolean {
        return SUCCESS_CODE == code
    }
}