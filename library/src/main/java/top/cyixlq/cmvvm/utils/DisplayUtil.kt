package top.cyixlq.cmvvm.utils

import android.content.Context

object DisplayUtil {

    /**
     *  @param context 上下文对象
     *  @return 返回状态栏高度，单位px
     */
    fun getStatusBarHeight(context: Context): Int {
        val resourceId: Int = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) {
            context.resources.getDimension(resourceId).toInt()
        } else 0
    }

    /**
     *  @param context 上下文对象
     *  @return 返回导航栏高度，单位px
     */
    fun getNavBarHeight(context: Context): Int {
        val resourceId = context.resources.getIdentifier("navigation_bar_height", "dimen", "android")
        return if (resourceId != 0) {
            context.resources.getDimensionPixelSize(resourceId)
        } else 0
    }

    /**
     *  @param context 上下文对象
     *  @return 返回屏幕高度，单位px
     */
    fun getScreenHeight(context: Context): Int {
        return context.resources.displayMetrics.heightPixels
    }


    /**
     *  @param context 上下文对象
     *  @return 返回屏幕宽度，单位px
     */
    fun getScreenWidth(context: Context): Int {
        return context.resources.displayMetrics.widthPixels
    }

    fun px2dp(context: Context, pxValue: Float): Int {
        val density = context.resources.displayMetrics.density
        return (pxValue / density + 0.5f).toInt()
    }

    fun dp2px(context: Context, dpValue: Float): Int {
        val density = context.resources.displayMetrics.density
        return (dpValue * density + 0.5f).toInt()
    }

    fun px2sp(context: Context, pxValue: Float): Int {
        val scaleDensity = context.resources.displayMetrics.scaledDensity
        return (pxValue / scaleDensity + 0.5f).toInt()
    }

    fun sp2px(context: Context, spValue: Float): Int {
        val scaleDensity = context.resources.displayMetrics.scaledDensity
        return (spValue * scaleDensity + 0.5f).toInt()
    }

    fun px2pt(context: Context, pxValue: Float): Int {
        val metrics = context.resources.displayMetrics
        return (pxValue * 72 / metrics.xdpi + 0.5).toInt()
    }

    fun pt2px(context: Context, ptValue: Float): Int {
        val metrics = context.resources.displayMetrics
        return (ptValue * metrics.xdpi / 72f + 0.5).toInt()
    }
}