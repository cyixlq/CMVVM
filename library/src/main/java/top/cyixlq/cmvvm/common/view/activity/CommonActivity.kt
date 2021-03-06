package top.cyixlq.cmvvm.common.view.activity

import android.os.Bundle

abstract class CommonActivity : AutoDisposeActivity() {

    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }
}