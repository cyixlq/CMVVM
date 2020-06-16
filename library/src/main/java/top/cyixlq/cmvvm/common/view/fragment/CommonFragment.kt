package top.cyixlq.cmvvm.common.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class CommonFragment : AutoDisposeFragment() {

    protected var mRootView: View? = null
    abstract val layoutId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(layoutId, container, false)
        return mRootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mRootView = null
    }
}