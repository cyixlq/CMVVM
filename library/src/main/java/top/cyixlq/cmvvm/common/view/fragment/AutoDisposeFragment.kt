package top.cyixlq.cmvvm.common.view.fragment

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider
import top.cyixlq.cmvvm.common.view.IView

abstract class AutoDisposeFragment : Fragment(), IView {
    protected val scopeProvider: AndroidLifecycleScopeProvider by lazy {
        AndroidLifecycleScopeProvider.from(this, Lifecycle.Event.ON_DESTROY)
    }
}