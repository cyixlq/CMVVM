package top.cyixlq.cmvvm.common.view.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider
import top.cyixlq.cmvvm.common.view.IView

abstract class AutoDisposeActivity : AppCompatActivity(), IView {
    protected val scopeProvider: AndroidLifecycleScopeProvider by lazy {
        AndroidLifecycleScopeProvider.from(this, Lifecycle.Event.ON_DESTROY)
    }
}