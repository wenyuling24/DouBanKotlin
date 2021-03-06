package com.chs.doubankotlin.ui.find

import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.module.bean.Find

/**
 *  作者：chs on 2017-11-30 14:12
 * 邮箱：657083984@qq.com
 */
interface FindContract{
    interface View : BaseContract.View{
        fun setData(bean : Find)
        fun showLoading()
    }
    interface Presenter : BaseContract.Presenter{

    }
}