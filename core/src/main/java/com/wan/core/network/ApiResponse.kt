package com.wan.core.network

import com.wan.core.constant.SUCCESS_CODE

/**
 * 服务端返回数据的格式.
 *
 * 当 [errorCode] 等于 [com.wan.core.constant.SUCCESS_CODE] 时表示成功
 *
 * 但只有转成有状态的 [com.wan.core.Resource] 时才能更好地被使用。
 *
 * @see [com.wan.core.Resource]
 */
data class ApiResponse<T>(
    val errorCode: Int,
    val errorMsg: String?,
    val data: T?
) {
    fun isSuccess(): Boolean {
        return errorCode == SUCCESS_CODE
    }
}