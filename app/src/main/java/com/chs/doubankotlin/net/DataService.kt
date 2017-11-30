package com.chs.doubankotlin.net

import com.chs.doubankotlin.module.bean.Home
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  作者：chs on 2017-11-28 16:57
 * 邮箱：657083984@qq.com
 */
interface DataService{

    //获取热门电影
    @GET("in_theaters")
    fun getHeatMovie(@Query("start") start: Int, @Query("count") count: Int): Observable<Home>

    //获取即将上映的电影
    @GET("coming_soon")
     fun getComingMovie(@Query("start") start: Int, @Query("count") count: Int): Observable<Home>

    //排行前250
    @GET("top250")
    fun getTop250(@Query("start") start: Int,
                          @Query("count") count: Int): Observable<Home>
    //周榜单
    @GET("weekly")
    fun getWeekly(@Query("start") start: Int,
                          @Query("count") count: Int): Observable<Home>

}